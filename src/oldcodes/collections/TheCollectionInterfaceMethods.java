package oldcodes.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * TheCollectionInterfaceMethods.java -> Job:
 * <p>
 * @since 14/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TheCollectionInterfaceMethods {

    public static void main( String[] args ) {
        Collection<String> list = new ArrayList<>(); //simples declaração e instanciação
        boolean adicionou = list.add( "Nova String" ); // metodo add retorna um valor booleano quando adiciona valor na coleção
        System.out.println( "Adicionou na lista ? " + ( adicionou
                                                        ? "Sim"
                                                        : "Não" ) ); //vai printar sim pois adicionou na lista

        System.out.println( "\nLista antes do clear: " + list );
        list.clear();//remove todos elementos da lista
        System.out.println( "Lista depois do clear " + list );

        boolean listaVazia = list.isEmpty(); //metodo retorna boolean se a coleção esta vazia ou nao
        System.out.println( "\nLista está vazia? " + ( listaVazia
                                                       ? "Sim"
                                                       : "Não" ) );

        list.add( "Julio" );//adicionando valores para percorrer a lista
        list.add( "Cesar" );
        Iterator<String> iterator = list.iterator(); //retorna um iterator para percorrer a coleção
        System.out.println( "\nPercorrendo com iterator" );
        while ( iterator.hasNext() ) {
            System.out.println( iterator.next() );
        }

        boolean removeuJulio = list.remove( "Julio" ); //metodo remove retorna um boolean confirmando a remoção
        System.out.println( "\nRemoveu Julio? " + ( removeuJulio
                                                    ? "Sim"
                                                    : "Não" ) ); // vai printar que sim

        Object[] array = list.toArray(); //retorna uma array de objects e não do tipo passado entre <>, já que este é removido após a compilação
        for ( Object object : array ) {
            System.out.println(
                    "\nFazendo cast de Object para String de: " + ( String ) object );
        }

        Collection<String> outraLista = new ArrayList<>();
        outraLista.add( "String da outra lista" );
        boolean adicionouLista = list.addAll( outraLista ); // retorna booleano confirmando adicição de todos itens de um coleção dentro da outra
        System.out.println( "\nAdicionou outra lista? " + ( adicionouLista
                                                            ? "Sim"
                                                            : "Não" ) ); // vai printar que sim
        System.out.println( "Mostrando lista" + list );

        boolean contemElementos = list.containsAll( outraLista ); //retorna boolean se os elementos da outra lista estao contidos na lista
        System.out.println(
                "\nContem elementos da outra lista na list?" + ( contemElementos
                                                                 ? "Sim"
                                                                 : "Nao" ) ); //printa sim

        boolean reteveTodos = list.retainAll( outraLista ); //retorna booleano se os elementos foram retidos
        System.out.println( "\nReteve ? " + ( reteveTodos
                                              ? "Sim"
                                              : "Não" ) ); //printa sim
        System.out.println( "Lista " + list ); // lista agora tem apenas os elementos em comum com outralista
    }

}
