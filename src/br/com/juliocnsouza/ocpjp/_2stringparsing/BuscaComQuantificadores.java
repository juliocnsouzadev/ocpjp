package br.com.juliocnsouza.ocpjp._2stringparsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * BuscaRange.java -> Job:
 * <p>
 * @since 18/01/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class BuscaComQuantificadores {

    public static void main( String[] args ) {
        String texto = "12 0x 0x12 0Xf 0xg 0X0FFFF 7FFFD4";

        String hexa = "0[xX]([0-9a-fA-F])+";

        Pattern p = Pattern.compile( hexa );

        Matcher m = p.matcher( texto );

        System.out.println( "Encontrou:" );
        while ( m.find() ) {
            int start = m.start();
            int end = m.end();
            System.out.println( "start: " + start + "\t->\t" + texto.substring( start , end ) );
        }

    }

}
