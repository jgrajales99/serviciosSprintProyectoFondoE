package com.Fondo.Empleados.Services;


import com.Fondo.Empleados.Entity.Usu;

public interface UsuService {
	
	public Usu save(Usu u);
	
	public String login(String username, String password);

	
	

}
