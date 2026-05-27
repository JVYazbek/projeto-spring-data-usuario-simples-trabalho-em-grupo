package com.exemplo.usuariosimples.controller;

import com.exemplo.usuariosimples.domain.Certificado;
import com.exemplo.usuariosimples.service.CertificadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certificados")
@CrossOrigin("*")
public class CertificadoController {

    @Autowired
    private CertificadoService service;

    @GetMapping
    public List<Certificado> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Certificado salvar(@RequestBody Certificado certificado) {
        return service.salvar(certificado);
    }
}