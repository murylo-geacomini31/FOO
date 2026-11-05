package com.meuProjeto.components;

import com.meuProjeto.dao.ClienteDao;
import com.meuProjeto.domain.Cliente;
import com.meuProjeto.domain.Endereco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class MenuCliente {

    private MenuCliente() {
    }

    public static void exibir(Scanner scanner) {
        int opcao;
        ClienteDao dao = new ClienteDao();

        do {
            System.out.println("\n===== MENU CLIENTE =====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Buscar cliente");
            System.out.println("4 - Atualizar cliente");
            System.out.println("5 - Deletar cliente");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = MenuGeral.lerOpcao(scanner);

            switch (opcao) {
                case 1:
                    Cliente cliente = new Cliente();
                    System.out.println("Informe seu nome: ");
                    cliente.setNome(scanner.nextLine());

                    System.out.println("Sua data de nascimento (AAAA-MM-DD): ");
                    String dataNascimento = scanner.nextLine();
                    cliente.setDataNascimento(LocalDate.parse(dataNascimento));

                    System.out.println("Email: ");
                    cliente.setEmail(scanner.nextLine());

                    System.out.println("Telefone: ");
                    cliente.setTelefone(scanner.nextLine());

                    System.out.println("Genero: ");
                    cliente.setGenero(scanner.nextLine());

                    System.out.println("CPF: ");
                    cliente.setCpf(scanner.nextLine());



                    System.out.println("--- Seu endereço ---\n");
                    System.out.println("Rua:");
                    Endereco endereco = new Endereco();
                    endereco.setRua(scanner.nextLine());

                    System.out.println("Numero: ");
                    endereco.setNumero(scanner.nextInt());

                    endereco.setCidade(scanner.nextLine());
                    //Esse set serve apenas para corrigir um erro que quando o usuario
                    //digitava um dado int ele pulava o proximo scanner, pq ele lia o\
                    //paragrafo do println como um caractere errado (nao int) e descartava.
                    System.out.println("Bairro: ");
                    endereco.setBairro(scanner.nextLine());

                    System.out.println("Cidade:");
                    endereco.setCidade(scanner.nextLine());


                    cliente.setEndereco(endereco);
                    dao.salvar(cliente);
                    break;
                case 2:

                    List<Cliente> listarClientes = new ArrayList<>();
                    listarClientes = dao.listar();

                    if(listarClientes.isEmpty()){
                        System.out.println("Não há nenhum cliente cadastrado.");
                    } else {
                        for(int i = 0; i < listarClientes.size(); i++){
                            Cliente c = listarClientes.get(i);

                            System.out.println("[" + i + "] | Nome: " + c.getNome() +
                                    " | Data de Nascimento: " + c.getDataNascimento() +
                                    " | Email: " + c.getEmail() +
                                    " | Telefone: " + c.getTelefone() +
                                    " | Genero: " + c.getGenero() + "\n" +
                                    "CPF: " + c.getCpf() +
                                    " | Endereco: " + c.getEndereco().getRua() + ", " + c.getEndereco().getNumero() +
                                    ", " + c.getEndereco().getBairro() + ", " + c.getEndereco().getCidade() + ". \n");
                        }
                    }


                    break;

                case 3:
                    System.out.println("Digite o ID/índice do cliente que você pretende buscar: ");
                    int indiceBusca = MenuGeral.lerOpcao(scanner);//Para nao pular o proximo scanner
                    Cliente buscaCliente = dao.buscar(indiceBusca);

                    if (buscaCliente == null) {
                        System.out.println("Cliente não encontrado.");
                    } else {
                        System.out.println("Cliente: | Nome: " + buscaCliente.getNome() +
                                " | Data de Nascimento: " + buscaCliente.getDataNascimento() +
                                " | Email: " + buscaCliente.getEmail() +
                                " | Telefone: " + buscaCliente.getTelefone() +
                                " | Genero: " + buscaCliente.getGenero() + "\n" +
                                "CPF: " + buscaCliente.getCpf() +
                                " | Endereco: " + buscaCliente.getEndereco().getRua() + ", " +
                                buscaCliente.getEndereco().getNumero() + ", " +
                                buscaCliente.getEndereco().getBairro() + ", " +
                                buscaCliente.getEndereco().getCidade() + ".\n");
                    }
                    break;

                case 4:
                    System.out.println("Digite o ID/índice do cliente que você quer atualizar: ");
                    int indiceAtualizar = MenuGeral.lerOpcao(scanner);

                    if (dao.buscar(indiceAtualizar) == null) {
                        System.out.println("Cliente não encontrado.");
                        break;
                    }

                    Cliente clienteAtualizado = new Cliente();

                    System.out.println("Novo nome: ");
                    clienteAtualizado.setNome(scanner.nextLine());

                    System.out.println("Nova data de nascimento (AAAA-MM-DD): ");
                    clienteAtualizado.setDataNascimento(LocalDate.parse(scanner.nextLine()));

                    System.out.println("Novo email: ");
                    clienteAtualizado.setEmail(scanner.nextLine());

                    System.out.println("Novo telefone: ");
                    clienteAtualizado.setTelefone(scanner.nextLine());

                    System.out.println("Novo genero: ");
                    clienteAtualizado.setGenero(scanner.nextLine());

                    System.out.println("Novo CPF: ");
                    clienteAtualizado.setCpf(scanner.nextLine());

                    Endereco enderecoAtualizado = new Endereco();

                    System.out.println("--- Novo endereço ---");
                    System.out.println("Rua: ");
                    enderecoAtualizado.setRua(scanner.nextLine());

                    System.out.println("Numero: ");
                    enderecoAtualizado.setNumero(MenuGeral.lerOpcao(scanner));

                    System.out.println("Bairro: ");
                    enderecoAtualizado.setBairro(scanner.nextLine());

                    System.out.println("Cidade: ");
                    enderecoAtualizado.setCidade(scanner.nextLine());

                    clienteAtualizado.setEndereco(enderecoAtualizado);
                    dao.atualizar(indiceAtualizar, clienteAtualizado);

                    System.out.println("Cliente atualizado com sucesso!");
                    break;

                case 5:
                    System.out.println("Digite o ID/índice do cliente que você quer deletar: ");
                    int indiceDeletar = MenuGeral.lerOpcao(scanner);

                    if (dao.buscar(indiceDeletar) == null) {
                        System.out.println("Cliente não encontrado.");
                    } else {
                        dao.deletar(indiceDeletar);
                        System.out.println("Cliente deletado com sucesso!");
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