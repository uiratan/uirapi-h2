package dev.uira.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.uira.api.pessoa.DadosPessoa;
import dev.uira.api.pessoa.Pessoa;
import dev.uira.api.pessoa.PessoaRepository;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@PostMapping
	private void cadastrar(@RequestBody DadosPessoa dados) {
		System.out.println("Dados recebidos: " + dados);

		Pessoa pessoa = new Pessoa(dados);
		System.out.println("Objeto pessoa criado: " + pessoa.toString());
		
		pessoaRepository.save(pessoa);
		System.out.println("Cadastro sucesso!");
		
	}
	
	@GetMapping
	private String ola() {
		System.out.println(pessoaRepository.toString());
		return "Olá";
	}
}
