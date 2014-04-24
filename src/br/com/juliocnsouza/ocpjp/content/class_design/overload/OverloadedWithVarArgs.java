package br.com.juliocnsouza.ocpjp.content.class_design.overload;

/**
 * OverloadedWithVarArgs.java -> Job:
 * <p>
 * @since 05/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class OverloadedWithVarArgs {

    public String metodo( int i , int x ) {
        return "a";
    }

    public String metodo( int... values ) {
        return "b";
    }

    public static void main( String[] args ) {
        OverloadedWithVarArgs obj = new OverloadedWithVarArgs();
        System.out.println( obj.metodo( 1 , 2 ) ); // metodo que aceita 2 inteiros terá preferencia
    }

}
