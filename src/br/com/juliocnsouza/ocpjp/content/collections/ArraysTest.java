package br.com.juliocnsouza.ocpjp.content.collections;

import java.util.Arrays;
import java.util.List;

/**
 * ArraysTest.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class ArraysTest {

    public static void main( String[] args ) {
        String[] nomes = { "Julio" ,
                           "Rafael" ,
                           "Wellington" ,
                           "Guilherme" ,
                           "Marilia" ,
                           "Jessica" ,
                           "Elaine" ,
                           "Flavio" };

        String[] nomes2 = { "Julio" ,
                            "Rafael" ,
                            "Wellington" ,
                            "Guilherme" ,
                            "Marilia" ,
                            "Jessica" ,
                            "Elaine" ,
                            "Flavio" };

        List<String> nomesDeArraysAsList = Arrays.asList( nomes ); //cria List de um array
        List<Integer> numerosDeArraysAsList = Arrays.asList( 1 , 2 , 3 , 4 , 5 ); //cria List de um var args
        System.out.println(
                "Criados com Arrays.asList:\n" + nomesDeArraysAsList + "\n" + numerosDeArraysAsList );

        int buscaBinariaNoArray = Arrays.binarySearch( nomes , "Guilherme" );
        System.out.println( "\nIndex de Guilherme: " + buscaBinariaNoArray );

        boolean igualdadeArrays = Arrays.equals( nomes , nomes2 );
        System.out.println( "\nnomes é igual a nomes2?: " + ( igualdadeArrays
                                                              ? "Sim"
                                                              : "Não" ) );

        Arrays.fill( nomes2 , "uhuu!" ); //preenche o array com o valor passado
        System.out.println( "\nnovo array de nomes 2: " + Arrays.toString(
                nomes2 ) ); //mostra usando toString para array

        Arrays.sort( nomes ); //ordena usando compareTo do tipo que contem no caso String
        System.out.println( "\nnomes ordenados: " + Arrays.toString( nomes ) );
    }

}
