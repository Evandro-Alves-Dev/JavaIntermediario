package aula63;

public class ExemploPrintf {

    public static void main(String[] args) {


        System.out.printf("%s", "aprendendo" );
        System.out.printf("%n");
        System.out.printf("%S", "aprendendo" );
        System.out.printf("%n");

        int valor = 123456789;
        System.out.printf("%d", valor);
        System.out.printf("%n");

        double flo = 345.898123456;
        System.out.printf("%f", flo);
        System.out.printf("%n");

        String ol = "Ola, Mundo";
        System.out.printf("%20s", ol);
        System.out.printf("%n");
        System.out.printf("%-20s", ol);
        System.out.printf("%n");

        int num = 45660;
        System.out.printf("%015d", num);
        System.out.printf("%n");

        System.out.printf("%,d", num);
        System.out.printf("%n");

        int num2 = -100;
        System.out.printf("% d", num2);
        System.out.printf("%n");

        double flo2 = 3.458100;
        System.out.printf("%.2f", flo2);
        System.out.printf("%n");

        double real = 31.49;
        System.out.printf("R$%10.2f", real);
        System.out.printf("%n");

        testeCompleto();

    }

    private  static void testeCompleto(){
        double[] precos = {10000, 256.89, 123.456, 10, 4.989898};

        for (int i=0; i<precos.length; i++){
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i] );
        }
    }
}
