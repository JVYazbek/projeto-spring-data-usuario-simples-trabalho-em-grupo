package com.exemplo.usuariosimples.controller;

import com.exemplo.usuariosimples.domain.Professor;
import com.exemplo.usuariosimples.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
@CrossOrigin("*")
public class ProfessorController {

    @Autowired
    private ProfessorService service;

    @GetMapping
    public List<Professor> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Professor salvar(@RequestBody Professor professor) {
        return service.salvar(professor);
    }
}