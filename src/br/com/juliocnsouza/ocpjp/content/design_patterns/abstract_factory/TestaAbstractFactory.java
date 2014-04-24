package br.com.juliocnsouza.ocpjp.content.design_patterns.abstract_factory;

/**
 * TestaAbstractFactory.java -> Job:
 * <p>
 * @since 30/03/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class TestaAbstractFactory {

    public static void main( String[] args ) {
        ComunicadorAbstractFactory abstractFactory = new ComunicadorAbstractVisaFactory();
        abstractFactory.createEmissor().envia( "Valor: R$ 987,98;Senha: 2345" );
        String msg = abstractFactory.createReceptor().recebe();
        System.out.println( msg );
        System.out.println( "\n" );
        abstractFactory = new ComunicadorAbstractMastercardFactory();
        abstractFactory.createEmissor().envia( "Valor: R$ 987,98;Senha: 2345" );
        msg = abstractFactory.createReceptor().recebe();
        System.out.println( msg );
    }

}
