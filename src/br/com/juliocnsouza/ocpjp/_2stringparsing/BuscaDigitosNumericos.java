package br.com.juliocnsouza.ocpjp._2stringparsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * BuscaDigitosNumericos.java -> Job:
 * <p>
 * @since 14/01/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class BuscaDigitosNumericos {

    public static void main( String[] args ) {
        String padraoBuscado = "\\d"; //regex para digitos numerios
        String texto = "ab123fhr73sfd7r7w8";

        Pattern p = Pattern.compile( padraoBuscado );
        Matcher m = p.matcher( texto );

        StringBuilder sb = new StringBuilder( "Padrão " + padraoBuscado + " entrado: " );
        boolean encontrado = false;
        while ( m.find() ) {
            encontrado = true;
            int posicao = m.start();
            sb.append( "\nposição: " + posicao ).append( "\t- nro encontrado: " ).append(
                    texto.charAt(
                            posicao ) );
        }
        if ( !encontrado ) {
            sb.append( "\n(não encontrado)" );
        }
        sb.append( "\ndo texto:  " + texto );
        System.out.println( sb.toString() );
    }

}
