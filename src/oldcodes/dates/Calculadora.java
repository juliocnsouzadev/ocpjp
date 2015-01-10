package oldcodes.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Calculadora.java -> Job:
 * <p>
 * @since 09/01/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Calculadora {

    public static long getDias( Date dataInicial , Date dataFinal ) {

        if ( dataFinal == null || dataInicial == null ) {
            return 0;
        }

        long timeF = dataFinal.getTime();
        long timeI = dataInicial.getTime();

        if ( timeF < timeI ) {
            return 0;
        }

        Date dataDif = new Date( timeF - timeI );

        long dia = 1000 * 60 * 60 * 24;

        long diasDif = ( dataDif.getTime() / dia );

        Calendar inicialD = Calendar.getInstance();
        Calendar finalD = Calendar.getInstance();

        inicialD.setTime( dataInicial );
        finalD.setTime( dataFinal );

        int anoI = inicialD.get( Calendar.YEAR );
        int anoF = finalD.get( Calendar.YEAR );

        int bissextos = getBissextos( anoI , anoF );

        diasDif += bissextos;

        return diasDif;
    }

    private static int getBissextos( int anoI , int anoF ) {
        int counter = 0;
        for ( int i = anoI ; i <= anoF ; i++ ) {
            if ( i % 4 == 0 ) {
                counter++;
            }
        }
        return counter;
    }

    public static void main( String[] args )
            throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat( "dd/MM/yyyy" );

        Date dI = sdf.parse( "10/01/2014" );
        Date dF = new Date();
        System.out.println( "Data inicial:" + dI );
        System.out.println( "Data final: " + dF );
        System.out.println( "Diferença dias " + getDias( dI , dF ) );

    }

}
