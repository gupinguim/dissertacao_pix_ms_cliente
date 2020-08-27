package com.ipt.dissertacao.ms.cliente.springbootmsclienteservice.entidades;

import java.util.*;
import javax.persistence.*;

@Entity(name = "usuario")
public class Usuario {

	@Id
	Long id;
	@Column(name="login")
	String login;
	@Column(name = "data_cadastro")
	Date dataCadastro;
	@Column(name = "senha")
	char[] senha;
	@Column(name = "situacao_usuario")
	String situacaoUsuario;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public char[] getSenha() {
		return senha;
	}
	public void setSenha(char[] senha) {
		this.senha = senha;
	}
	public String getSituacaoUsuario() {
		return situacaoUsuario;
	}
	public void setSituacaoUsuario(String situacaoUsuario) {
		this.situacaoUsuario = situacaoUsuario;
	}
	public Usuario(Long id, Date dataCadastro, char[] senha, String situacaoUsuario) {
		super();
		this.id = id;
		this.dataCadastro = dataCadastro;
		this.senha = senha;
		this.situacaoUsuario = situacaoUsuario;
	}
	public Usuario() {
		super();
	}
}
