package br.com.juliocnsouza.ocpjp.class_design;

import br.com.juliocnsouza.ocpjp.class_design.graphicshape.Circle;

/**
 * @author Júlio César Nunes de Souza
 * @since dd/MM/yyyy
 * @version 1.0
 */
public class Main {

    public static void main( String[] args ) {
        //metodo toString automaticamente chamado para exibir o objeto
        System.out.println( new Circle() );

        //cria circulo com construtor default
        Circle c1 = new Circle();

        //cria circulo com construtor sobrecarregado
        Circle c2 = new Circle( 10 , 10 , 10 );

        //chamado metodos sobrecarregados
        c1.fillCollor( 10.0f , 12.2f , 9.4f );
        c1.fillCollor( 10 , 12 , 9 );
    }

}
