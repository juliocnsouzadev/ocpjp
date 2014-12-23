package br.com.juliocnsouza.ocpjp._1assertions;

/**
 * ReallySimpleAssertion.java -> Job:
 * <p>
 * P
 * <p>
 * @since 22/12/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class SimpleAssertion {

    private double dividirPor2( int paraDividir ) {
        assert ( paraDividir > 0 ) : "Não dá para fazer uma divisão com " + paraDividir;
        return paraDividir / 2;
    }

    /*
     * Importante! É necessário habilitar as assertions para ver o resultado! Se você estiver usando
     * NetBeans siga os passos: 1 clique com o lado direito sobre o projeto e selecione propriedades
     * 2 vá até o campo VM Options e digite: -ea 3 Dê um OK e execute a classe main
     */
    public static void main( String[] args ) {
        SimpleAssertion reallySimple = new SimpleAssertion();
        double resultado = reallySimple.dividirPor2( 12 );
        System.out.println( "Resultado: " + resultado );
        //resultado = reallySimple.dividirPor2( 0 ); //descomente para ver o AssertionError sendo lançado
        System.out.println( "Resultado: " + resultado );
    }

}
