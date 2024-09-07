package com.Fondo.Empleados.Services;

import java.util.List;
import java.util.Optional;

import com.Fondo.Empleados.Entity.Actualizacion;

public interface ActualizacionService {
    Optional<Actualizacion> findById(Integer id);
    List<Actualizacion> findAll();
    Actualizacion save(Actualizacion a);
    void deleteById(Integer id);
}
