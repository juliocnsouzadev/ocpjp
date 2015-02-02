package br.com.juliocnsouza.ocpjp._2stringparsing;

/**
 * TokenizingSplit.java -> Job:
 * <p>
 * @since 01/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TokenizingSplit {

    public static void main( String[] args ) {
        String texto = "abcd5 2xy 55 az";
        String regex = "\\d";

        String[] splited = texto.split( regex );

        for ( String str : splited ) {
            System.out.println( "-> " + str );
            System.out.println( "-> " + str.trim() );
        }
    }

}
