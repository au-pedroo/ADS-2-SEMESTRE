package Exercicio1;

public class usaClasses {
    public static void main(String[] args) {
        Carro cr = new Carro();
        Carro cr2 = new Carro();

        cr.modelo = "Honda Civic";
        cr.ano = 2020;
        cr.preco = 70000.0;

        cr2.modelo = "Chevrolet Onix";
        cr2.ano = 2022;
        cr2.preco = 40000.0;

        cr.exibirInformacoes();
        cr2.exibirInformacoes();
    }
}
