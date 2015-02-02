package br.com.juliocnsouza.ocpjp._2stringparsing;

/**
 * PrintFTest.java -> Job:
 * <p>
 * @since 02/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class PrintFTest {

    public static void main( String[] args ) {
        int number1 = 432;
        int number2 = 546;

        //formart strings: %[arg_index$][flags][width][.precision]conversion char
        String formatNumber1 = getFormat( 1 , null , null , null , 'd' ); //%1$d
        String formartNumber2 = "%2$d";

        System.out.printf( formartNumber2 + " + " + formatNumber1 + "\n\n" , number1 , number2 );

        int i1 = -123;
        int i2 = 12345;
        String[] flagParenteses = { "(" };
        String formartParenteses = getFormat( 1 , flagParenteses , 7 , null , 'd' );//%1$(7d

        System.out.printf( formartParenteses + "\n" , i1 );
        System.out.printf( "%0,7d" + "\n" , i2 );
        System.out.format( "%+-7d" + "\n" , i2 );
        System.out.printf( "%2$b + %1$5d" + "\n" , i1 , false );

    }

    /**
     *
     * @param argIndex   Um número inteiro seguido diretamente por um $ , isso indica que o
     *                   argumento deve ser impresso nesta posição
     * @param flags      Enquanto muitas bandeiras estão disponíveis , para o exame , você precisa
     *                   saber: ■ - Left - justificar este argumento ■ + Inclua um sinal ( + ou -)
     *                   com este argumento ■ 0 Pad esse argumento com zeros ■ , utilize separadores
     *                   de agrupamento específica de localidade (ou seja , a vírgula no 123456 ) ■
     *                   ( Coloque os números negativos entre parênteses
     * @param width      Esse valor indica o número mínimo de caracteres a serem impressas. (Se você
     *                   quiser agradáveis, até mesmo colunas , você poderá usar esse valor
     *                   extensivamente. )
     * @param precision  Para o exame , você só vai precisar disso quando a formatação de um
     *                   flutuante número de ponto , e, no caso de números de ponto flutuante de
     *                   precisão indica o número de dígitos para imprimir depois do ponto decimal.
     * @param conversion O tipo de argumento que você vai ser a formatação . Você precisa saber: ■ b
     *                   boolean ■ c caractere ■ d inteiro ■ f ponto flutuante ■ s cadeia
     * @return
     */
    private static String getFormat( Integer argIndex , String[] flags , Integer width ,
                                     String precision , char conversion ) {
        StringBuilder sb = new StringBuilder( "%" ); //% é obrigatório no inicio
        if ( argIndex != null ) {
            sb.append( argIndex ).append( "$" );
        }
        if ( flags != null ) {
            for ( String flag : flags ) {
                sb.append( flag );
            }
        }
        if ( width != null ) {
            sb.append( width );
        }
        if ( precision != null ) {
            sb.append( precision );
        }
        sb.append( conversion ); //é obrigatório
        return sb.toString();
    }

}
