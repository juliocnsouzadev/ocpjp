package br.com.juliocnsouza.ocpjp._2dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestesComDateFormat {

    public static void main( String[] args ) {
        Date data = new Date( 1_234_456_789_012L );

        List<DateFormat> dfs = Arrays.asList( DateFormat.getInstance() ,
                                              DateFormat.getDateInstance() ,
                                              DateFormat.getDateInstance( DateFormat.SHORT ) ,
                                              DateFormat.getDateInstance( DateFormat.MEDIUM ) ,
                                              DateFormat.getDateInstance( DateFormat.LONG ) ,
                                              DateFormat.getDateInstance( DateFormat.FULL ) );

        for ( DateFormat df : dfs ) {
            System.out.println( df.format( data ) );
        }

        String dataValida = "10/10/2012";
        String dataInvalida = "dez de outubro de 2012";

        try {
            DateFormat df = DateFormat.getDateInstance();
            Date data1 = df.parse( dataValida );
            System.out.println( "Data válida = " + data1.toString() );
            Date data2 = df.parse( dataInvalida );
            System.out.println( "Data inválida = " + data2.toString() );
        }
        catch ( ParseException pe ) {
            System.out.println( "ParseException: " + pe.getMessage() );
        }

    }

}
