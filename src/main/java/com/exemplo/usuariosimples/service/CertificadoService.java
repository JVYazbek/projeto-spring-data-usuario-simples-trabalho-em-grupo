package com.exemplo.usuariosimples.service;

import com.exemplo.usuariosimples.domain.Certificado;
import com.exemplo.usuariosimples.repository.CertificadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificadoService {

    @Autowired
    private CertificadoRepository repository;

    public List<Certificado> listarTodos() {
        return repository.findAll();
    }

    public Certificado salvar(Certificado certificado) {
        return repository.save(certificado);
    }
}