package oldcodes.collections;

import java.util.Arrays;
import java.util.List;

/**
 * ArrayAsListTest.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class ArrayAsListTest {

    public static void main( String[] args ) {
        String[] arrayStrings = { "a" ,
                                  "b" ,
                                  "c" };

        List<String> listaAceitarAdd = Arrays.asList( arrayStrings );
        try {
            listaAceitarAdd.add( "d" ); // lança uma runtime exception
        }
        catch ( RuntimeException re ) {
            System.out.println(
                    "nao eh possivel inserir itens em uma lista vinda de Arrays.asList" );
        }
        System.out.println( "lista nao permite inserção: " + listaAceitarAdd );

        listaAceitarAdd.set( 0 , "z" ); // mas permite alterar
        System.out.println( "\ntroquei a por z" );
        System.out.println(
                "lista nao permite inserção, mas permite alteração: " + listaAceitarAdd );
    }

}
