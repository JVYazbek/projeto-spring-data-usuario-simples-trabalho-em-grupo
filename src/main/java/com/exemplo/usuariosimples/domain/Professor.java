package com.exemplo.usuariosimples.domain;

public class Professor extends Usuario {

    private String disciplina;

    public Professor() {
    }

    public Professor(String nome, String email, String disciplina) {
        super(nome, email);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}