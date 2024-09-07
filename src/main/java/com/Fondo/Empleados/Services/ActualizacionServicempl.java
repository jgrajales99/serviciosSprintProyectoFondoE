package com.Fondo.Empleados.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Fondo.Empleados.Entity.Actualizacion;
import com.Fondo.Empleados.Repository.ActualizacionRepository;

@Service
public class ActualizacionServicempl implements ActualizacionService {

    @Autowired
    private ActualizacionRepository actualizacionRepository;

    @Override
    public Optional<Actualizacion> findById(Integer id) {
        return actualizacionRepository.findById(id);
    }

    @Override
    public List<Actualizacion> findAll() {
        return actualizacionRepository.findAll();
    }

    @Override
    public Actualizacion save(Actualizacion a) {
        return actualizacionRepository.save(a);
    }

    @Override
    public void deleteById(Integer id) {
        actualizacionRepository.deleteById(id);
    }
}
