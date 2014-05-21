package br.com.juliocnsouza.ocpjp.content.string_processing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TestsRegex.java -> Job:
 * <p>
 * @since 21/05/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TestsRegex {

    public static void main( String[] args ) {
        String text = "julio";
        System.out.println( "Is text only words? " + matches( "\\w+" , text ) );
        System.out.println( "Is text only digits? " + matches( "\\d+" , text ) );

        String address = "Rua Santa Catarina, 234 - Bloco 12 - Apto 103";
        System.out.println( "Quais os numeros no endereço?" );
        showMatches( "\\d+" , address );
        System.out.println( "Quais as palavras no endereço?" );
        showMatches( "\\w+" , address );

        String data = "11/12/2001";
        System.out.println( "Is data? " + matches(
                "^([1-9]|0[1-9]|[1,2][0-9]|3[0,1])/([1-9]|1[0,1,2])/\\d{4}$" ,
                data ) );

        String email = "juliocnsouzadev@gmail.com";
        System.out.println( "Is email? " + matches(
                "^([0-9a-zA-Z]+([_.-]?[0-9a-zA-Z]+)*@[0-9a-zA-Z]+[0-9,a-z,A-Z,.,-]*(.){1}[a-zA-Z]{2,4})+$" ,
                data ) );
        System.out.println( "Is email? " + matches(
                "^([0-9a-zA-Z]+([_.-]?[0-9a-zA-Z]+)*@[0-9a-zA-Z]+[0-9,a-z,A-Z,.,-]*(.){1}[a-zA-Z]{2,4})+$" ,
                email ) );

    }

    public static boolean matches( String pattern , String toVerify ) {
        Pattern p = Pattern.compile( pattern );
        Matcher m = p.matcher( toVerify );
        return m.matches();
    }

    public static void showMatches( String pattern , String toVerify ) {
        Pattern p = Pattern.compile( pattern );
        Matcher m = p.matcher( toVerify );
        while ( m.find() ) {
            System.out.println( "Encontrou: " + m.group() );
        }
    }

}
