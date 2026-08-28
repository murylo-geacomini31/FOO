package domain;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    private int numero;
    private String complemento;

    public Endereco() { // CONSTRUTOR VAZIO
    }

    public Endereco(String rua, String bairro, String cidade, String uf, String cep, int numero, String complemento) {
        this.rua = rua;
        this.bairro = bairro;       // CONSTRUTOR PREENCHIDO
        this.cidade = cidade;
        this.uf = uf;               // CONSTRUTORES SEMPRE ANTES DE GETTER E SETTER
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}


