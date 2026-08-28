

public class Eletrodomestico extends Produto {
    private String modelo;
    private double preco;
    private String classificacaoConsumo;
    private int voltagem;
    private String cor;

    public Eletrodomestico() {
    }

    public Eletrodomestico(String marca, String produto, String descricao, String modelo, double preco, String classificacaoConsumo, int voltagem, String cor) {
        super(marca, produto, descricao);
        this.modelo = modelo;
        this.preco = preco;
        this.classificacaoConsumo = classificacaoConsumo;
        this.voltagem = voltagem;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getClassificacaoConsumo() {
        return classificacaoConsumo;
    }

    public void setClassificacaoConsumo(String classificacaoConsumo) {
        this.classificacaoConsumo = classificacaoConsumo;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
