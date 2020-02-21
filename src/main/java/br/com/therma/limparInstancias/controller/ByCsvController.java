package br.com.therma.limparInstancias.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.com.therma.limparInstacias.model.ByCsv;
import br.com.therma.limparInstacias.model.EMMA_COBJECTs;
import br.com.therma.limparInstacias.model.LocationResultDTO;
import br.com.therma.limparInstacias.model.MeterReadings;
import br.com.therma.limparInstacias.model.Meters;
import br.com.therma.limparInstacias.model.NotificationHeaders;
import br.com.therma.limparInstacias.model.Search_CaseCats;
import br.com.therma.limparInstacias.model.StartAutoMainCall;
import br.com.therma.limparInstacias.model.Units;
import br.com.therma.limparInstacias.model.WorkOrders;
import br.com.therma.limparInstancias.service.CSVService;
import br.com.therma.limparInstancias.service.ProcessInstanceService;

@Controller
public class ByCsvController {

	@Autowired
	private CSVService csvService; 

	@Autowired
	private ProcessInstanceService processInstanceService;

	@GetMapping("/byCsv")
	public String telaByCSV() {
		return "byCsv";
	}
	
	@PostMapping("/uploadFile")
	public String uploadFile(@RequestParam("file") MultipartFile file, @RequestParam("url") String url) {
		try {
			List<ByCsv> dadosCsv = csvService.processInstances(file.getInputStream());
			System.out.println(dadosCsv.toString());
			System.out.println(url);
			processInstanceService.excluirInstanciasCSV(dadosCsv, url);
		} catch (IOException e) {
			System.out.println("Problema na leitura do Arquivo");
		} 
		return "redirect:/";
	}
	
	@PostMapping("/test")
	public ResponseEntity<String> myTest(@RequestParam("processInstanceId") String processInstanceIdParam) {
			System.out.println(processInstanceIdParam);
			return new ResponseEntity<String>(processInstanceIdParam, HttpStatus.OK);
	}
	@PostMapping("/test/body")
	public ResponseEntity<String> myTestWithBody(@RequestParam("processInstanceId") String processInstanceIdParam, @RequestBody() String body) {
		System.out.println(processInstanceIdParam);
		System.out.println(body);
		return new ResponseEntity<String>(body, HttpStatus.OK);
	}
	
	@PutMapping(value = "/employees")
	public ResponseEntity<String> updateEmployee(@RequestParam("id") String id, @RequestBody String employee) {
	    System.out.println(id);
	    System.out.println(employee);
	    return new ResponseEntity<String>(employee, HttpStatus.OK);
	}
	@GetMapping(value = "/EmmaCase/search")
	public ResponseEntity<List <StartAutoMainCall>> getExeptionCases() {
		List<StartAutoMainCall> startAutoMainCalls = new ArrayList<StartAutoMainCall>();
		
		int count = 0;
		
		while(count < 100) {
			StartAutoMainCall startAutoMainCall = new StartAutoMainCall();
			EMMA_COBJECTs EMMA_COBJECT = new EMMA_COBJECTs();
 			startAutoMainCall.getEMMA_COBJECTs().add(EMMA_COBJECT);
 			startAutoMainCalls.add(startAutoMainCall);
			count ++;
		}
		
		
		return new ResponseEntity<List <StartAutoMainCall>>(startAutoMainCalls, HttpStatus.OK);
	}
	
	@GetMapping("/jsonMapper")
	public ResponseEntity<LocationResultDTO> getJsonMapperTest() {
		LocationResultDTO locationResultDTO = new LocationResultDTO();
		
		Meters meters = new Meters();
		MeterReadings meterReadings = new MeterReadings();
		meters.getMeterReadings().add(meterReadings);
		
		Units units = new Units();
		NotificationHeaders notificationHeaders = new NotificationHeaders();
		units.getNotificationHeaders().add(notificationHeaders);
		
		WorkOrders workOrders = new WorkOrders();
		
		
		locationResultDTO.getMeters().add(meters);
		locationResultDTO.getUnits().add(units);
		locationResultDTO.getWorkOrders().add(workOrders);
		locationResultDTO.setCountry("BRAZIL");
		
		return new ResponseEntity<LocationResultDTO>(locationResultDTO, HttpStatus.OK);
	}
}
