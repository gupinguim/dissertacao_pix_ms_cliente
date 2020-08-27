package com.ipt.dissertacao.ms.cliente.springbootmsclienteservice.entidades;

import java.util.*;
import javax.persistence.*;

@Entity(name = "cliente_pessoa_juridica")
public class ClientePessoaJuridica extends Cliente {

	@Column(name = "cnpj")
	String cnpj;
	@Column(name = "razao_social")
	String razaoSocial;
	@Column(name = "nome_fantasia")
	String nomeFantasia;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public ClientePessoaJuridica(Long id, Date dataCadastro, Long idUsuarioCadastro, String tipoPessoa, String cnpj, String razaoSocial,
			String nomeFantasia) {
		super(id, dataCadastro, idUsuarioCadastro, tipoPessoa);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
	}

	public ClientePessoaJuridica() {
		super();
	}
}
