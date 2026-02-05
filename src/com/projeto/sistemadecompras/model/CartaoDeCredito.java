package com.projeto.sistemadecompras.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private String numeroCartao;
    private BigDecimal limite;
    private BigDecimal saldoDisponivel;
    private List<Compra> compras;
    private BigDecimal totalGasto;

    public CartaoDeCredito(String numeroCartao, double limite) {
        this.numeroCartao = numeroCartao;
        this.limite = BigDecimal.valueOf(limite);
        this.saldoDisponivel = this.limite;
        this.totalGasto = BigDecimal.valueOf(0);
        this.compras = new ArrayList<>();

        System.out.println("Cartão cadastrado: " + this.numeroCartao + " com limite de R$ " + this.limite);
        System.out.println();
    }

    public boolean realizarCompra(Compra compra){
        if (compra == null) {
            throw new IllegalArgumentException("Compra não pode ser nula");
        }

        if(compra.getValor().compareTo(this.saldoDisponivel) <= 0){
            this.saldoDisponivel = saldoDisponivel.subtract(compra.getValor());
            this.totalGasto = totalGasto.add(compra.getValor());
            this.compras.add(compra);

            System.out.println("Compra realizada: " + compra.getDescricao() + " - R$ " + compra.getValor());
            System.out.println();

            return true;
        }

        return false;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public BigDecimal getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public BigDecimal getTotalGasto() {
        return totalGasto;
    }
}
