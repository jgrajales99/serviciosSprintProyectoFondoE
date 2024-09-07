package com.Fondo.Empleados.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Fondo.Empleados.Entity.Usu;
import com.Fondo.Empleados.Services.UsuServicempl;

@RestController
@RequestMapping("/api")
public class Usucontroller {
	
	
	@Autowired
	UsuServicempl usuService;
	
	
	@PostMapping("/guardar")
	public Usu guardar(@RequestBody Usu usu) {
		
		return usuService.save(usu);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody Usu usu){
		
		String mensaje = usuService.login(usu.getUsername(), usu.getPassword());
		return ResponseEntity.ok(mensaje);
	}

}
