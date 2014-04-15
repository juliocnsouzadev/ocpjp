package br.com.juliocnsouza.ocpjp.collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSetTest.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TreeSetTest {

    public static void main( String[] args ) {
        String stringZuada = "a b a b d e f g g f a 0 c d f 1 3 3 2 a f b";
        Set<String> treeSet = new TreeSet<>();
        treeSet.addAll( Arrays.asList( stringZuada.split( "\\W+" ) ) );
        StringBuilder apenasValoresUnicosOrdenados = new StringBuilder();
        for ( String string : treeSet ) {
            apenasValoresUnicosOrdenados.append( string ).append( " " );
        }
        System.out.println( "String zuada " + stringZuada );
        System.out.println(
                "Apenas seus valores unicos e ordenados: " + apenasValoresUnicosOrdenados.toString() );
    }

}
