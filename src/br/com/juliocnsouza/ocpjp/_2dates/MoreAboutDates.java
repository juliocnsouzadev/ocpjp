package br.com.juliocnsouza.ocpjp._2dates;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/**
 * MoreAboutDates.java -> Job:
 * <p>
 * @since 08/02/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class MoreAboutDates {

    public static void main( String[] args ) {
        iniciandoCalendar();
        addVersusRoll();
        formatandoDatas();
    }

    private static void formatandoDatas() {
        List<DateFormat> dfs = Arrays.asList( DateFormat.getInstance() ,
                                              DateFormat.getDateInstance() ,
                                              DateFormat.getDateInstance( DateFormat.SHORT ) ,
                                              DateFormat.getDateInstance( DateFormat.MEDIUM ) ,
                                              DateFormat.getDateInstance( DateFormat.LONG ) ,
                                              DateFormat.getDateInstance( DateFormat.FULL ) ,
                                              DateFormat.getDateInstance( DateFormat.SHORT ,
                                                                          Locale.ITALIAN ) ,
                                              DateFormat.getDateInstance( DateFormat.MEDIUM ,
                                                                          Locale.ITALIAN ) ,
                                              DateFormat.getDateInstance( DateFormat.LONG ,
                                                                          Locale.ITALIAN ) ,
                                              DateFormat.getDateInstance( DateFormat.FULL ,
                                                                          Locale.ITALIAN ) ,
                                              DateFormat.getDateInstance( DateFormat.SHORT ,
                                                                          Locale.GERMAN ) ,
                                              DateFormat.getDateInstance( DateFormat.MEDIUM ,
                                                                          Locale.GERMAN ) ,
                                              DateFormat.getDateInstance( DateFormat.LONG ,
                                                                          Locale.GERMAN ) ,
                                              DateFormat.getDateInstance( DateFormat.FULL ,
                                                                          Locale.GERMAN ) );
        Calendar cal = Calendar.getInstance();
        for ( DateFormat df : dfs ) {
            System.out.println( "Data formatada: " + df.format( cal.getTime() ) );
            System.out.println( "" );
        }
    }

    private static void addVersusRoll() {
        Calendar cal = Calendar.getInstance();
        System.out.println( "Data: " + cal.getTime() );//saida do dia: Data: Sun Feb 08 11:19:08 BRST 2015
        cal.add( Calendar.MONTH , 13 ); //adiciona um ano e 1 mês
        System.out.println( "Data + 13 meses: " + cal.getTime() );//saida do dia: Data + 13 meses: Tue Mar 08 11:21:29 BRT 2016
        cal.roll( Calendar.MONTH , 13 ); //adiciona 13 meses, mas nao muda o ano
        System.out.println( "Data + 13 meses com roll: " + cal.getTime() );//saida do dia: Data + 13 meses com roll: Fri Apr 08 11:21:29 BRT 2016

        cal.roll( Calendar.DAY_OF_MONTH , 35 ); //nao muda o mes e ano
        System.out.println( "+ 35 dias com roll: " + cal.getTime().toString() );

        cal.roll( Calendar.HOUR , 25 ); //nao muda o dia, mes e ano
        System.out.println( "+ 25 horas com: " + cal.getTime().toString() );
    }

    private static void iniciandoCalendar() {
        Calendar cal = Calendar.getInstance();
        System.out.println( "Classe concreta: " + cal.getClass() ); //saida: Classe concreta: class java.util.GregorianCalendar
        System.out.println(
                "Primeiro dia da semana do calendario da jvm é domingo?: " + ( cal.getFirstDayOfWeek() == Calendar.SUNDAY ) ); //saida: Primeiro dia da semana do calendario da jvm é domingo?: true
        System.out.println( "Calendar.getIntance() pega a data atual: " + cal.getTime() ); //saida no dia: Calendar.getIntance() pega a data atual: Sun Feb 08 11:13:17 BRST 2015
        cal.setTimeInMillis( 4_000_000_000_000l ); //data com miles de 4 trilhoes
        System.out.println( "Data de 4 trilhoes de milis: " + cal.getTime() );
    }

}
