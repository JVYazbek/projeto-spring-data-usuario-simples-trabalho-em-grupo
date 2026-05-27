package com.exemplo.usuariosimples.service;

import com.exemplo.usuariosimples.domain.Administrador;
import com.exemplo.usuariosimples.repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorService {

    @Autowired
    private AdministradorRepository repository;

    public List<Administrador> listarTodos() {
        return repository.findAll();
    }

    public Administrador salvar(Administrador administrador) {
        return repository.save(administrador);
    }
}