package br.com.juliocnsouza.ocpjp.content.string_processing;

/**
 * TestParsing.java -> Job:
 * <p>
 * @since 03/05/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TestParsing {

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

        String numQlqer;
        for ( Number number : numbers ) {
            numQlqer = String.valueOf( number );
            String type = number.getClass().getSimpleName();
            System.out.println(
                    "String: " + numQlqer + " foi convertida de um " + type );

            Number numDaStr = null;
            switch ( type ) {
                case "Integer":
                    numDaStr = Integer.parseInt( numQlqer );
                    break;
                case "Double":
                    numDaStr = Double.parseDouble( numQlqer );
                    break;
                case "Float":
                    numDaStr = Float.parseFloat( numQlqer );
                    break;

                case "Short":
                    numDaStr = Short.parseShort( numQlqer );
                    break;

                case "Byte":
                    numDaStr = Byte.parseByte( numQlqer );
                    break;
            }
            System.out.println(
                    "String numQlqer " + numQlqer + " convertido para " + numDaStr.getClass().getSimpleName() + " com o valor de: " + numDaStr );
        }

    }

}
