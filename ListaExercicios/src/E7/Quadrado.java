package E7;

public class Quadrado extends FormaGeometrica {

    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}