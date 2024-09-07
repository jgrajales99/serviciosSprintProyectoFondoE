package com.Fondo.Empleados.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Fondo.Empleados.Entity.Actualizacion;

@Repository
public interface ActualizacionRepository extends JpaRepository<Actualizacion, Integer> {
}
