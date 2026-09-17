import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para criar uma proporção áurea a partir dele: ");
        int Num1 = scanner.nextInt();

        int anterior = Num1;
        int atual = Num1;

        for (int i = 0; i < 10; i++) {

            System.out.println(anterior + " + " + atual + " = " + (anterior + atual));

            int proximo = anterior + atual;

            anterior = atual;
            atual = proximo;
        }

        scanner.close();

    }
}