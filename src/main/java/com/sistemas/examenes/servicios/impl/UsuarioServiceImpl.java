package com.sistemas.examenes.servicios.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemas.examenes.excepciones.UsuarioFoundException;
import com.sistemas.examenes.modelo.Usuario;
import com.sistemas.examenes.modelo.UsuarioRol;
import com.sistemas.examenes.repositorios.RolRepositorio;
import com.sistemas.examenes.repositorios.usuarioRepositorio;
import com.sistemas.examenes.servicios.UsuarioServicio;

@Service
public class UsuarioServiceImpl implements UsuarioServicio {

	@Autowired
	private usuarioRepositorio usuarioRepositorio;
	
	@Autowired
	private RolRepositorio rolRepositorio;

	@Override
	public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
		Usuario usuarioLocal = usuarioRepositorio.findByUsername(usuario.getUsername());
		if(usuarioLocal != null) {
			System.out.println("El usuario ya existe");
			throw new UsuarioFoundException("El usuario ya esta presente");
		}
		else {
			for(UsuarioRol usuarioRol: usuarioRoles) {
				rolRepositorio.save(usuarioRol.getRol());
			}
			usuario.getUsuarioRoles().addAll(usuarioRoles);
			usuarioLocal =usuarioRepositorio.save(usuario);
		}
		
		return usuarioLocal;
	}

	@Override
	public Usuario obtenerUsuario(String username) {
		return usuarioRepositorio.findByUsername(username);
	}

	@Override
	public void eliminarUsuario(Integer usuarioId) {
		usuarioRepositorio.deleteById(usuarioId);
		
	}
	
}
