package com.exemplo.usuariosimples.repository;

import com.exemplo.usuariosimples.domain.Certificado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificadoRepository extends JpaRepository<Certificado, Long> {
}