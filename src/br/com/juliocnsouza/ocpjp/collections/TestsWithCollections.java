package br.com.juliocnsouza.ocpjp.collections;

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
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;

/**
 * TestsWithCollections.java -> Job:
 * <p>
 * @since 08/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TestsWithCollections {

    public static final String SEPARATOR = "\n------------------------------------------------------------------\n";

    public static void main( String[] args ) {
        List<Collection> collections = new ArrayList<>();

        collections.add( new LinkedList<>() );
        collections.add( new ArrayList<>() );
        collections.add( new HashSet<>() );
        collections.add( new LinkedHashSet<>() );
        collections.add( new TreeSet<>() );

        for ( Collection collection : collections ) {
            showHierarchy( collection , Collection.class );
            showHierarchy( collection , Collection.class );
        }

        List<Map<String , String>> maps = new ArrayList<>();
        maps.add( new HashMap<String , String>() );
        maps.add( new TreeMap<String , String>() );
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
