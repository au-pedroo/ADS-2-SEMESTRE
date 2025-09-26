package exemplo02;

public class Conta {
    private int agencia;
    private double saldo;
    private int numero;

    public Conta(int agencia, int numero) {
        //this.agencia = agencia;
        //this.numero = numero;
        this.setAgencia(agencia);
        this.setNumero(numero);
        this.setSaldo(100);
    }

    public Conta(int numero){
        this.agencia = 15000;
        this.setNumero(numero);
        this.setSaldo(0);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia >= 1 && agencia <= 9999) {
            this.agencia = agencia;
        } else {
            System.out.println("Agencia Invalida!!");
        }

    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero >= 10000 && numero <= 20000) {
            this.numero = numero;
        } else {
            System.out.println("Numero Invalido!!");
        }

    }

    public boolean depositar(double valordeposito) {
        if (valordeposito > 0) {
            this.setSaldo(this.saldo + valordeposito);
            return true;
        } else {
            System.out.println("Valor invalido!!");
            return false;
        }
    }

    public boolean sacar(double valorsaque) {
        if (valorsaque > 0 && this.saldo >= valorsaque) {
            this.setSaldo(this.saldo - valorsaque);
            return true;
        } else {
            System.out.println("Saque Invalido!!");
            return false;
        }
    }

    public String imprimirDados() {
        return ("Agência: " + this.agencia +
                "\nConta: " + this.numero +
                "\nSaldo: " + this.saldo);
    }
}