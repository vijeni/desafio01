
public class Conta {

private String nomeTitular;
private Number deposito;
private Number resgate;
private Number saldo;

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
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

    public Conta(String nomeTitular, Number deposito, Number resgate) {
        this.nomeTitular = nomeTitular;
        this.deposito = deposito;
        this.resgate = resgate;
        this.saldo = 100;
    }
}
