package E7;

public class Main7 {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(5);

        Triangulo triangulo = new Triangulo(5, 6, 4);

        Circulo circulo = new Circulo(3);

        System.out.println("QUADRADO");
        System.out.println("Perímetro: " + quadrado.calcularPerimetro());
        System.out.println("Área: " + quadrado.calcularArea());

        System.out.println();

        System.out.println("TRIÂNGULO");
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Área: " + triangulo.calcularArea());

        System.out.println();

        System.out.println("CÍRCULO");
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        System.out.println("Área: " + circulo.calcularArea());
    }
}