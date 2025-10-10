package exercicio1;

public class UsarClasses {
    public static void main(String[] args) {
        Corrente cc = new Corrente("Inter", 011, 1122, 1000);
        cc.depositar(100);
        cc.sacar(1100);
        System.out.println(cc);

        Poupanca cp = new Poupanca("Inter", 011, 1122, 1000);
        cp.depositar(100);
        System.out.println(cp);
    }
}
