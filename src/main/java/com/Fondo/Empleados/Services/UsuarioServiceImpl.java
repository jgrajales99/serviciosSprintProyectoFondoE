package com.Fondo.Empleados.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Fondo.Empleados.Entity.Usuario;
import com.Fondo.Empleados.Repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public Optional<Usuario> findById(Integer id) {
		
		return usuarioRepository.findById(id);
	}

	@Override
	public List<Usuario> findAll() {
		
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario save(Usuario u) {
		
		return usuarioRepository.save(u);
	}

	@Override
	public void deleteById(Integer id) {
		
		usuarioRepository.deleteById(id);
		
	}

}
