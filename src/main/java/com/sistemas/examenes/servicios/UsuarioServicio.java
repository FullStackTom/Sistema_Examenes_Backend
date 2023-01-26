package com.sistemas.examenes.servicios;

import java.util.Set;

import com.sistemas.examenes.modelo.Usuario;
import com.sistemas.examenes.modelo.UsuarioRol;

public interface UsuarioServicio {
	
	public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol>usuarioRoles) throws Exception;

	
	public Usuario obtenerUsuario(String username);
	
	public void eliminarUsuario(Integer usuarioId);
}
