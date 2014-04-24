package br.com.juliocnsouza.ocpjp.content.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * HashSetTest.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class HashSetTest {

    public static void main( String[] args ) {
        String sheldonsKnock = "Penny..., Penny..., Penny...";

        StringBuilder normalKnockBuilder = new StringBuilder();
        Set<String> words = new HashSet<>();
        words.addAll( Arrays.asList( sheldonsKnock.split( "\\W+" ) ) );
        for ( String string : words ) {
            normalKnockBuilder.append( string ).append( " " );
        }
        System.out.println( "Sheldon's knock: " + sheldonsKnock );
        System.out.println( "Nomal knock: " + normalKnockBuilder.toString() );
    }

}
