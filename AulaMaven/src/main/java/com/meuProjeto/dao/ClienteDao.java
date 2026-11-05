package com.meuProjeto.dao;

import com.meuProjeto.domain.Cliente;
import com.meuProjeto.interfaces.Crud;

import java.util.ArrayList;
import java.util.List;

public class ClienteDao implements Crud<Cliente> {

    private List<Cliente> listaClientes = new ArrayList<>();


    @Override
    public void salvar(Cliente objeto) {
        this.listaClientes.add(objeto);
    }

    @Override
    public List<Cliente> listar() {
        return this.listaClientes;
    }

    @Override
    public Cliente buscar(int indice) {
        if (indice < 0 || indice >= this.listaClientes.size()) {
            return null;
        }
        return this.listaClientes.get(indice);
    }

    @Override
    public void atualizar(int indice, Cliente objeto) {
        if (indice < 0 || indice >= this.listaClientes.size()) {
            return;
        }
        this.listaClientes.set(indice, objeto);
    }

    @Override
    public void deletar(int indice) {
        if (indice < 0 || indice >= this.listaClientes.size()) {
            return;
        }
        this.listaClientes.remove(indice);
    }
}
