package br.com.juliocnsouza.ocpjp.generics;

import java.util.Arrays;
import java.util.List;

/**
 * TestGenerics.java -> Job:
 * <p>
 * @since 01/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TestGenerics {

    public static void main( String[] args ) {
        DoSeuTipo<String> tipoString = new DoSeuTipo<>( "uma bela string" );
        DoSeuTipo<Integer> tipoInteger = new DoSeuTipo<>( 1000 );
        System.out.println( tipoString );
        System.out.println( tipoInteger );
        System.out.println( "\n--------------------------------------------\n" );
        DeSeusTipos<String , String , String , String> sohAsStrings = new DeSeusTipos<>(
                "uma string" , "duas strings" , "três strings" ,
                "quatro strings" );
        DeSeusTipos<Integer , Double , Character , List<Integer>> variados = new DeSeusTipos<>(
                1 , 123.12 , 'Z' , Arrays.asList( 10 , 20 , 30 , 40 )
        );
        System.out.println( sohAsStrings );
        System.out.println( variados );
        System.out.println( "\n--------------------------------------------\n" );
        DoSeuTipo<DeSeusTipos<String , String , String , String>> genericDeGeneric = new DoSeuTipo<>(
                sohAsStrings );
        DoSeuTipo<DeSeusTipos<Integer , Double , Character , List<Integer>>> genericDeGeneric2 = new DoSeuTipo<>(
                variados );
        System.out.println( genericDeGeneric );
        System.out.println( genericDeGeneric2 );

        System.out.println( "\n--------------------------------------------\n" );
        System.out.println( "-> WildCard" );
        List<Integer> inteiros = Arrays.asList( 1 , 2 , 3 , 4 , 5 );
        List<String> strings = Arrays.asList( "a" , "b" , "c" , "d" );
        List<?> listaQleqr = Arrays.asList( 10 , 20 , 30 , "40" , "50" );
        List<? extends Number> listaNrosQlquer = Arrays.asList( 100 , 100.5 ,
                                                                100.99f ,
                                                                new Byte( "101" ) ,
                                                                new Short( "102" ) );
        showList( inteiros );
        showList( strings );
        showList( listaQleqr );
        showList( listaNrosQlquer );
    }

    public static void showList( List<?> list ) {
        for ( Object object : list ) {
            System.out.print( object );
            System.out.print( "\t" );
        }
        System.out.print( "\n" );
    }
}
