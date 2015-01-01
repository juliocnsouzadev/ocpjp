package br.com.juliocnsouza.ocpjp._2dates;

import java.util.Calendar;
import java.util.Date;

public class TestesComDatas {

    public static void main( String[] args ) {
        Date data = new Date( 1_000_000_000_000L ); //um trilhao usando java7
        System.out.println( "01/01/1970 e um trilhão de milisegundo depois... " + data.toString() );

        data.setTime( data.getTime() + 3_600_000 ); //acrescentando 1 hora
        System.out.println( "uma hora depois... " + data.toString() );

        Calendar cal = Calendar.getInstance();
        System.out.println( "Instancia de Calendar é da classe concreta: " + cal.getClass() );

        cal.setTime( data ); //setando a data para o nosso objeto calendar

        boolean iniciaDomingo = Calendar.SUNDAY == cal.getFirstDayOfWeek();//aqui verificamos se o primeiro dia setado na jvm é domingo (em alguns locais pode ser na segunda feira)

        int diaSemana = cal.get( Calendar.DAY_OF_WEEK ); //retorna um inteiro representando o dia da semana
        String diaSemanaStr = getDiaSemana( iniciaDomingo , diaSemana );
        System.out.println(
                "Um trilhão de milisegundos caiu no seguinte dia da semana: " + diaSemanaStr );

        cal.add( Calendar.MONTH , 1 ); //adicionando um mês
        System.out.println( "Nova data: " + cal.getTime().toString() );

        cal.roll( Calendar.MONTH , 6 ); //não muda o ano
        System.out.println( "Nova data: " + cal.getTime().toString() );

        cal.roll( Calendar.DAY_OF_MONTH , 25 ); //nao muda o mes e ano
        System.out.println( "Nova data: " + cal.getTime().toString() );

        cal.roll( Calendar.HOUR , 14 ); //nao muda o dia, mes e ano
        System.out.println( "Nova data: " + cal.getTime().toString() );
    }

    public static String getDiaSemana( boolean iniciaDomingo , int diaSemana ) {
        if ( !iniciaDomingo ) {
            if ( diaSemana == 7 ) {
                diaSemana = 1;
            }
            else {
                diaSemana++;
            }
        }
        switch ( diaSemana ) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda Feira";
            case 3:
                return "Terça Feira";
            case 4:
                return "Quarta Feira";
            case 5:
                return "Quinta Feira";
            case 6:
                return "Sexta Feira";
            case 7:
                return "Sábado";
            default:
                return diaSemana + " Não é um dia da semana válido";
        }
    }
}
