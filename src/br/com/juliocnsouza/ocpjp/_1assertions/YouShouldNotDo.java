package br.com.juliocnsouza.ocpjp._1assertions;

import java.util.Random;

/**
 * YouShouldNotDo.java -> Job:
 * <p>
 * @since 23/12/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class YouShouldNotDo {

    public boolean verifica( int i ) {
        return i < 0;
    }

    //nao é recomendado usar assertions em métodos publicos
    //e nem usar assertions de forma que possam alterar o estado do programa
    //uma assertiva deve deixar o programa no mesmo estado que antes da expressao
    public void a() {
        assert ( verifica( new Random().nextInt() ) );
        //mais código aqui
    }

}
