package com.ipt.dissertacao.ms.cliente.springbootmsclienteservice.entidades;

import java.util.*;

import javax.persistence.*;

@Entity(name="cliente_pessoa_fisica")
public class ClientePessoaFisica extends Cliente {

	@Column(name="nome")
	String nome;
	@Column(name="data_nascimento")
	Date dataNascimento;
	@Column(name="cpf")
	String cpf;
	@Column(name="doc_identidade")
	String docIdentidade;
	@Column(name="tipo_doc_identidade")
	String tipoDocIdentidade;
	@Column(name="local_documento_identidade")
	String localDocumentoIdentidade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDocIdentidade() {
		return docIdentidade;
	}
	public void setDocIdentidade(String docIdentidade) {
		this.docIdentidade = docIdentidade;
	}
	public String getTipoDocIdentidade() {
		return tipoDocIdentidade;
	}
	public void setTipoDocIdentidade(String tipoDocIdentidade) {
		this.tipoDocIdentidade = tipoDocIdentidade;
	}
	public String getLocalDocumentoIdentidade() {
		return localDocumentoIdentidade;
	}
	public void setLocalDocumentoIdentidade(String localDocumentoIdentidade) {
		this.localDocumentoIdentidade = localDocumentoIdentidade;
	}
	/**
	 * @param id
	 * @param dataCadastro
	 * @param idUsuarioCadastro
	 * @param tipoPessoa
	 * @param nome
	 * @param dataNascimento
	 * @param cpf
	 * @param docIdentidade
	 * @param tipoDocIdentidade
	 * @param localDocumentoIdentidade
	 */
	public ClientePessoaFisica(Long id, Date dataCadastro, Long idUsuarioCadastro, String tipoPessoa, String nome,
			Date dataNascimento, String cpf, String docIdentidade, String tipoDocIdentidade,
			String localDocumentoIdentidade) {
		super(id, dataCadastro, idUsuarioCadastro, tipoPessoa);
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.docIdentidade = docIdentidade;
		this.tipoDocIdentidade = tipoDocIdentidade;
		this.localDocumentoIdentidade = localDocumentoIdentidade;
	}
	public ClientePessoaFisica() {
		super();
	}
	
}
