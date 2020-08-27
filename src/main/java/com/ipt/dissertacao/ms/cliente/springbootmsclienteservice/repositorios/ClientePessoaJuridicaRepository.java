package com.ipt.dissertacao.ms.cliente.springbootmsclienteservice.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipt.dissertacao.ms.cliente.springbootmsclienteservice.entidades.*;

public interface ClientePessoaJuridicaRepository extends JpaRepository<ClientePessoaJuridica, Long> {
	ClientePessoaJuridica findById(long id);
}
