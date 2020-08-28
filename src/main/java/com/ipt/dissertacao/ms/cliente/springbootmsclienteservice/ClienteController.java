package com.ipt.dissertacao.ms.cliente.springbootmsclienteservice;

import com.ipt.dissertacao.ms.cliente.springbootmsclienteservice.entidades.*;
import com.ipt.dissertacao.ms.cliente.springbootmsclienteservice.repositorios.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClienteController {

	@Autowired
	ClientePessoaFisicaRepository pf_repository;

	@Autowired
	ClientePessoaJuridicaRepository pj_repository;

	@GetMapping("/clientes/{id_cliente}")
	public ResponseEntity<Cliente> ClienteRecuperar(@PathVariable long id_cliente) {
		
		ClientePessoaJuridica pf = pj_repository.findById(id_cliente);
		if (pf != null)
			return new ResponseEntity<Cliente>(pf, HttpStatus.OK);
		
		ClientePessoaJuridica pj = pj_repository.findById(id_cliente);
		if (pj != null)
			return new ResponseEntity<Cliente>(pj, HttpStatus.OK);
		else
			return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
	}

}
