package br.com.juliocnsouza.ocpjp._2numberformat;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class TestesNumberFormat {

    public static void main( String[] args ) {

        float number = 234.5678f;

        Locale locBrasil = new Locale( "pt" , "BR" );
        Locale locEUA = new Locale( "en" , "US" );

        List<NumberFormat> nfs = Arrays.asList( NumberFormat.getInstance() ,
                                                NumberFormat.getInstance( locBrasil ) ,
                                                NumberFormat.getInstance( locEUA ) ,
                                                NumberFormat.getCurrencyInstance() ,
                                                NumberFormat.getCurrencyInstance( locBrasil ) ,
                                                NumberFormat.getCurrencyInstance( locEUA )
        );
        List<String> labels = Arrays.asList( "Nro Default" ,
                                             "Nro Brasil" ,
                                             "Nro EUA" ,
                                             "Moeda Defaut" ,
                                             "Moeda Brasil" ,
                                             "Moeda EUA" );

        for ( int i = 0 ; i < labels.size() ; i++ ) {
            System.out.println(
                    labels.get( i ) + ": " + nfs.get( i ).format( number ) );
        }
    }
}
