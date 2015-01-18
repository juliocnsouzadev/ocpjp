package br.com.juliocnsouza.ocpjp._2stringparsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * BuscaRange.java -> Job:
 * <p>
 * @since 17/01/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class BuscaRange {

    public static void main( String[] args ) {
        String alfabetoLC = "abcdefghijklmnopqrtuvywxz";
        String alfabetoUP = alfabetoLC.toUpperCase();

        String intervalo = "[c-jC-J]";

        Pattern p = Pattern.compile( intervalo );

        Matcher m = p.matcher( alfabetoLC );

        System.out.println( "LowerCase" );
        while ( m.find() ) {
            System.out.print( m.start() );
        }

        m = p.matcher( alfabetoUP );

        System.out.println( "\n\nUpperCase" );
        while ( m.find() ) {
            System.out.print( m.start() );
        }
    }

}
