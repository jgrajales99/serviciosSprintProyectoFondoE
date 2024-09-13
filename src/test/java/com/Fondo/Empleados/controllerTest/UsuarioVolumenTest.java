package com.Fondo.Empleados.controllerTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.ANY) 
public class UsuarioVolumenTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @BeforeEach
    public void setUp() {
        
        jdbcTemplate.execute("CREATE TABLE usuarios (id INT PRIMARY KEY, nombre VARCHAR(255), edad INT)");
    }

    @Test
    public void testInsertarVolumen() {
        int numRegistros = 10000; 
        long startTime = System.currentTimeMillis();

        
        for (int i = 1; i <= numRegistros; i++) {
            jdbcTemplate.update("INSERT INTO usuarios (id, nombre, edad) VALUES (?, ?, ?)", i, "Usuario" + i, 20 + (i % 50));
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        
        System.out.println("Tiempo de inserción para " + numRegistros + " registros: " + duration + " ms");

        
        assertTrue(duration < 1000); 
}}

