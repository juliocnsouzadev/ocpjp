package br.com.juliocnsouza.ocpjp.content.class_design.statics;

/**
 * @author Júlio César Nunes de Souza
 */
public class BlocosEstaticosSub extends BlocosEstaticosSuper {

    static {
        System.out.println(
                "\nSUB -> bloco Estatico 1" );
    }

    {
        System.out.println(
                "\nSUB -> bloco NAO Estatico 1" );
    }

    public BlocosEstaticosSub() {
        System.out.println( "\nSUB -> Construtor" );
    }

    static {
        System.out.println(
                "\nSUB -> bloco Estatico 2" );
    }

    {
        System.out.println(
                "\nSUB -> bloco NAO Estatico 2" );
    }

}
