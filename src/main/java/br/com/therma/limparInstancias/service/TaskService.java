package br.com.therma.limparInstancias.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.therma.limparInstacias.model.Task;
import br.com.therma.limparInstancias.utils.IgnoreCertificateUtil;
import br.com.therma.limparInstancias.utils.ListTaskRemoval;
@Service
public class TaskService {

	//    @Autowired
	//    ListTaskRemoval ListTaskRemoval;

	public List<Task> obterTarefas(String dominioUrl, String activityId, String tenantId) {
		if(activityId.equals("LimpezaBK")) {
			List<Task> obterTarefas = obterTarefas(dominioUrl);
			System.out.println("Tamanho da lista  = " + obterTarefas.size());
			return obterTarefas;
		}else {
			System.out.println("Entrou no service");
			RestTemplate rt = IgnoreCertificateUtil.getRestTemplate();
			String requestUrl = dominioUrl + "/engine-rest/task?taskDefinitionKey="+ activityId;
			System.out.println(requestUrl);
			ResponseEntity<List<Task>> response = null;
			try {
				response = rt.exchange(
						requestUrl,
						HttpMethod.GET,
						null,
						new ParameterizedTypeReference<List<Task>>(){});
			} catch (Exception e) {
				System.out.println("[STATUS] Não existem tarefas com instâncias abertas.");
				return null;
			}
			List<Task> allTasks = response.getBody();
			List<Task> tasks = new ArrayList<>();
			for (Task task : allTasks) {
				if(task.getTenantId().equals(tenantId)) {
					if(isDatelowerThenJune(task.getCreated())) {
						tasks.add(task);
					}
				}
			}

			return tasks;
		}
	}

	public List<Task> obterTarefas(String dominioUrl) {
		ListTaskRemoval ListTaskRemoval = new ListTaskRemoval();
		List<String> pegList = ListTaskRemoval.getPEgList();
		List<Task> allTasks = new ArrayList<>();
		for(String businessKey : pegList) {
			String requestUrl = dominioUrl + "/engine-rest/task?processInstanceBusinessKey="+ businessKey;
			ResponseEntity<List<Task>> response = null;
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			CloseableHttpClient httpClient = HttpClients.custom().setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE).build();
			HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
			requestFactory.setHttpClient(httpClient);
			RestTemplate restTemplate = new RestTemplate(requestFactory);
			try {
				@SuppressWarnings("unused")
				ResponseEntity<List<Task>> responseCamunda = restTemplate.exchange(
						requestUrl,
						HttpMethod.GET,
						null,
						new ParameterizedTypeReference<List<Task>>(){});
				if(!responseCamunda.getBody().isEmpty()) {
					Task task = (Task) responseCamunda.getBody().get(0);
					allTasks.add(task);
				}

			} catch (Exception e) {
				System.out.println("[STATUS] Não existem tarefas com instâncias abertas." + e.getMessage());
				return null;
			}
		}


		return allTasks;
	}

	public boolean isDatelowerThenJune(String createdAt) {
		System.out.println(createdAt);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.sss");
		String dateStringLimit = "2019-11-01T00:00:00.000";
		String dateInString = createdAt.substring(0, 23);
		try {
			Date dateLimit = formatter.parse(dateStringLimit);
			Date dateCreatedAt = formatter.parse(dateInString);
			if(dateCreatedAt.before(dateLimit)) {
				return Boolean.TRUE;
			}

		}catch (ParseException e) {
			e.printStackTrace();
		}
		return Boolean.FALSE;
	}

}