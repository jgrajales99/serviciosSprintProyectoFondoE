package com.Fondo.Empleados.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Fondo.Empleados.Entity.Usu;
import com.Fondo.Empleados.Repository.UsuRepository;

@Service

public class UsuServicempl implements UsuService  {

	
	@Autowired
	UsuRepository usuRepository;

	@Override
	public Usu save(Usu u) {
		
		return usuRepository.save(u);
	}

	@Override
	public String login(String user, String pass) {
		
		Usu usu = usuRepository.findByUsername(user);
		
		if(usu==null) {
			
			return "Registro no encontrado";
		}
		if(!usu.getPassword().equals(pass)) {
			
			return"Contraseña incorrecta";
		}
		
		
		return "Bienvenido";
	}

	
	}

	

