package exercicio2;

public class usaProduto {
    public static void main(String[] args) {
        Produto prod1 = new Produto();
        prod1.setMarca("Apple");
        prod1.setFabricante("Apple Inc.");
        prod1.setCod_barras("122653865425747485535353");
        prod1.setPreco(8500f);
        prod1.imprimirDados();

        Produto prod2 = new Produto("Samsung","Samsung Electronics Co., Ltd.","2445367727645892724245535",4700f);
        prod2.imprimirDados();
    }
}
