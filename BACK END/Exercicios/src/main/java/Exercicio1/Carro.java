package Exercicio1;

public class Carro {
    String modelo;
    int ano;
    double preco;

     double aplicarDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        return preco - desconto;
    }

     void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$ " + preco);
        System.out.println("-----------------------");
    }
}
