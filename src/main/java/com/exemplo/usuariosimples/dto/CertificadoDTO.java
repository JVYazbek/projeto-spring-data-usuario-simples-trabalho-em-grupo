package com.exemplo.usuariosimples.dto;

public class CertificadoDTO {

    private String dataEmissao;
    private String codigoValidacao;

    public CertificadoDTO() {
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
}