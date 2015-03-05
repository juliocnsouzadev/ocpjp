package br.com.juliocnsouza.ocpjp._2dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

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
        double diasDifD = ( dataDif.getTime() / DIA_EM_MILIS );

        double dif = diasDifD - diasDif;
        if ( dif > 0.5 ) {
            diasDif++;
        }

        return diasDif; //esse + um é para se contar o dia atual
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
