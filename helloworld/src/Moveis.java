

public class Moveis extends Produto{
    private String material;
    private String cor;
    private double peso;
    private int quantidade;
    private int quantidadeEstoque;

    public Moveis(){
    }

    public Moveis(String marca, String produto, String descricao, String material, String cor, double peso, int quantidade, int quantidadeEstoque) {
        super(marca, produto, descricao);
        this.material = material;
        this.cor = cor;
        this.peso = peso;
        this.quantidade = quantidade;
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
