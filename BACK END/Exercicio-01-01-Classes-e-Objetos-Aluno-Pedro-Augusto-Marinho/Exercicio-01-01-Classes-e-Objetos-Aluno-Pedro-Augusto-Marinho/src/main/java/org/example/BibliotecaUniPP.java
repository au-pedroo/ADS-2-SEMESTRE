package org.example;

public class BibliotecaUniPP {
    public static void main(String[] args) {

        Livro l1 = new Livro("O Eco das Estrelas","Helena Duarte",328);
        Livro l2 = new Livro("A Última Chave","Marcos Azevedo",412);
        Livro l3 = new Livro("Cicatrizes do Tempo","Lúcia Ramos",267);

        l1.emprestar();
        l1.ler(160);
        l1.exibirInformacoes();
        System.out.println("Progresso : "+ l1.verProgresso());
        l1.devolver();

        l2.emprestar();
        l2.ler(260);
        l2.exibirInformacoes();
        System.out.println("Progresso : "+ l2.verProgresso());
        l2.devolver();

        l3.emprestar();
        l3.ler(90);
        l3.exibirInformacoes();
        System.out.println("Progresso : "+ l3.verProgresso());
        l3.devolver();




    }
}
