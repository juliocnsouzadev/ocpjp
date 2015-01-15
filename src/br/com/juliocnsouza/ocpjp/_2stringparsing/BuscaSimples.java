package br.com.juliocnsouza.ocpjp._2stringparsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 * BuscaSimples.java -> Job:
 * <p>
 * @since 13/01/2015
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class BuscaSimples {

    public static void main( String[] args ) {
        String padraoBuscado = JOptionPane.showInputDialog( "Qual é padrão que deseja encontrar?" );
        String valorInserido = JOptionPane.showInputDialog(
                "Insira o texto que você deseja buscar o padrão: " + padraoBuscado );

        Pattern p = Pattern.compile( padraoBuscado );
        Matcher m = p.matcher( valorInserido );

        StringBuilder sb = new StringBuilder(
                "Padrão " + padraoBuscado + " encontrado nas posições: " );
        boolean encontrado = false;
        while ( m.find() ) {
            encontrado = true;
            sb.append( "\n" + m.start() );
        }
        if ( !encontrado ) {
            sb.append( "\n(não encontrado)" );
        }
        sb.append( "\ndo texto:  " + valorInserido );

        JOptionPane.showMessageDialog( null , sb.toString() );
    }

}
