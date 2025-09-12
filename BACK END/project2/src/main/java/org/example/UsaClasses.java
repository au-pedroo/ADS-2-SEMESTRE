package org.example;

public class UsaClasses {
    public static void main(String[] args) {
        Pessoa obj_p1 = new Pessoa();//Criação do Objeto
        Pessoa obj_p2 = new Pessoa();

        //Atribuição de valores para os atributos do objeto
        obj_p1.nome = "Pedro";
        obj_p1.salario = 1500.0;
        obj_p1.vendas = 2500;
        obj_p1.calcularvenda();

        obj_p2.nome = "Maria";
        obj_p2.salario = 2000.0;
        obj_p2.vendas = 1600;

        //Impressão dos Valores dos atributos do objeto

        obj_p1.imprimir(obj_p1.calcularvenda());
        obj_p1.bonificar();
        obj_p1.atualizarRenda(obj_p1.salario);


        obj_p2.imprimir(obj_p2.calcularvenda());
        obj_p2.bonificar();
        obj_p2.atualizarRenda(obj_p2.salario);
    }

}
