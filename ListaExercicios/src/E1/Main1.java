package E1;

public class Main1{
    public static void main(String[] args) {

        Casa casa = new Casa(50000, 100);

        double valorMetroQuadrado = casa.preco / casa.area;

        System.out.println("O valor do m² é: " + valorMetroQuadrado);

    }

}