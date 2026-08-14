public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Mulyro";
        pessoa1.idade = 18;

        Pessoa pessoa2 = new Pessoa ("Murylo", 20, 1.75F, 95.9, "12947542975");

        System.out.println("Pessoa 1. Nome:"+pessoa1.nome);
        System.out.println("Pessoa 2. Nome:"+pessoa2.nome + ". Idade:" + pessoa2.idade);
    }
}