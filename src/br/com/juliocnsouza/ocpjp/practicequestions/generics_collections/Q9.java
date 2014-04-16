package br.com.juliocnsouza.ocpjp.practicequestions.generics_collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Q9.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Q9 {

    public static void main( String[] args ) {
        List<AA> l = new ArrayList<>();
        l.add( new AA( "a1" ) );
        l.add( new AA( "z4" ) );
        l.add( new AA( "y3" ) );
        //Collections.sort( l ); nao compila nao implementa Comparable
    }

}

class AA implements Comparator<AA> {

    private String s1;

    public AA( String s1 ) {
        this.s1 = s1;
    }

    @Override
    public int compare( AA o1 , AA o2 ) {
        return o1.s1.compareTo( o2.s1 );
    }

    @Override
    public String toString() {
        return s1;
    }

}
