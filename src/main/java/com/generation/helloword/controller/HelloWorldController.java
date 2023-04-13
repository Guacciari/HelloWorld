package com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//define que a classe é do tipo controladora rest e vai receber requisiçoes:

@RestController
@RequestMapping("/hello-world") // resquestmapping esta mapeando as requisicoes solicitadas para os metodos da
								// classe controladora
public class HelloWorldController {

	@GetMapping // endpoint de http get
	public String helloWorld() {
		return "Hello World!!!";
	}

	@GetMapping("/bsm") // endpoint de http get
	public String bms() {
		return "Todas as bsm: \n" + "trabalho em equipe\n" + "mentalidade de crescimento\n" + "responsabilidade pessoal\n"
				+ "comunicacao\n" + "orientacao ao detalhe\n" + "proatividade\n" + "orientacao ao futuro\n"
				+ "persistencia\n";
	}
	@GetMapping("/objetivos") // endpoint de http get
	public String  objetivos() {
		return "Objetivo1: foco\n"
				+ "Objetivo2: Mudar meu ambiente\n"
				+ "Objetibos3: Metodo pomodoro\n"
				+ "Objetivo4: fazer minhas tarefas da gen";
		
	}
}
