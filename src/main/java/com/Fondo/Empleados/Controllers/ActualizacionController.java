package com.Fondo.Empleados.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Fondo.Empleados.Entity.Actualizacion;
import com.Fondo.Empleados.Services.ActualizacionService;

@RestController
@RequestMapping("/api/actualizacion")
@CrossOrigin(origins = "*", methods = { 
    org.springframework.web.bind.annotation.RequestMethod.GET, 
    org.springframework.web.bind.annotation.RequestMethod.POST,
    org.springframework.web.bind.annotation.RequestMethod.DELETE,
    org.springframework.web.bind.annotation.RequestMethod.PUT 
})
public class ActualizacionController {
    
    @Autowired
    private ActualizacionService actualizacionService;
    
    @GetMapping("/{id}")
    public Optional<Actualizacion> buscarPorId(@PathVariable Integer id) {
        return actualizacionService.findById(id);
    }
    
    @GetMapping("/listar")
    public List<Actualizacion> listarTodos() {
        return actualizacionService.findAll();
    }
    
    @PostMapping
    public Actualizacion guardar(@RequestBody Actualizacion a) {
        return actualizacionService.save(a);
    }
    
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        actualizacionService.deleteById(id);
    }
    
    @PutMapping("/actualizar/{id}")
    public Actualizacion actualizar(@RequestBody Actualizacion a, @PathVariable Integer id) {
        Actualizacion aEnBD = actualizacionService.findById(id)
            .orElseThrow(() -> new RuntimeException("Actualizacion no encontrada"));

        
        aEnBD.setNombres(a.getNombres());
        aEnBD.setApellidos(a.getApellidos());
        aEnBD.setSexo(a.getSexo());
        aEnBD.setDocumento(a.getDocumento());
        aEnBD.setFechaNacimiento(a.getFechaNacimiento());
        aEnBD.setEmail(a.getEmail());
        aEnBD.setDireccion(a.getDireccion());
        aEnBD.setCelular(a.getCelular());
        aEnBD.setCelularAlternativo(a.getCelularAlternativo());
        aEnBD.setCampoActualizado(a.getCampoActualizado());
        aEnBD.setValorAnterior(a.getValorAnterior());
        aEnBD.setValorNuevo(a.getValorNuevo());
        aEnBD.setFecha(a.getFecha());
        
        return actualizacionService.save(aEnBD);
    }
}
