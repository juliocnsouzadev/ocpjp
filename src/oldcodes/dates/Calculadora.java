package oldcodes.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calculadora {

    private static final long DIA_EM_MILIS = 1000 * 60 * 60 * 24;

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
        long diasDif = ( dataDif.getTime() / DIA_EM_MILIS );

        //sem calcular bissextos, já que o milis deve prove-los
        //int bissextos = calcularAnosBissextos( dataInicial , dataFinal );
        //diasDif += bissextos;
        return diasDif + 1; //esse + um é para se contar o dia atual
    }

    private static int calcularAnosBissextos( Date dataInicial , Date dataFinal ) {
        Calendar inicialD = Calendar.getInstance();
        Calendar finalD = Calendar.getInstance();
        inicialD.setTime( dataInicial );
        finalD.setTime( dataFinal );
        int anoI = inicialD.get( Calendar.YEAR );
        int anoF = finalD.get( Calendar.YEAR );
        int bissextos = getBissextos( anoI , anoF );
        return bissextos;
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

    public static void main( String[] args ) {
        if ( args == null || args.length < 2 ) {
            System.out.println( "Programa sem args" );
            return;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd" );

            Date dI = sdf.parse( args[0] );
            Date dF = sdf.parse( args[1] );
            System.out.println( getDias( dI , dF ) );
        }
        catch ( ParseException pe ) {
            System.out.println( "Erro: " + pe.getMessage() );
        }
    }
}
