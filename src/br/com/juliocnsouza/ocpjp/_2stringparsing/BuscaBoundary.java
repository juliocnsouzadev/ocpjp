package br.com.juliocnsouza.ocpjp._2stringparsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * BuscaBoundary.java -> Job:
 * <p>
 * @since 15/01/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class BuscaBoundary {

    public static void main( String[] args ) {
        b();
        B();
    }

    private static void b() {
        String padraoBuscado = "\\b";
        String texto = "123 abc a1b2c3";

        Pattern p = Pattern.compile( padraoBuscado );
        Matcher m = p.matcher( texto );

        StringBuilder sb = new StringBuilder( "Padrão " + padraoBuscado + " encontrado: " );
        boolean encontrado = false;
        while ( m.find() ) {
            encontrado = true;
            int posicao = m.start();
            sb.append( "\nposição: " + posicao );
        }
        if ( !encontrado ) {
            sb.append( "\n(não encontrado)" );
        }
        sb.append( "\ndo texto:  " + texto );
        System.out.println( sb.toString() );
    }

    private static void B() {
        String padraoBuscado = "\\B";
        String texto = "123 abc a1b2c3";

        Pattern p = Pattern.compile( padraoBuscado );
        Matcher m = p.matcher( texto );

        StringBuilder sb = new StringBuilder( "Padrão " + padraoBuscado + " entrado: " );
        boolean encontrado = false;
        while ( m.find() ) {
            encontrado = true;
            int posicao = m.start();
            sb.append( "\nposição: " + posicao );
        }
        if ( !encontrado ) {
            sb.append( "\n(não encontrado)" );
        }
        sb.append( "\ndo texto:  " + texto );
        System.out.println( sb.toString() );
    }

}
