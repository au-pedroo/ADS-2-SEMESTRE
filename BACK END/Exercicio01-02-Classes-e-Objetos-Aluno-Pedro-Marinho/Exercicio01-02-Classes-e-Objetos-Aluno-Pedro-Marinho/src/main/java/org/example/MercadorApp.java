package org.example;

public class MercadorApp {
    public static void main(String[] args) {
        Produto p1 = new Produto("Macarrão",6.0,1);
        Produto p2 = new Produto("Café",60.0,2);
        Produto p3 = new Produto("Bolo",20.0,1);

        System.out.println("Antes das operações ");
        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();

        p1.vender(3);
        p2.comprar(10);
        p3.vender(1);

        System.out.println("\n Depois das operações");
        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();
    }
}
