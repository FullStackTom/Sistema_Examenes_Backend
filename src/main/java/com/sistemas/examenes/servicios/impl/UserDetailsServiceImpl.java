package com.sistemas.examenes.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sistemas.examenes.modelo.Usuario;
import com.sistemas.examenes.repositorios.usuarioRepositorio;

@Service
public class UserDetailsServiceImpl  implements UserDetailsService{

	@Autowired
	private usuarioRepositorio usuariorepositorio;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = this.usuariorepositorio.findByUsername(username);
		if(usuario == null) {
			throw new UsernameNotFoundException("usuario no encontrado");
		}
		return usuario;
	}

}
