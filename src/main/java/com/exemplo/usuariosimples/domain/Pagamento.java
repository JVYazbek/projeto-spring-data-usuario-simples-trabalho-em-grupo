package com.exemplo.usuariosimples.domain;

public class Pagamento {

    private Long idPagamento;
    private double valor;
    private String dataPagamento;
    private String status;
    private String metodo;

    public Pagamento() {
    }

    public Pagamento(Long idPagamento, double valor, String dataPagamento, String status, String metodo) {
        this.idPagamento = idPagamento;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.status = status;
        this.metodo = metodo;
    }

    public Long getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Long idPagamento) {
        this.idPagamento = idPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public boolean processar() {
        System.out.println("Pagamento processado");
        return true;
    }

    public boolean confirmar() {
        System.out.println("Pagamento confirmado");
        return true;
    }
}