package br.com.juliocnsouza.ocpjp._2dates;

import java.text.DateFormat;
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

    }

}
