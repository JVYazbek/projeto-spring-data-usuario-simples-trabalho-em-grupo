package com.exemplo.usuariosimples.domain;

public class Plano {

    private Long idPlano;
    private String nome;
    private double preco;
    private String beneficios;

    public Plano() {
    }

    public Plano(Long idPlano, String nome, double preco, String beneficios) {
        this.idPlano = idPlano;
        this.nome = nome;
        this.preco = preco;
        this.beneficios = beneficios;
    }

    public Long getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(Long idPlano) {
        this.idPlano = idPlano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public void alterar() {
        System.out.println("Plano alterado");
    }
}