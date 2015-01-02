package br.com.juliocnsouza.ocpjp._2locale;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class TestesLocale {

    public static void main( String[] args ) {
        Calendar cal = Calendar.getInstance();
        cal.set( 2015 , 0 , 1 ); //1 janeiro 2015

        Date data = cal.getTime();

        Locale locItalia = new Locale( "it" , "IT" );
        Locale locPortugal = new Locale( "pt" );
        Locale locBrasil = new Locale( "pt" , "BR" );
        Locale locEUA = new Locale( "en" , "US" );

        DateFormat dfItalia = DateFormat.getDateInstance( DateFormat.FULL , locItalia );
        DateFormat dfPortugal = DateFormat.getDateInstance( DateFormat.FULL , locPortugal );
        DateFormat dfBrasil = DateFormat.getDateInstance( DateFormat.FULL , locBrasil );
        DateFormat dfEUA = DateFormat.getDateInstance( DateFormat.FULL , locEUA );

        List<DateFormat> dfs = Arrays.asList( dfItalia , dfPortugal , dfBrasil , dfEUA );
        List<String> labels = Arrays.asList( "Italia" , "Portugal" , "Brasil" , "Estados Unidos" );

        for ( int i = 0 ; i < labels.size() ; i++ ) {
            System.out.println(
                    labels.get( i ) + " - data formatada: " + dfs.get( i ).format( data ) );
        }
    }
}
