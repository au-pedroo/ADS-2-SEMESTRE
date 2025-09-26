package exemplo02;


import javax.swing.*;

public class usaConta {
    public static void main(String[] args) {

//        int agencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a agencia da conta: "));
//        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: "));
//        Conta c1 = new Conta(agencia, numero);
//        c1.depositar(100);
//        c1.sacar(50);
//        JOptionPane.showMessageDialog(null, c1.imprimirDados());

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digita o número da conta: "));
        Conta c1 = new Conta(numero);
        c1.depositar(100);
        c1.sacar(50);
        JOptionPane.showMessageDialog(null, c1.imprimirDados());




    }
}
