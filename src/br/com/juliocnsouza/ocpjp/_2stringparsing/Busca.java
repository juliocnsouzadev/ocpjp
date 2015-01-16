package br.com.juliocnsouza.ocpjp._2stringparsing;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Busca.java -> Job:
 * <p>
 * @since 16/01/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Busca {

    public static void main( String[] args ) {
        String digitos = "\\d";
        String naoDigitos = "\\D";
        String espacos = "\\s";
        String naoEspacos = "\\S";
        String letras = "\\w";
        String naoLetras = "\\W";
        String boudary = "\\b";
        String naoBoudary = "\\B";

        String texto = "Hoje é dia 16 de janeiro de 2015";

        List<String> listaRegex = Arrays.asList( digitos , naoDigitos , espacos , naoEspacos ,
                                                 letras , naoLetras , boudary , naoBoudary );

        StringBuilder sb = new StringBuilder();
        for ( String regex : listaRegex ) {
            Pattern p = Pattern.compile( regex );
            Matcher m = p.matcher( texto );

            sb.append( "\nPadrão " ).append( regex ).append( " encontrado nas posições:\n" );
            boolean encontrado = false;
            while ( m.find() ) {
                encontrado = true;
                int posicao = m.start();
                sb.append( posicao ).append( "\t" );
            }
            if ( !encontrado ) {
                sb.append( "\t(não encontrado)" );
            }
            sb.append( "\n" );
        }
        sb.append( "\ndo texto:  " ).append( texto );
        System.out.println( sb.toString() );
    }

}
