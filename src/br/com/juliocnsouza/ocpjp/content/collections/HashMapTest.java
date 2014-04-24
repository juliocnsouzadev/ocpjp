package br.com.juliocnsouza.ocpjp.content.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * HashMapTest.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class HashMapTest {

    public static final String ENCONTROU_DOUBLE = "encontrou double";
    public static final String A_DOUBLE = "Double";
    public static final String ENTROU_INTERGER = "entrou interger";

    public static final String ENCONTROU_STRING = "encontrou string";
    public static final String INTEGER = "Integer";
    public static final String STRING = "String";

    public static void test() {

        System.out.println( "\nUsando if:" );
        String str = STRING;
        if ( str.equals( STRING ) ) {

            System.out.println( ENCONTROU_STRING );
        }
        if ( str.equals( INTEGER ) ) {
            System.out.println( ENTROU_INTERGER );
        }
        if ( str.equals( A_DOUBLE ) ) {
            System.out.println( ENCONTROU_DOUBLE );
        }

        System.out.println( "\nUsando Map" );
        Map<String , String> hashMap = new HashMap<>();
        hashMap.put( STRING , ENCONTROU_STRING );
        hashMap.put( INTEGER , ENTROU_INTERGER );
        hashMap.put( A_DOUBLE , ENCONTROU_DOUBLE );
        System.out.println( hashMap.get( str ) );

        System.out.println( "\nMostrando HashMap que não ordena itens" );
        System.out.println( hashMap );

        Map<String , String> treeMap = new TreeMap<>( hashMap );
        System.out.println( "\nMostrando TreeMap que ordena itens" );
        System.out.println( treeMap );
    }

    public static void main( String[] args ) {
        test();
    }

}
