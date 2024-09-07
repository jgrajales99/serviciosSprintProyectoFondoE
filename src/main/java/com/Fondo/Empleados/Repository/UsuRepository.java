package com.Fondo.Empleados.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Fondo.Empleados.Entity.Usu;


@Repository
public interface UsuRepository extends JpaRepository <Usu, Long> {
	
	
	public Usu findByUsername(String username);



	
	

}
