
package com.mycompany.prova2;


public class Endereco {
     protected String logradouro;
     protected String numero;
     protected String complemento;
     protected String cep;
     protected String cidade;
     protected UnidadeFederativa unidadefederativa;

    public Endereco(String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa unidadefederativa) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.unidadefederativa = unidadefederativa;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUnidadefederativa() {
        return unidadefederativa;
    }

    public void setUnidadefederativa(UnidadeFederativa unidadefederativa) {
        this.unidadefederativa = unidadefederativa;
    }

    @Override
    public String toString() {
        return  "\n numero:" + numero + 
                "\n complemento:" + complemento + 
                "\n cep:" + cep + 
                "\n cidade:" + cidade + 
                "\n unidadefederativa:" + unidadefederativa;
    }
     
     
     
}
