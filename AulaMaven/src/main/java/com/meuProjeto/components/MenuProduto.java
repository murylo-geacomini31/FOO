package com.meuProjeto.components;

import com.meuProjeto.dao.ProdutoDao;
import com.meuProjeto.domain.Eletrodomestico;
import com.meuProjeto.domain.Moveis;
import com.meuProjeto.domain.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class MenuProduto {

    private MenuProduto() {
    }

    private static void exibirProduto(Produto p) {
        System.out.println("Nome: " + p.getNome() +
                " | Marca: " + p.getMarca() +
                " | Modelo: " + p.getModelo() +
                " | Quantidade: " + p.getQuantidade() +
                " | Descrição: " + p.getDescricacao());

        if (p instanceof Eletrodomestico) {
            Eletrodomestico eletro = (Eletrodomestico) p;
            System.out.println("Tipo: Eletrodoméstico | Voltagem: " + eletro.getVoltagem() +
                    " | Potência: " + eletro.getPotencial() +
                    " | Especificações: " + eletro.getEspecificacoes() + "\n");
        } else if (p instanceof Moveis) {
            Moveis movel = (Moveis) p;
            System.out.println("Tipo: Móvel | Composição: " + movel.getComposicao() +
                    " | Materiais: " + movel.getMateriais() +
                    " | Qtd. de itens: " + movel.getQtdItens() + "\n");
        }
    }

    public static void exibir(Scanner scanner) {
        int opcao;
        ProdutoDao dao = new ProdutoDao();

        do {
            System.out.println("\n===== MENU PRODUTO =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Buscar produto");
            System.out.println("4 - Atualizar produto");
            System.out.println("5 - Deletar produto");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = MenuGeral.lerOpcao(scanner);

            switch (opcao) {
                case 1:
                    System.out.println("Tipo de produto: ");
                    System.out.println("1 - Eletrodoméstico");
                    System.out.println("2 - Móvel");
                    int tipo = MenuGeral.lerOpcao(scanner);

                    if(tipo != 1 && tipo != 2){
                        System.out.println("Tipo invalido!");
                        break;
                    }

                    System.out.println("Marca do produto: ");
                    String marca = scanner.nextLine();

                    System.out.println("Nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.println("Modelo: ");
                    String modelo = scanner.nextLine();

                    System.out.println("Quantidade: ");
                    int quantidade = MenuGeral.lerOpcao(scanner); //Usar esse MenuGeral. serve para evitar o erro do paragrafo do println ser lido pelo proximo scanner

                    System.out.println("Descricao: ");
                    String descricao = scanner.nextLine();

                    if(tipo == 1){
                        Eletrodomestico e = new Eletrodomestico();

                        e.setMarca(marca);
                        e.setNome(nome);
                        e.setModelo(modelo);
                        e.setQuantidade(quantidade);
                        e.setDescricacao(descricao);

                        System.out.println("Voltagem: ");
                        e.setVoltagem(MenuGeral.lerOpcao(scanner));

                        System.out.println("Potencial: ");
                        e.setPotencial(MenuGeral.lerOpcao(scanner));

                        System.out.println("Especificacoes: ");
                        e.setEspecificacoes(scanner.nextLine());

                        dao.salvar(e);
                    } else {
                        Moveis m = new Moveis();

                        m.setMarca(marca);
                        m.setNome(nome);
                        m.setModelo(modelo);
                        m.setQuantidade(quantidade);
                        m.setDescricacao(descricao);

                        System.out.println("Composicao: ");
                        m.setComposicao(scanner.nextLine());

                        System.out.println("Materiais: ");
                        m.setMateriais(scanner.nextLine());

                        System.out.println("Quantidade de itens: ");
                        m.setQtdItens(MenuGeral.lerOpcao(scanner));

                        dao.salvar(m);
                    }

                    System.out.println("Produto cadastrado com sucesso!");

                    break;
                case 2:
                    List<Produto> produtos = dao.listar();

                    if (produtos.isEmpty()){
                        System.out.println("Não há nenhum produto cadastrado");
                    } else {
                        for(int i = 0; i < produtos.size(); i++){
                            Produto p = produtos.get(i);

                            System.out.println("[" + i + "] | Nome: " + p.getNome() +
                                    " | Marca: " + p.getMarca() +
                                    " | Modelo: " + p.getModelo() +
                                    " | Quantidade: " + p.getQuantidade() +
                                    " | Descricao: " + p.getDescricacao() + "\n") ;
                            if (p instanceof Eletrodomestico){
                                Eletrodomestico e = (Eletrodomestico) p;
                                System.out.println("Tipo: Eletrodomestico | Voltagem: " + e.getVoltagem() +
                                        " | Potencial: " + e.getPotencial() +
                                        " | Especificacoes: " + e.getEspecificacoes());
                            } else if (p instanceof Moveis){
                                Moveis m = (Moveis) p;
                                System.out.println("Tipo: Movel | Composicao: " + m.getComposicao() +
                                        " | Materiais: " + m.getMateriais() +
                                        " | Quantidade de Itens: " + m.getQtdItens() + "\n");
                            }


                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o ID/índice do produto que você quer buscar: ");
                    int indiceBusca = MenuGeral.lerOpcao(scanner);
                    Produto produto = dao.buscar(indiceBusca);

                    if (produto == null) {
                        System.out.println("Produto não encontrado.");
                    } else {
                        exibirProduto(produto);
                    }

                    break;
                case 4:
                    System.out.println("Digite o ID/índice do produto que você quer atualizar: ");
                    int indiceAtualizar = MenuGeral.lerOpcao(scanner);
                    Produto produtoAntigo = dao.buscar(indiceAtualizar);

                    if (produtoAntigo == null) {
                        System.out.println("Produto não encontrado.");
                        break;
                    }

                    System.out.println("Nova marca: ");
                    String novaMarca = scanner.nextLine();

                    System.out.println("Novo nome: ");
                    String novoNome = scanner.nextLine();

                    System.out.println("Novo modelo: ");
                    String novoModelo = scanner.nextLine();

                    System.out.println("Nova quantidade: ");
                    int novaQuantidade = MenuGeral.lerOpcao(scanner);

                    System.out.println("Nova descricao: ");
                    String novaDescricao = scanner.nextLine();

                    if (produtoAntigo instanceof Eletrodomestico) {
                        Eletrodomestico novoEletro = new Eletrodomestico();

                        novoEletro.setMarca(novaMarca);
                        novoEletro.setNome(novoNome);
                        novoEletro.setModelo(novoModelo);
                        novoEletro.setQuantidade(novaQuantidade);
                        novoEletro.setDescricacao(novaDescricao);
                        novoEletro.setDataCriacao(produtoAntigo.getDataCriacao());
                        novoEletro.setCriadoPor(produtoAntigo.getCriadoPor());

                        System.out.println("Nova voltagem: ");
                        novoEletro.setVoltagem(MenuGeral.lerOpcao(scanner));

                        System.out.println("Novo potencial: ");
                        novoEletro.setPotencial(MenuGeral.lerOpcao(scanner));

                        System.out.println("Novas especificacoes: ");
                        novoEletro.setEspecificacoes(scanner.nextLine());

                        dao.atualizar(indiceAtualizar, novoEletro);
                    } else if (produtoAntigo instanceof Moveis) {
                        Moveis novoMovel = new Moveis();

                        novoMovel.setMarca(novaMarca);
                        novoMovel.setNome(novoNome);
                        novoMovel.setModelo(novoModelo);
                        novoMovel.setQuantidade(novaQuantidade);
                        novoMovel.setDescricacao(novaDescricao);
                        novoMovel.setDataCriacao(produtoAntigo.getDataCriacao());
                        novoMovel.setCriadoPor(produtoAntigo.getCriadoPor());

                        System.out.println("Nova composicao: ");
                        novoMovel.setComposicao(scanner.nextLine());

                        System.out.println("Novos materiais: ");
                        novoMovel.setMateriais(scanner.nextLine());

                        System.out.println("Nova quantidade de itens: ");
                        novoMovel.setQtdItens(MenuGeral.lerOpcao(scanner));

                        dao.atualizar(indiceAtualizar, novoMovel);
                    }

                    System.out.println("Produto atualizado com sucesso!");

                    break;
                case 5:
                    System.out.println("Digite o ID/índice do produto que você quer deletar: ");
                    int indiceDeletar = MenuGeral.lerOpcao(scanner);

                    if (dao.buscar(indiceDeletar) == null) {
                        System.out.println("Produto não encontrado.");
                    } else {
                        dao.deletar(indiceDeletar);
                        System.out.println("Produto deletado com sucesso!");
                    }

                    break;
                case 0:
                    System.out.println("Voltando ao menu geral...");

                    break;

                default:
                    System.out.println("Opção inválida!");

                    break;
            }
        } while (opcao != 0);
    }
}