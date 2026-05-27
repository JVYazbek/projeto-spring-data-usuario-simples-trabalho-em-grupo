package com.exemplo.usuariosimples.service;

import com.exemplo.usuariosimples.domain.Professor;
import com.exemplo.usuariosimples.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository repository;

    public List<Professor> listarTodos() {
        return repository.findAll();
    }

    public Professor salvar(Professor professor) {
        return repository.save(professor);
    }
}