package exercicio1;

public class Poupanca extends Conta {

    private int aniversario;

    public Poupanca(String banco, int agencia, int conta, int dataaniversario) {
        super(banco, agencia, conta);
        //this.aniversario = dataaniversario;
        this.getAniversario();
    }

    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        if (aniversario >= 1 && aniversario <= 30){
            this.aniversario = aniversario;
        }else{
            System.out.println("Anversario invalido");
        }
    }

    public String toString(){
        return "Banco: " + super.getBanco() +
                "\nAgencia: " + super.getAgencia() +
                "\nConta: " + super.getConta() +
                "\nSaldo: " + super.getSaldo() +
                "\nAniversario: " + this.aniversario;
    }
}
