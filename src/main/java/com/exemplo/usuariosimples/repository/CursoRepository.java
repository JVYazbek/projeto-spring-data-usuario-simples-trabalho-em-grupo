package com.exemplo.usuariosimples.repository;

import com.exemplo.usuariosimples.domain.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}