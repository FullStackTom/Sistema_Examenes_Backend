package com.sistemas.examenes.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemas.examenes.modelo.Usuario;

@Repository
public interface usuarioRepositorio extends JpaRepository<Usuario, Integer>{
	
	public Usuario findByUsername(String username);

}
