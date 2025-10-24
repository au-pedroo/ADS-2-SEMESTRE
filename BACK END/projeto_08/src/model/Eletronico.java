package model;

public class Eletronico extends Produto implements Seguranca {
    private int voltagem;

    public Eletronico(int c, String d, double v, int vo) {
        super(c, d, v);
        this.setVoltagem(vo);
        this.imprimirMensagemSeguranca();
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int argVolt) {
        if (argVolt == 110 || argVolt == 220){
            this.voltagem = argVolt;
        } else {
            System.out.println("Voltagem incorreta");
        }
    }

    public String print() {
        String ret;
        ret = super.print();
        ret = ret + "\nVoltagem: " + this.voltagem;
        return ret;
    }

    @Override
    public void imprimirTipoproduto() {
        System.out.println("Eletronico");
    }

    @Override
    public void imprimirMensagemSeguranca() {
        System.out.println("Verificar a voltagem do Produto");
    }
}
