package br.com.juliocnsouza.ocpjp.content.collections.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * ComparatorTest.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class ComparatorTest {

    public static String[] nomes = { "Julio" ,
                                     "Rafael" ,
                                     "Wellington" ,
                                     "Guilherme" ,
                                     "Marilia" ,
                                     "Jessica" ,
                                     "Elaine" ,
                                     "Flavio" };

    public static void main( String[] args ) {
        List<Pessoa> pessoas = new ArrayList<>();
        for ( String string : nomes ) {
            Pessoa p = new Pessoa( string , string.toLowerCase() + "@gmail,com" ,
                                   new Random().nextInt( 50 ) );
            pessoas.add( p );
        }

        System.out.println( "\n\nLista antes de ordenar pelo nome: " + pessoas );
        Collections.sort( pessoas );//ordenando pessoas utiliza o metodo compareTo implementado na classe Pessoa
        System.out.println( "\nLista apos ordenar: " + pessoas + "\n" );

        System.out.println( "\n\nLista antes de ordenar pele idade: " + pessoas );
        Collections.sort( pessoas , new IdadeComparator() );//ordenando pessoas utiliza comparator personalizado para idade
        System.out.println( "\nLista apos ordenar: " + pessoas + "\n" );

        System.out.println( "\n\nLista antes de ordenar pelo email: " + pessoas );
        Collections.sort( pessoas , new EmailComparator() );//ordenando pessoas utiliza compartor personalizado para email
        System.out.println( "\nLista apos ordenar: " + pessoas + "\n" );
    }

}
