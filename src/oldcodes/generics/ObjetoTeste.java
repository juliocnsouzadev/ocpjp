package oldcodes.generics;

/**
 * ObjetoTeste.java -> Job:
 * <p>
 * @since 07/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class ObjetoTeste<T1 , T2> {

    private T1 o1;

    private T2 o2;

    public ObjetoTeste( T1 o1 , T2 o2 ) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public T1 getO1() {
        return o1;
    }

    public T2 getO2() {
        return o2;
    }

}
