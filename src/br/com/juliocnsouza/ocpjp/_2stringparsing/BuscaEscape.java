package br.com.juliocnsouza.ocpjp._2stringparsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * BuscaGananciosaRelutante.java -> Job:
 * <p>
 * @since 20/01/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class BuscaEscape {

    public static void main( String[] args ) {
        String qualquerCoisa = ".";
        String apenasPonto = "\\.";
        String apenasAsterisco = "\\*";

        String texto = "asda.afa*a";

        find( qualquerCoisa , texto );
        find( apenasPonto , texto );
        find( apenasAsterisco , texto );
    }

    private static void find( String pattern , String texto ) {
        Pattern p = Pattern.compile( pattern );
        Matcher m = p.matcher( texto );
        System.out.println( "\nPattern: " + pattern );
        while ( m.find() ) {
            int posicao = m.start();

            System.out.println( "Posição: " + posicao );
        }
    }
}
