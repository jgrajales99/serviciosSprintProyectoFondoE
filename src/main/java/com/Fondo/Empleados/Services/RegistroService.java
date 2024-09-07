package com.Fondo.Empleados.Services;

import java.util.List;
import java.util.Optional;

import com.Fondo.Empleados.Entity.Registro;

public interface RegistroService {
    Optional<Registro> findById(Integer id);
    List<Registro> findAll();
    Registro save(Registro r);
    void deleteById(Integer id);
}
