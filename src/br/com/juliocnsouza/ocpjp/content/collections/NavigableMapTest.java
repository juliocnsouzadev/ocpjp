package br.com.juliocnsouza.ocpjp.content.collections;

import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;

/**
 * NavigableMapTest.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class NavigableMapTest {

    public static void main( String[] args ) {
        NavigableMap<Integer , String> notas = new TreeMap<>();
        String[] nomes = { "Julio" ,
                           "Rafael" ,
                           "Wellington" ,
                           "Guilherme" };
        Random random = new Random();
        for ( String string : nomes ) {
            notas.put( random.nextInt( 100 ) , string );
        }

        System.out.println( "Dados no map: " + notas );

        System.out.println(
                "\nDados em ordem descrescente: " + notas.descendingMap() );

        System.out.println( "\nQuem foi aprovado: " + notas.tailMap( 60 ) ); //retorna os volores para chaves >= 60 em um Set

        System.out.println( "\nMenor nota: " + notas.firstEntry() ); //mostra a primeira chave e como estao ordenadas é a menor
    }

}
