package com.ipt.dissertacao.ms.cliente.springbootmsclienteservice.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipt.dissertacao.ms.cliente.springbootmsclienteservice.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findById(long id);
}
