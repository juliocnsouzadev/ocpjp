package br.com.juliocnsouza.ocpjp._2stringparsing;

/**
 * TestSplit.java -> Job:
 * <p>
 * @since 07/05/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TestSplit {

    public static void main( String[] args ) {
        String text = "O jardineiro é Jesus, e as árveres somos nozes";
        String[] splited = text.split( " " );
        for ( String string : splited ) {
            System.out.println( "-> " + string );
        }
    }

}
