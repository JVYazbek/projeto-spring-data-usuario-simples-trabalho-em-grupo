package com.exemplo.usuariosimples.service;

import com.exemplo.usuariosimples.domain.Usuario;
import com.exemplo.usuariosimples.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Optional<Usuario> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Usuario criar(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario atualizar(Long id, Usuario usuarioAtualizado) {
        return repository.findById(id).map(usuario -> {
            usuario.setNome(usuarioAtualizado.getNome());
            usuario.setEmail(usuarioAtualizado.getEmail());
            return repository.save(usuario);
        }).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Optional<Usuario> login(String nome, String email) {
        return repository.findByNomeAndEmail(nome, email);
    }
}