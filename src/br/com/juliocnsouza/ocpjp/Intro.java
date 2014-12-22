package br.com.juliocnsouza.ocpjp;

/**
 * Intro.java -> Job:
 * <p>
 * @since 22/12/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Intro {

    public static void main( String[] args ) {
        String guide = "OCA/OCP Java SE 7 "
                + "Programmer I & II "
                + "Study Guide "
                + "(Exams 1Z0-803 & 1Z0-804)";

        String authors = "Kathy Sierra &"
                + "Bert Bates";

        String tests = "http://www.whizlabs.com/";

        System.out.println( "Essa preparação será baseada no guia de estudos:  " + guide
                + "\nDos Autores: " + authors
                + "\nE dos testes práticos do Whizlabs (" + tests + ")"
                + "\n" + content()
                + "\nBons estudos!" );
    }

    public static String content() {
        String content
               = new StringBuilder( "Conteúdo do programa de estudos:\n" )
                .append( "I\tAssertions and Java 7 Exceptions\n" )
                .append( "II\tString Processing, Data Formatting, Resource Bundles\n" )
                .append( "III\tI/O and NIO\n" )
                .append( "IV\tAdvanced OO and Design Patterns\n" )
                .append( "V\tGenerics and Collections\n" )
                .append( "VI\tInner Classes\n" )
                .append( "VII\tThreads\n" )
                .append( "VIII\tJDBC" )
                .toString();
        return content;
    }

}
