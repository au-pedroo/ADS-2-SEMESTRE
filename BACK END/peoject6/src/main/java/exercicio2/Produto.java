package exercicio2;

public class Produto {
    String marca;
    String fabricante;
    String cod_barras;
    Float preco;

    public Produto() {
    }

    public Produto(String marca, String fabricante, String cod_barras, Float preco) {
        this.setMarca(marca);
        this.setFabricante(fabricante);
        this.setCod_barras(cod_barras);
        this.setPreco(preco);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public void imprimirDados(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Código de Barras: " + this.cod_barras);
        System.out.println("Preço R$: " + this.preco);

    }
}
