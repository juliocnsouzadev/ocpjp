package br.com.juliocnsouza.ocpjp.content.generics;

/**
 * DoSeuTipo.java -> Job:
 * <p>
 * @param <T>
 * @since 01/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class DoSeuTipo<T> {

    private T value;

    public DoSeuTipo( T value ) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue( T value ) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DoSeuTipo{" + "value=" + value + '}';
    }

}
