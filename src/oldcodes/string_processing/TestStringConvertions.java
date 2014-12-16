package oldcodes.string_processing;

/**
 * TestStringConvertions.java -> Job:
 * <p>
 * @since 07/05/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TestStringConvertions {

    public static void main( String[] args ) {
        int numInteiro = 1;
        double numDouble = 1.12;
        float numFloat = 1.23f;
        short numShort = 100;
        byte numByte = 8;

        Number[] numbers = { numInteiro ,
                             numDouble ,
                             numFloat ,
                             numShort ,
                             numByte };

        for ( Number number : numbers ) {
            String value = String.valueOf( number );
            System.out.println(
                    "Value " + value + " convertido de " + number.getClass().getSimpleName() + " para String" );
        }
        String value = String.valueOf( true );
        System.out.println( "Value from boolean " + value );
        value = String.valueOf( 'z' );
        System.out.println( "Value from char " + value );

    }

}
