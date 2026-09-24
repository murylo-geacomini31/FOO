public class Fibonacci {
    public static void main(String[] args) {


        System.out.println("---- Proporção áurea (Fibonacci) ----");

        int anterior = 1;
        int atual = 1;


        for (int i = 0; i < 10; i++) {

            System.out.println(anterior + " + " + atual + " = " + (anterior + atual));

            int proximo = anterior + atual;

            anterior = atual;
            atual = proximo;
        }

    }
}