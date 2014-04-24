package br.com.juliocnsouza.ocpjp.content.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * TestCollectionsFuncionalitys.java -> Job:
 * <p>
 * @since 01/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TestCollectionsFuncionalitys {

    public static void main( String[] args ) {
        List<String> strings = Arrays.asList( "Julio" , "Cesar" , "Nunes" , "de" ,
                                              "Souza" );
        List<String> copy = new ArrayList<>( Collections.nCopies( 5 , "" ) );//inicializa com 5 items "" na lista

        Collections.copy( copy , strings );//as duas listas tem de ser do mesmo tamanho para realizar a cópias
        System.out.println( "\nlista orginal: " + strings );
        System.out.println( "lista copiada: " + copy );

        Collections.reverse( strings );
        System.out.println( "\nlista em ordem reversa: " + strings );

        Collections.fill( strings , "oops" ); //preenche a lista de strings com "oops"
        System.out.println( "\nlista com valores trocados: " + strings );

        int binarySearch = Collections.binarySearch( copy , "Nunes" );//busca a posição de um valor  na lista...se encontrado retorna posição senao retorna -1
        System.out.println(
                "\nmostrando a posição de Nunes na lista copiada: " + binarySearch );

        String valorMax = Collections.max( copy );
        System.out.println( "\nmaxima string lista: " + valorMax );

        String valorMin = Collections.min( copy );
        System.out.println( "\nminima string lista: " + valorMin );

        boolean replace = Collections.replaceAll( copy , "Julio" , "Júlio" );
        if ( replace ) {
            System.out.println(
                    "\nlista depois de substituir Julio por Júlio:\n" + copy );
        }

        Collections.swap( copy , 0 , copy.size() - 1 ); // inverte as posições (param)
        System.out.println( "\nlista com Júlio no lugar de Souza:\n" + copy );

        Collections.rotate( copy , -4 ); //muda a posição dos itens da lista, nro de posições é passado pelo param
        System.out.println( "\nlista rotacionada: " + copy );
    }

}
