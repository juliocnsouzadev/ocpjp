package br.com.juliocnsouza.ocpjp.collections.compare;

import java.util.Comparator;

/**
 * IdadeComparator.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class IdadeComparator implements Comparator<Pessoa> {

    @Override
    public int compare( Pessoa o1 , Pessoa o2 ) {
        return o1.getIdade().compareTo( o2.getIdade() );
    }

}
