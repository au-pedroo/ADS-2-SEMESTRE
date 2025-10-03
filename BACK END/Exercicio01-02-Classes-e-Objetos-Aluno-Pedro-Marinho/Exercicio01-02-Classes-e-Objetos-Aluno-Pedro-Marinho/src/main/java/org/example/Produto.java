package org.example;

import java.sql.SQLOutput;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void comprar(int quantidade){
             this.setQuantidade(this.getQuantidade() + quantidade);
    }

    public void vender(int quantidade){
          if(this.getQuantidade() >= quantidade){
              this.setQuantidade(this.getQuantidade() - quantidade);
          }else{
              System.out.println("Quantidade insuficiente");
          }
    }

    public double calcularValorTotal(){
        return this.preco*this.quantidade;
    }

    public boolean estoqueBaixo() {
        if (this.getQuantidade() >= 5) {
            return false;
        } else {
            return true;
        }
    }

    public void exibirInformacoes(){
        System.out.println("Nome do Produto: " + this.getNome());
        System.out.println("Quantidade do Produto: " + this.getQuantidade());
        System.out.println("Preço do Produto: " + this.getPreco());
        System.out.println("Estoque baixo: " + (this.estoqueBaixo() ? "Sim" : "Não"));
    }

    }



