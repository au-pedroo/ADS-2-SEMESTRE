package org.example;

public class Pessoa {
    String nome;
    double salario;
    double vendas;

    void atualizarRenda(double argRenda) {
        double rendaatualizada = argRenda + ((argRenda *10)/100);
        System.out.println("Renda Atualizada: " + rendaatualizada);
    }
   void bonificar(){
        if (this.salario <= 1000) {
            this.salario += 100;
        }
    }


    void imprimir(double argComissao){
        System.out.println("Nome: " + this.nome +
                "\nRenda: " + this.salario +
                "\nVendas: " + this.vendas +
                "\nComissão: " + argComissao);
    }

    double calcularvenda(){
        if(this.vendas < 2000){
            return 0;
        }
        else if(this.vendas < 3000){
            return (this.vendas * 5)/100;
        }
        else if(this.vendas < 4000){
            return (this.vendas * 7)/100;
        }
        else if(this.vendas < 5000){
            return (this.vendas * 9)/100;
        }
        else {
            return (this.vendas * 12) / 100;
        }
    }
}
