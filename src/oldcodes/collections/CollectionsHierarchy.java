package oldcodes.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;

/**
 * CollectionsHierarchy.java -> Run this class to see the hierarchy of
 * Collections frameword classes and interfaces:
 * <p>
 * @since 08/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class CollectionsHierarchy {

    public static final String SEPARATOR = "\n------------------------------------------------------------------\n";

    public static void main( String[] args ) {
        List<Collection> collections = new ArrayList<>();

        collections.add( new LinkedList<>() ); /*
         * LinkedList implementa internamente uma estrutura duplamente linkada,
         * mais rápida para inserir ou remover elementos, porém lenta para
         * buscar elementos. Pode ser usada coo uma Stack (LIFO) ou comoco queue
         * (FIFO). Permite duplicatas
         */

        collections.add( new ArrayList<>() ); /*
         * ArrayList - implementada como um array de tamanho ajustavel. Rápida
         * para buscar, mas lenta para inserir ou deletar. Permite duplicatas
         */

        collections.add( new HashSet<>() );/*
         * HashSet - internamente implementada com uma hash-table. Nao permite
         * duplicatas. Rapida para buscar e reter elementos, nao mantem uma
         * ordem para os elementos armazenados
         */

        collections.add( new LinkedHashSet<>() );/*
         *
         */

        collections.add( new TreeSet<>() );/*
         * TreeSet, nao permite duplicatas, arzena elementos ordenados, utiliza
         * uma estrutura de arvore para decidir onde armazenar ou buscar
         * elementos
         */

        collections.add( new PriorityQueue<String>() );/*
         * Implementada com uma estrutura de dados heap, é usada para recuperar
         * elementos baseado em prioridade, independente da ordem de inserção.
         */

        for ( Collection collection : collections ) {
            showHierarchy( collection , Collection.class );
            showHierarchy( collection , Collection.class );
        }

        List<Map<String , String>> maps = new ArrayList<>();
        maps.add( new HashMap<String , String>() );/*
         * Usa hashing para encontrar um lucar para buscar ou armazenar um par
         * chave: valor. Inserir ou adicionar é muito rápido. nao armazena os
         * elementos em nenhuma orde
         */

        maps.add( new TreeMap<String , String>() );/*
         * Armazena os elementos ordenados, utiliza uma estrutura de arvore para
         * decidir onde armazenar ou buscar por chaves
         */

        maps.add( new WeakHashMap<String , String>() );
        maps.add( new LinkedHashMap<String , String>() );
        maps.add( new IdentityHashMap<String , String>() );

        for ( Map<String , String> map : maps ) {
            showHierarchy( map , Map.class );
        }

    }

    public static void showHierarchy( Object o , Class clazzInstance ) {
        System.out.println( SEPARATOR );
        System.out.println(
                o.getClass().getSimpleName() + " é " + clazzInstance.getSimpleName() );

        showInterfaces( o.getClass() );
        showSuperclasses( o.getClass() );
        System.out.println( SEPARATOR );
    }

    public static void showInterfaces( Class clazz ) {

        Class[] types = clazz.getInterfaces();
        if ( types == null || types.length == 0 ) {

            System.out.println( clazz.getName() + " implements nothing" );
            return;
        }
        for ( Class type : types ) {
            System.out.println( clazz.getName() + " implements " + type );
            showInterfaces( type );
        }
    }

    public static void showSuperclasses( Class clazz ) {

        Class type = clazz.getSuperclass();
        if ( type == null ) {
            System.out.println( clazz.getName() + " extends nothing" );
            return;
        }
        System.out.println( clazz.getName() + " extends " + type );
        showSuperclasses( type );
    }

}
