package com.exemplo.usuariosimples.domain;

public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(String nome, String email) {
        super(nome, email);
    }

    public void aprovarCurso() {
        System.out.println("Curso aprovado");
    }

    public void reprovarCurso() {
        System.out.println("Curso reprovado");
    }

    public void alterarModeloCobranca() {
        System.out.println("Modelo de cobrança alterado");
    }

    public void monitorarAcessos() {
        System.out.println("Monitorando acessos");
    }

    public void gerenciarUsuarios() {
        System.out.println("Gerenciando usuários");
    }
}