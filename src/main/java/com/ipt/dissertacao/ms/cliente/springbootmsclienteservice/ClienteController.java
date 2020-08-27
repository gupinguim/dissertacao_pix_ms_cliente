package com.ipt.dissertacao.ms.cliente.springbootmsclienteservice;

import com.ipt.dissertacao.ms.cliente.springbootmsclienteservice.entidades.*;
import com.ipt.dissertacao.ms.cliente.springbootmsclienteservice.repositorios.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClienteController {

	@Autowired
	ClientePessoaFisicaRepository pf_repository;

	@Autowired
	ClientePessoaJuridicaRepository pj_repository;

	@GetMapping("/cliente/pessoa_fisica/{id_cliente}")
	public Cliente GetClientePessoaFisicaById(@PathVariable long id_cliente) {
		ClientePessoaFisica pf = pf_repository.findById(id_cliente);
		return pf;
	}

	@GetMapping("/cliente/pessoa_juridica/{id_cliente}")
	public Cliente GetClientePessoaJuridicaById(@PathVariable long id_cliente) {
		ClientePessoaJuridica pj = pj_repository.findById(id_cliente);
		return pj;
	}

}
