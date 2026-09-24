package E7;

public class Triangulo extends FormaGeometrica {

    double lado;
    double base;
    double altura;

    public Triangulo(double lado, double base, double altura) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return lado + lado + base;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}