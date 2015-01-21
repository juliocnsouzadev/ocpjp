package br.com.juliocnsouza.ocpjp._2stringparsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Busca.java -> Job:
 * <p>
 * @since 20/01/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class BuscaPonto {

    public static void main( String[] args ) {
        String ponto = "w.w";

        String texto = "www w w waw ww";

        Pattern p = Pattern.compile( ponto );
        Matcher m = p.matcher( texto );

        while ( m.find() ) {
            int posicao = m.start();
            String txt = texto.charAt( posicao ) + "" + texto.charAt( posicao + 1 ) + "" + texto.charAt(
                    posicao + 2 );
            System.out.println( "Posição: " + posicao + " -> Texto: " + txt );
        }
    }

}
