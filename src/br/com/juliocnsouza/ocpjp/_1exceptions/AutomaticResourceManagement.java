package br.com.juliocnsouza.ocpjp._1exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * AutomaticResourceManagement.java -> Job:
 * <p>
 * @since 23/12/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class AutomaticResourceManagement {

    public void old()
            throws IOException {
        Reader reader = null;
        try {
            if ( reader != null ) {
                reader.read();
            }
        }
        catch ( IOException e ) {
            throw e;
        }
        finally {
            if ( reader != null ) {
                try {
                    reader.close();
                }
                catch ( IOException e ) {
                    // ignora exceçõesao fecha arqvui
                }
            }
        }//muito código apenas para fechar um arquivo no finally

    }

    public void usandoTryWithResources()
            throws IOException {

        try ( Reader reader = new BufferedReader( new FileReader( "testes" ) ) ) { //somente closable e autoclosables são aceitos
            if ( reader != null ) {
                reader.read();
            }
        }//um catch ou finally deixa de ser necessario
        catch ( IOException e ) {
            throw e;
        }
        //o finally é chamado automaticamente para fechar o reader
        /*
         * Nós nem sequer mencionamos fechar o leitor. Automatic Resource Management cuida dele para
         * nós. Vamos dar uma olhada no que acontece aqui . Começamos por declarar o leitor dentro
         * da declaração de tentativa. Os parênteses são novos. Pense neles como um loop em que
         * declaramos uma variável índice de ciclo que tem como escopo apenas o loop. Aqui , o
         * leitor tem como escopo apenas o bloco try . Não é o bloco de captura; apenas o bloco try.
         */
    }

}
