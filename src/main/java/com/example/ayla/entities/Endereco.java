package com.example.ayla.entities;

public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public String toString() {
        String texto = "Logradouro: " + getLogradouro();
        texto += ", " + getNumero();
        texto += "\nComplemento: " + getComplemento();
        texto += "\nBairro: " + getBairro();
        texto += "\nCidade: " + getCidade();
        texto += "\nUf: " + getUf();
        texto += "\nCep: " + getCep();
        return texto;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
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

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
