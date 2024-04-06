package com.example.ayla.xml.lista;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Endereco {
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String cep;
    private String cidade;

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getUf() {
        return uf;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
