package com.sistemas.examenes.excepciones;

public class UsuarioNotFoundException extends Exception{

	public UsuarioNotFoundException() {
		super("El usuario con ese username NO existe en la base de datos, vuelva a intentar");
	}
	
	public UsuarioNotFoundException(String mensaje) {
		super(mensaje);
	}

}
