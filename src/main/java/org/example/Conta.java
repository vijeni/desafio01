package org.example;

public class Conta {
    private String nomeTitular;
    private Number deposito;
    private Number resgate;
    private Number saldo;

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

    public Number getDeposito() {
        return deposito;
    }

    public void setDeposito(Number deposito) {
        this.deposito = deposito;
    }

    public Number getResgate() {
        return resgate;
    }

    public void setResgate(Number resgate) {
        this.resgate = resgate;
    }

    public Number getSaldo() {
        return saldo;
    }

    public void setSaldo(Number saldo) {
        this.saldo = saldo;
    }

    public Conta() {
        this.saldo = 100;
        this.setValida(false);
    }
}
