package exercicio1;

public class Corrente extends Conta {
    private double limite;


    public Corrente(String banco, int agencia, int conta, double limite) {
        super(banco, agencia, conta);
//        this.limite = limite;
        this.setLimite(limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if(limite >= 0 && limite <= 100000) {
            this.limite = limite;
        }else{
            System.out.println("Limite Invalido");
        }
    }

    public String toString() {
       /*
        return "Banco: " + super.getBanco() +
                "\nAgencia: " + super.getAgencia() +
                "\nConta: " + super.getConta() +
                "\nSaldo: " + super.getSaldo() +
                "\nLimite: " + this.limite;
        */
        return super.toString() + "\nLimite: " + this.limite;
    }

    public  void sacar(double valor){
        if(valor <= (super.getSaldo() + this.limite)){
            super.setSaldo((super.getSaldo()- valor) ); ;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
