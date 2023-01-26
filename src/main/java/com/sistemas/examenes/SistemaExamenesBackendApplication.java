package com.sistemas.examenes;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.sistemas.examenes.excepciones.UsuarioFoundException;
import com.sistemas.examenes.modelo.Rol;
import com.sistemas.examenes.modelo.Usuario;
import com.sistemas.examenes.modelo.UsuarioRol;
import com.sistemas.examenes.servicios.UsuarioServicio;

@SpringBootApplication
public class SistemaExamenesBackendApplication implements CommandLineRunner{
	
	@Autowired
	private UsuarioServicio usuarioServicio;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*try{
		Usuario usuario = new Usuario();

		usuario.setNombre("Tomas");
		usuario.setApellido("Olortegui");
		usuario.setUsername("tomas");
		usuario.setPassword(bCryptPasswordEncoder.encode("123456"));
		usuario.setEmail("tolortegui@gmail.com");
		usuario.setTelefono("969089708");
		usuario.setPerfil("foto.png");

		Rol rol = new Rol();
		rol.setRolId(1);
		rol.setRolNombre("ADMINISTRADOR");

		Set<UsuarioRol> usuariosRoles = new HashSet<>();
		UsuarioRol usuarioRol = new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		usuariosRoles.add(usuarioRol);

		Usuario usuarioGuardado = usuarioServicio.guardarUsuario(usuario,usuariosRoles);
		System.out.println(usuarioGuardado.getUsername());
	}catch (UsuarioFoundException exception){
		exception.printStackTrace();
	}*/
		
		
	}

}
