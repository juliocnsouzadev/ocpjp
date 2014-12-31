package br.com.juliocnsouza.ocpjp._2dates;

import java.util.Date;

public class TestesComDatas {

    public static void main( String[] args ) {
        Date data = new Date( 1_000_000_000_000L ); //um trilhao usando java7
        System.out.println( "01/01/1970 e um trilhão de milisegundo depois... " + data.toString() );

        data.setTime( data.getTime() + 3_600_000 ); //acrescentando 1 hora
        System.out.println( "uma hora depois... " + data.toString() );
    }
}
