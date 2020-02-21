package br.com.therma.limparInstancias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.therma.limparInstacias.model.ByActivity;
import br.com.therma.limparInstacias.model.Task;
import br.com.therma.limparInstancias.service.ProcessInstanceService;
import br.com.therma.limparInstancias.service.TaskService;

@Controller
public class ByActivityController {

	@Autowired
	private TaskService taskService; 
	
	@Autowired
	private ProcessInstanceService processInstanceService;
	
	@GetMapping("/")
	public String telaByActivity() {
		return "byActivity";
	}
	
	@GetMapping("/excluirInstanciasActivity")
	public String excluirInstancias(ByActivity byActivity) {
		
		List<Task> tasks = taskService.obterTarefas(byActivity.getUrl(), byActivity.getActivityId(), byActivity.getTenantId());
		if(tasks != null) {
			System.out.println(tasks.toString());
			processInstanceService.excluirInstancias(tasks, byActivity.getUrl());
		}
		
		return "redirect:/";
	}
	
}
