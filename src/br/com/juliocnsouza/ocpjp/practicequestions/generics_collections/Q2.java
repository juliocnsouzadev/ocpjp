package br.com.juliocnsouza.ocpjp.practicequestions.generics_collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Q2.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Q2 {

    public void m( List<Integer> l ) {
        System.out.print( l.size() );
    }

    public void m1() {
        List<Integer> l = new ArrayList<>();//1
        l.add( 1 );
        l.add( 2 );
        m( l );
        //m( new ArrayList<>() ); nao compila
    }

    public static void main( String[] args ) {
        Q2 obj = new Q2();
        obj.m1();
    }
}
