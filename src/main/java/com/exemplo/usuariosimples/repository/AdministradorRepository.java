package com.exemplo.usuariosimples.repository;

import com.exemplo.usuariosimples.domain.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorRepository extends JpaRepository<Administrador, Long> {
}