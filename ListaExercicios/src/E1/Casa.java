package E1;

public class Casa {
    public double preco;
    public double area;

    public Casa() {
    }

    public Casa(double preco, double area) {
        this.preco = preco;
        this.area = area;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}