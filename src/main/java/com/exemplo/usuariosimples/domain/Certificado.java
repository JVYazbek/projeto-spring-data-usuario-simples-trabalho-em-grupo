package com.exemplo.usuariosimples.domain;

public class Certificado {

    private Long idCertificado;
    private String dataEmissao;
    private String codigoValidacao;

    public Certificado() {
    }

    public Certificado(Long idCertificado, String dataEmissao, String codigoValidacao) {
        this.idCertificado = idCertificado;
        this.dataEmissao = dataEmissao;
        this.codigoValidacao = codigoValidacao;
    }

    public Long getIdCertificado() {
        return idCertificado;
    }

    public void setIdCertificado(Long idCertificado) {
        this.idCertificado = idCertificado;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getCodigoValidacao() {
        return codigoValidacao;
    }

    public void setCodigoValidacao(String codigoValidacao) {
        this.codigoValidacao = codigoValidacao;
    }

    public void emitir() {
        System.out.println("Certificado emitido");
    }
}