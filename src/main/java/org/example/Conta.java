package org.example;

import java.util.Scanner;

public class Conta {
    private String nomeTitular;

    private double saldo;
    private double valorInvestido;

    private boolean isValida;

    public boolean isValida() {
        return isValida;
    }

    public void setValida(boolean valida) {
        this.isValida = valida;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.setValida(true);
    }

    public Number getSaldo() {
        return saldo;
    }



    public Conta() {
        this.saldo = 100;
        this.setValida(false);
    }

    public void resgatar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
        }
        else{
            System.out.println("Você não possui tanto saldo assim...");
        }
        this.saldo -= valor;

    }
    public void depositar(double valor){

        this.saldo += valor;
    }
    public void investir(double valorInvestimento){
        if(valorInvestimento >= this.saldo){
            this.saldo -= valorInvestimento;
            this.valorInvestido = valorInvestimento;
        }
        else{
            System.out.println("O valor de investimento é menor que o valor que você possui em conta.");
        }
    }



}
