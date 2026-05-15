package com.exemplo.usuariosimples.domain;

public class Aluno extends Usuario {

    private double nota;
    private String plano;

    public Aluno() {
    }

    public Aluno(String nome, String email, double nota, String plano) {
        super(nome, email);
        this.nota = nota;
        this.plano = plano;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }
}