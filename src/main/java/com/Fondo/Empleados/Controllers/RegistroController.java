package com.Fondo.Empleados.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Fondo.Empleados.Entity.Registro;
import com.Fondo.Empleados.Services.RegistroService;

@RestController
@RequestMapping("/api/registro")
@CrossOrigin(origins = "*")
public class RegistroController {
    
    @Autowired
    private RegistroService registroService;
    
    @PostMapping
    public Registro registrar(@RequestBody Registro r) {
        return registroService.save(r);
    }
    
    @GetMapping("/{id}")
    public Optional<Registro> buscarPorId(@PathVariable Integer id) {
        return registroService.findById(id);
    }
    
    @GetMapping("/listar")
    public List<Registro> listarTodos() {
        return registroService.findAll();
    }
    
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        registroService.deleteById(id);
    }
}
