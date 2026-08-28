

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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
