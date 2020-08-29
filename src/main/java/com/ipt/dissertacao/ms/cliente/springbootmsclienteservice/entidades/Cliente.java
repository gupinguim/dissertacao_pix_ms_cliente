package com.ipt.dissertacao.ms.cliente.springbootmsclienteservice.entidades;

import java.util.*;
import javax.persistence.*;

@Entity(name = "cliente")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@SequenceGenerator(sequenceName="SEQ_INHERITANCE_TABLE_PER_CLASS", 
		   name="seqTPC", initialValue=0, allocationSize=1)
public abstract class Cliente {

	@Id
	Long id;
	@Column(name="data_cadastro")
	Date dataCadastro;
	@Column(name="id_usuario_cadastro")
	Long idUsuarioCadastro;
	@Column(name="tipo_pessoa")
	String tipoPessoa;
	
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
	public Long getIdUsuarioCadastro() {
		return idUsuarioCadastro;
	}
	public void setIdUsuarioCadastro(Long idUsuarioCadastro) {
		this.idUsuarioCadastro = idUsuarioCadastro;
	}
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	/**
	 * @param id
	 * @param dataCadastro
	 * @param idUsuarioCadastro
	 * @param tipoPessoa
	 */
	public Cliente(Long id, Date dataCadastro, Long idUsuarioCadastro, String tipoPessoa) {
		super();
		this.id = id;
		this.dataCadastro = dataCadastro;
		this.idUsuarioCadastro = idUsuarioCadastro;
		this.tipoPessoa = tipoPessoa;
	}
	
	public Cliente() {
		super();
	}
	
	
	
	
}	
