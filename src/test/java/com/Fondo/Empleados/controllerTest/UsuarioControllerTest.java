package com.Fondo.Empleados.controllerTest;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.Fondo.Empleados.Controllers.UsuarioController;
import com.Fondo.Empleados.Entity.Usuario;
import com.Fondo.Empleados.Services.UsuarioService;


@ExtendWith(MockitoExtension.class)
public class UsuarioControllerTest {
	
	@InjectMocks
	private UsuarioController usuarioController;
	
	@Mock
	private UsuarioService usuarioService;
	
	@Test
	public void pruebaBuscarPorId() {
		
		Usuario usuarioSimulado=new Usuario();
		
		usuarioSimulado.setCodigo(1);
		usuarioSimulado.setNombre("juan");
		usuarioSimulado.setApellido("restrepo");
		usuarioSimulado.setEdad(25);
		usuarioSimulado.setEmail("juanito");
		
		when(usuarioService.findById(1)).thenReturn(Optional.of(usuarioSimulado));
		
		Optional<Usuario> resultado= usuarioController.buscarPorId(1);
		
		assertNotNull(resultado);
		assertTrue(resultado.isPresent());
		
	}
	
	@Test
	public void preubaEliminar() {
		int codigo=1;
		usuarioController.eliminar(1);
		verify(usuarioService, times(1)).deleteById(codigo);
		
	}
	
	@Test
	public void pruebaListarTodos() {
		Usuario usuario1 = new Usuario(2,"juan","restrepo",21,"juansito","as");
		Usuario usuario2 = new Usuario(2,"juan","gra",21,"gra","as");
		
		List<Usuario> listaUsuarios= new ArrayList<>();
		
		listaUsuarios.add(usuario1);
		listaUsuarios.add(usuario2);
		
		when(usuarioService.findAll()).thenReturn(listaUsuarios);
		
		List<Usuario> resultado = usuarioController.listarTodos();
		
		assertNotNull(resultado);
		assertEquals(2,resultado.size());
		assertTrue(resultado.contains(usuario1));
		assertTrue(resultado.contains(usuario2));
		
		
		
	}
	
	@Test
	public void pruebaActualizar() {
		
		int codigo=1;
		
		Usuario usuarioEnBd = new Usuario(codigo,"pedro","acevedo",21,"ases","as");
		Usuario usuarioActualizado = new Usuario(codigo,"andre","acevedo",23,"ree","re");
		
		when(usuarioService.findById(codigo)).thenReturn(Optional.of(usuarioEnBd));
		when(usuarioService.save(any(Usuario.class))).thenReturn(usuarioActualizado);
		
		Usuario resultado=usuarioController.actualizar(usuarioActualizado, codigo);
		
		assertEquals("andre",resultado.getNombre());
		assertEquals("acevedo",resultado.getApellido());
		assertEquals(23,resultado.getEdad());
		
		verify(usuarioService,times(1)).findById(codigo);
		verify(usuarioService,times(1)).save(any(Usuario.class));
		
	
		
	}

}
