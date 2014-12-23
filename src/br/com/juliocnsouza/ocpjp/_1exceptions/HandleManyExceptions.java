package br.com.juliocnsouza.ocpjp._1exceptions;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * HandleManyExceptions.java -> Job:
 * <p>
 * @since 23/12/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class HandleManyExceptions {

    public void throwExceptions()
            throws SQLException ,
                   IOException {

    }

    public static void main( String[] args ) {
        HandleManyExceptions obj = new HandleManyExceptions();

        //antes do java 7
        try {
            obj.throwExceptions();
        }
        catch ( SQLException ex ) {
            Logger.getLogger( HandleManyExceptions.class.getName() ).log( Level.SEVERE , null , ex ); //repeted code
        }
        catch ( IOException ex ) {
            Logger.getLogger( HandleManyExceptions.class.getName() ).log( Level.SEVERE , null , ex ); //repeted code
        }

        //desde o java 7
        try {
            obj.throwExceptions();
        }
        catch ( SQLException |
                IOException ex ) { //usando apenas uma variável para exceção
            //catch ( SQLException ex1 | IOException ex2 ) {} //não compila
            Logger.getLogger( HandleManyExceptions.class.getName() ).log( Level.SEVERE , null , ex );
        }

        try {
            obj.throwExceptions();
        }
        catch ( IOException |
                SQLException ex ) { //ordem das exceções nao importa
            Logger.getLogger( HandleManyExceptions.class.getName() ).log( Level.SEVERE , null , ex );
        }

        //hierarquia das exceções ainda é válido
        //catch ( IOException | Exception ex ) {} //nao compila
        //catch ( Exception | IOException ex ) {} //nao compila
        //o código abaixo compila, mas não é uma boa prática
        try {
            obj.throwExceptions();
        }
        catch ( Exception ex ) {
            /*
             * Não atribua um novo valor para o parâmetro de captura. Não é uma boa prática e cria
             * código confuso, difícil de manter . Mas é código Java legal atribuir um novo valor ao
             * parâmetro do bloco catch quando existe apenas um tipo de lista, e ele irá compilar .
             */
            ex = new Exception();
        }

        try {
            obj.throwExceptions();
        }
        catch ( IOException |
                SQLException ex ) {
            //ex = new IOException(); //nao compila em multi catchs
        }
    }

    //Pattern:"handle and declare"
    public void rethrow()
            throws SQLException ,
                   IOException {
        //um jeito de fazer
        try {
            throwExceptions();
        }
        catch ( SQLException |
                IOException ex ) {
            Logger.getLogger( HandleManyExceptions.class.getName() ).log( Level.SEVERE , null , ex );
            throw ex;
        }

        //um jeito melhor
        try {
            throwExceptions();
        }
        catch ( Exception ex ) {//tratando apenas as exceções lançada em throwExceptions e não todas subclasses de Exception
            /*
             * Isso é muito diferente de Java de código 6 que pega Exception. Em Java 6 ,
             * precisaríamos do throwExceptions() ter na assinatura do método throws Exception , a
             * fim de compilar o código
             */
            Logger.getLogger( HandleManyExceptions.class.getName() ).log( Level.SEVERE , null , ex );
            //ex = new IOException(); //se voce redesignar o parametro o código não irá mais compilar
            /*
             * Tal como acontece com multi- catch, não deve-se ter a atribuição de um novo valor
             * para o parâmetro de captura de qualquer maneira. A diferença entre este e multi-catch
             * é onde o erro do compilador ocorre
             */
            throw ex;
        }
    }

}
