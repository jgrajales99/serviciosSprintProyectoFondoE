package com.Fondo.Empleados.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Fondo.Empleados.Entity.Registro;

@Repository
public interface RegistroRepository extends JpaRepository<Registro, Integer> {
}
