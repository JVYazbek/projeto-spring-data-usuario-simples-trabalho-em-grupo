package com.exemplo.usuariosimples.domain;

public class Curso {

    private Long id;
    private String titulo;
    private int cargaHoraria;
    private String status;

    public Curso() {
    }

    public Curso(Long id, String titulo, int cargaHoraria, String status) {
        this.id = id;
        this.titulo = titulo;
        this.cargaHoraria = cargaHoraria;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}