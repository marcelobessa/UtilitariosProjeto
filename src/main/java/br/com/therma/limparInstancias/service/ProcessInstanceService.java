package br.com.therma.limparInstancias.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.therma.limparInstacias.model.ByCsv;
import br.com.therma.limparInstacias.model.Task;
import br.com.therma.limparInstancias.utils.IgnoreCertificateUtil;

@Service
public class ProcessInstanceService {

	public void excluirInstancias(List<Task> tasks, String dominioUrl) {
		int contador = 0;
		for (Task task : tasks) {
				String deleteUrl = dominioUrl + "/engine-rest/process-instance/" + task.getProcessInstanceId();
				RestTemplate rt = IgnoreCertificateUtil.getRestTemplate();
				try {
					rt.delete(deleteUrl);
					
				} catch (Exception e) {
					System.out.println("Erro na exclusão... " + e.getMessage() );
				}
				contador++;
		}
		System.out.println("[STATUS] Foram excluídas " + contador + " instâncias");
	}
	
//	public String getT

	public void excluirInstanciasCSV(List<ByCsv> processInstances, String dominioUrl) {
		int contador = 0;
		for (ByCsv processInstance : processInstances) {
			String deleteUrl = dominioUrl + "/engine-rest/process-instance/" + processInstance.getProcId();
			RestTemplate rt = IgnoreCertificateUtil.getRestTemplate();
			try {
				rt.delete(deleteUrl); 

				contador++;
			} catch (Exception e) {
				System.out.println("[STATUS] A instancia " + processInstance + " nao existe.");
			}
		}
		System.out.println("[STATUS] Foram excluídas " + contador + " instâncias");
	}

}