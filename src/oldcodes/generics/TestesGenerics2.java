package oldcodes.generics;

import java.io.Serializable;

/**
 * TestesGenerics2.java -> Job:
 * <p>
 * @since 07/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TestesGenerics2 {

    public static void main( String[] args ) {
        ObjetoTeste<String , Integer> test1 = new ObjetoTeste<>( "String" , 10 );
        ObjetoTeste<? , ?> teste = new ObjetoTeste<>( 12.3f , 's' );
        ObjetoTeste<? extends Serializable , String> teste3 = new ObjetoTeste<>(
                1.00f ,
                "String" );

    }

}
