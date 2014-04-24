package br.com.juliocnsouza.ocpjp.content.class_design.statics;

/**
 * @author Júlio César Nunes de Souza
 */
public class BlocosMain {

    public static void main( String[] args ) {
        new BlocosEstaticosSub();
        //output:
//      SUPER -> bloco Estatico 1
//
//      SUPER -> bloco Estatico 2
//
//      SUB -> bloco Estatico 1
//
//      SUB -> bloco Estatico 2
//
//      SUPER -> bloco NAO Estatico 1
//
//      SUPER -> bloco NAO Estatico 2
//
//      SUPER -> Construtor
//
//      SUB -> bloco NAO Estatico 1
//
//      SUB -> bloco NAO Estatico 2
//
//      SUB -> Construtor
    }

}
