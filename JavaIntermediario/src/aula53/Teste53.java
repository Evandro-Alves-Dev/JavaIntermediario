package aula53;

public class Teste53 {

    public static void main(String[] args) {

        usandoConstantes();

        usandoEnum();
    }

    private static void usandoConstantes(){
        int segunda = DiasSemanasConstantes.SEGUNDA;
        int terca = DiasSemanasConstantes.TERCA;
        int quarta = DiasSemanasConstantes.QUARTA;
        int quinta = DiasSemanasConstantes.QUINTA;
        int sexta = DiasSemanasConstantes.SEXTA;
        int sabado = DiasSemanasConstantes.SABADO;
        int domingo = DiasSemanasConstantes.DOMINGO;

        imprimeDia(DiaSemana.SEGUNDA);
    }

    private static void imprimeDia(DiaSemana dia){
        switch (dia){
            case SEGUNDA:
                System.out.println("Segunda-Feira");
                break;
            case TERCA:
                System.out.println("Terça-Feira");
                break;
            case QUARTA:
                System.out.println("Quarta-Feira");
                break;
            case QUINTA:
                System.out.println("Quinta-Feira");
                break;
            case SEXTA:
                System.out.println("Sexta-Feira");
                break;
            case SABADO:
                System.out.println("Sabado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }

    private static void usandoEnum(){

        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;

        imprimeDia(sabado);
    }
}
