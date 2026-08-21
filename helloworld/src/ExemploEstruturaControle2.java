import java.util.Scanner;

public class ExemploEstruturaControle2 {
    public static void main(){
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha a operação a ser realizada: ");
        System.out.println("A) Adicao\nB) Subtracao\nC) Multiplicacao\nD) Divisao");

        String op = in.nextLine().toUpperCase();

        System.out.print("Digite o valor a: ");
        int a = in.nextInt();
        System.out.print("Digite o valor b: ");
        int b = in.nextInt();

        switch (op) {
            case "A":
                System.out.println("Adicao: " + ( a + b));

            case "B":
                System.out.println("Subtracao: " + ( a - b));
                break;
            case "C":
                System.out.println("Multiplicacao: " + ( a * b));
                break;
            case "D":
                System.out.println("Divisao: " + ( a / b));
                break;
        }
    }
}
