package com.projeto.sistemadecompras.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<CartaoDeCredito> cartoes;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.cartoes = new ArrayList<>();

        System.out.println("Cadastro do cliente: " + this.nome + " (CPF: " + this.cpf + ")");
        System.out.println();
    }

    public void adicionarCartao(CartaoDeCredito cartao) {
        if (cartao == null) {
            throw new IllegalArgumentException("Cartão não pode ser nulo");
        }
        cartoes.add(cartao);
    }

    public List<CartaoDeCredito> getCartoes() {
        return cartoes;
    }

    public String getNome() {
        return nome;
    }
}
