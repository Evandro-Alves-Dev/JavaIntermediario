package aula61;

public class PassagemValorParametro {

    public static void main(String[] args) {

        Contato contato = new Contato("Contato1 ", "1234-5678", "contato1@gmail.com");
        int valor = 10;

        System.out.println(contato);
        System.out.println(valor );

        testePassagemValorReferencia2(valor, contato);
    }

    private static void testePassagemValorReferencia2(int valor, Contato contato){
        int novoValor = valor + 10;
        valor = novoValor;

        contato.setNome("Contato"+novoValor);
    }
}
