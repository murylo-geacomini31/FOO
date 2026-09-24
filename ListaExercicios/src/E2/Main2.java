package E2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.print("Digite sua idade: ");
        int idadeDigitada = entrada.nextInt();

        pessoa.setIdade(idadeDigitada);

        if (pessoa.getIdade() >= 18) {
            System.out.println("Você está apto a tirar a carteira de motorista.");
        } else {
            System.out.println("Você ainda não está apto a tirar a carteira de motorista.");
        }

        entrada.close();
    }
}