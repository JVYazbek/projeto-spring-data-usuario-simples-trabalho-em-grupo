package com.exemplo.usuariosimples.controller;

import com.exemplo.usuariosimples.domain.Usuario;
import com.exemplo.usuariosimples.dto.UsuarioDTO;
import com.exemplo.usuariosimples.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UsuarioService service;

    @PostMapping
    public Usuario login(@RequestBody UsuarioDTO dto) {
        return service.login(dto.getNome(), dto.getEmail())
                .orElseThrow(() -> new RuntimeException("Usuário ou email inválido"));
    }
}