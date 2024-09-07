package com.Fondo.Empleados.Services;

import java.util.List;
import java.util.Optional;

import com.Fondo.Empleados.Entity.Usuario;

public interface UsuarioService {
	
	public Optional<Usuario>findById(Integer id);
	public List<Usuario>findAll();
	public Usuario save(Usuario u);
	public void deleteById(Integer id);
	

}
