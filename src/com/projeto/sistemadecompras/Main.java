package com.projeto.sistemadecompras;

import com.projeto.sistemadecompras.model.CartaoDeCredito;
import com.projeto.sistemadecompras.model.Cliente;
import com.projeto.sistemadecompras.model.Compra;
import com.projeto.sistemadecompras.service.SistemaDeCompras;

public class Main {
    public static void main(String[] args) {
        // 1. Cadastrar um cliente
        Cliente cliente = new Cliente("João Silva", "12345678900");

        // 2. Adicionar um cartão de crédito ao cliente
        CartaoDeCredito cartao = new CartaoDeCredito("1234-5678-9876-5432", 5000.0);
        SistemaDeCompras.cadastrarCartao(cliente, cartao);

        // 3. Realizar compras
        Compra compra1 = new Compra("Notebook", 2500.0);
        Compra compra2 = new Compra("Mouse", 150.0);
        Compra compra3 = new Compra("Teclado", 200.0);
        SistemaDeCompras.realizarCompra(cartao, compra1);
        SistemaDeCompras.realizarCompra(cartao, compra2);
        SistemaDeCompras.realizarCompra(cartao, compra3);

        // 4. Listar compras do cartão
        SistemaDeCompras.listarCompras(cartao);

        // 5. Exibir resumo do cliente
        SistemaDeCompras.exibirResumo(cliente);
    }
}