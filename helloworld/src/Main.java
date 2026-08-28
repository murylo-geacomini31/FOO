

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Ronaldo");
        pessoa1.setIdade(18);

        Pessoa pessoa2 = new Pessoa ("Murylo", 20, 1.75F, 95.9, "12947542975");

        System.out.println("Pessoa 1. Nome:" + pessoa1.getNome());
        System.out.println("Pessoa 2. Nome:" + pessoa2.getNome() + ". Idade:" + pessoa2.getIdade());

        // Dia 27/08
        // Aula sobre Herança

        Eletrodomestico produto = new Eletrodomestico("Eletrolux", "Geladeira", "Geladeira Eletrolux 410L", "GL2026YD", 4159.90, "B", 110, "Inox");


        System.out.println("-----ELETRODOMESTICO-----");
        System.out.println(produto.getMarca());

        Moveis produto2 = new Moveis();
        produto2.setMarca("MEU MOVEL");
        produto2.setProduto("Mesa de Jantar");
        produto2.setDescricao("Mesa de Jantar para 6 pessoas, com 6 cadeiras");
        produto2.setCor("Naranja");



    }
}