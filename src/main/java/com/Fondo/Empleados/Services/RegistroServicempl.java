package com.Fondo.Empleados.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Fondo.Empleados.Entity.Registro;
import com.Fondo.Empleados.Repository.RegistroRepository;

@Service
public class RegistroServicempl implements RegistroService {

    @Autowired
    private RegistroRepository registroRepository;

    @Override
    public Optional<Registro> findById(Integer id) {
        return registroRepository.findById(id);
    }

    @Override
    public List<Registro> findAll() {
        return registroRepository.findAll();
    }

    @Override
    public Registro save(Registro r) {
        return registroRepository.save(r);
    }

    @Override
    public void deleteById(Integer id) {
        registroRepository.deleteById(id);
    }
}
