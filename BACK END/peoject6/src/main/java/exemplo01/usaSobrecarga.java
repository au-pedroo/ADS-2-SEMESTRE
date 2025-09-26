package exemplo01;

public class usaSobrecarga {
    public static void main(String[] args) {
        sobreCarga obj_sobrecarga = new sobreCarga();

        double resultado = obj_sobrecarga.somar(5.0,4.0);
        System.out.println(resultado);

        System.out.println(obj_sobrecarga.somar(2.0, 3.5, 9.0));

        System.out.println(obj_sobrecarga.somar(2.0, 3.5, 9.0));
    }
}
