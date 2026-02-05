package com.projeto.sistemadecompras.service;

import com.projeto.sistemadecompras.model.CartaoDeCredito;
import com.projeto.sistemadecompras.model.Cliente;
import com.projeto.sistemadecompras.model.Compra;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeCompras {
    public static void cadastrarCartao(Cliente cliente, CartaoDeCredito cartao) {
        cliente.adicionarCartao(cartao);
    }

    public static void realizarCompra(CartaoDeCredito cartao, Compra compra){
        cartao.realizarCompra(compra);
    }

    public static void listarCompras(CartaoDeCredito cartao){
        int i = 1;

        List<Compra> compras = cartao.getCompras();

        System.out.println("Compras realizadas no cartão " + cartao.getNumeroCartao());

        for(Compra compra: compras){
            System.out.println(i + ". " + compra.getDescricao() + " - R$ " + compra.getValor());
            i++;
        }

        System.out.println();
    }

    public static void exibirResumo(Cliente cliente){
        List<CartaoDeCredito> cartoes = cliente.getCartoes();

        System.out.println("Resumo do cliente " + cliente.getNome() + ":");

        for(CartaoDeCredito cartao : cartoes){
            System.out.println("Cartão: " + cartao.getNumeroCartao());
            System.out.println("Total gasto: R$ " + cartao.getTotalGasto());
            System.out.println("Saldo disponível: R$ " + cartao.getSaldoDisponivel());
            System.out.println();
        }
    }
}
