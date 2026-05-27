package com.exemplo.usuariosimples.controller;

import com.exemplo.usuariosimples.domain.Administrador;
import com.exemplo.usuariosimples.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administradores")
@CrossOrigin("*")
public class AdministradorController {

    @Autowired
    private AdministradorService service;

    @GetMapping
    public List<Administrador> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Administrador salvar(@RequestBody Administrador administrador) {
        return service.salvar(administrador);
    }
}