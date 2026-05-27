package com.exemplo.usuariosimples.controller;

import com.exemplo.usuariosimples.domain.Curso;
import com.exemplo.usuariosimples.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
@CrossOrigin("*")
public class CursoController {

    @Autowired
    private CursoService service;

    @GetMapping
    public List<Curso> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Curso salvar(@RequestBody Curso curso) {
        return service.salvar(curso);
    }
}