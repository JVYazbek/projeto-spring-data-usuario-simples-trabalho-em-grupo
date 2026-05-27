package com.exemplo.usuariosimples.repository;

import com.exemplo.usuariosimples.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}