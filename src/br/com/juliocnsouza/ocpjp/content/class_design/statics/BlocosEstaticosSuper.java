package br.com.juliocnsouza.ocpjp.content.class_design.statics;

/**
 * @author Júlio César Nunes de Souza
 */
public class BlocosEstaticosSuper {

    static {
        System.out.println(
                "\nSUPER -> bloco Estatico 1" );
    }

    {
        System.out.println(
                "\nSUPER -> bloco NAO Estatico 1" );
    }

    public BlocosEstaticosSuper() {
        System.out.println( "\nSUPER -> Construtor" );
    }

    static {
        System.out.println(
                "\nSUPER -> bloco Estatico 2" );
    }

    {
        System.out.println(
                "\nSUPER -> bloco NAO Estatico 2" );
    }

}
