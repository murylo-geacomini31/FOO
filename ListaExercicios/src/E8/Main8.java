package E8;

import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n===== CADASTRO ACADÊMICO =====");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("\n===== CADASTRO DE ALUNO =====");

                    entrada.nextLine();

                    System.out.print("Digite o nome do aluno: ");
                    String nomeAluno = entrada.nextLine();

                    System.out.print("Digite a idade: ");
                    int idade = entrada.nextInt();

                    // Validação da idade
                    if (idade >= 16 && idade <= 99) {

                        System.out.print("Digite a renda familiar: R$ ");
                        double rendaFamiliar = entrada.nextDouble();

                        System.out.print("Participa ativamente de projeto de extensão? (true/false): ");
                        boolean participaExtensao = entrada.nextBoolean();

                        // Validação do benefício
                        boolean recebeBeneficio;

                        if (rendaFamiliar < 1500 || participaExtensao) {
                            recebeBeneficio = true;
                        } else {
                            recebeBeneficio = false;
                        }

                        System.out.println("\n--- Cadastro realizado ---");
                        System.out.println("Nome: " + nomeAluno);
                        System.out.println("Idade: " + idade);

                        if (recebeBeneficio) {
                            System.out.println("Auxílio estudantil: SIM");
                        } else {
                            System.out.println("Auxílio estudantil: NÃO");
                        }

                    } else {

                        System.out.println("Idade inválida. O aluno deve ter entre 16 e 99 anos.");

                    }

                    break;

                case 2:

                    System.out.println("\n===== CADASTRO DE PROFESSOR =====");

                    entrada.nextLine();

                    System.out.print("Digite o nome do professor: ");
                    String nomeProfessor = entrada.nextLine();

                    System.out.print("Digite os anos de experiência: ");
                    int anosExperiencia = entrada.nextInt();

                    System.out.print("Possui pós-graduação? (true/false): ");
                    boolean temPosGraduacao = entrada.nextBoolean();

                    System.out.print("É bacharel? (true/false): ");
                    boolean ehBacharel = entrada.nextBoolean();

                    String status;

                    // Validação da contratação
                    if (anosExperiencia > 2 &&
                            (temPosGraduacao == true || ehBacharel == true)) {

                        status = "Efetivo";

                    } else {

                        status = "Temporário";
                    }

                    System.out.println("\n--- Cadastro realizado ---");
                    System.out.println("Nome: " + nomeProfessor);
                    System.out.println("Status: " + status);

                    break;

                case 3:

                    System.out.println("\nSaindo do sistema...");

                    break;

                default:

                    System.out.println("\nOpção inválida.");

                    break;
            }

        } while (opcao != 3);

        entrada.close();
    }
}