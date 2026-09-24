package E3;

public class Casa3 {
    public String endereco;
    public double preco;
    public String tipo;
    public double area;

    public Casa3() {
    }

    public Casa3(String endereco, double preco, String tipo, double area) {
        this.endereco = endereco;
        this.preco = preco;
        this.tipo = tipo;
        this.area = area;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}


