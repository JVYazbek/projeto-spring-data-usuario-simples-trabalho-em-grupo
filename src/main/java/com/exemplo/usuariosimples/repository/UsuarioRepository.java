package com.exemplo.usuariosimples.repository;

import com.exemplo.usuariosimples.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByNomeAndEmail(String nome, String email);
}