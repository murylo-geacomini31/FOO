public abstract class Produto {
    private String marca;
    private String produto;
    private String descricao;


    public Produto(){
    }

    public Produto(String marca, String produto, String descricao) {
        this.marca = marca;
        this.produto = produto;
        this.descricao = descricao;
    }

    // Criar Getters e Setters usando o Generate e importante para que os outros arquivos, como Main, consigam pegar as informacoes dos objetos


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}