package com.meuProjeto.dao;

import com.meuProjeto.domain.Produto;
import com.meuProjeto.interfaces.Crud;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDao implements Crud<Produto> {

    private List<Produto> listaProdutos = new ArrayList<>();

    @Override
    public void salvar(Produto objeto) {
        this.listaProdutos.add(objeto);
    }

    @Override
    public List<Produto> listar() {
        return this.listaProdutos;
    }

    @Override
    public Produto buscar(int indice) {
        if (indice < 0 || indice >= listaProdutos.size()) {
            return null;
        }
        return listaProdutos.get(indice);
    }

    @Override
    public void atualizar(int indice, Produto objeto) {
        if (indice < 0 || indice >= this.listaProdutos.size()) {
            return;
        }
        this.listaProdutos.set(indice, objeto);
    }

    @Override
    public void deletar(int indice) {
        if (indice < 0 || indice >= this.listaProdutos.size()) {
            return;
        }
        this.listaProdutos.remove(indice);
    }
}