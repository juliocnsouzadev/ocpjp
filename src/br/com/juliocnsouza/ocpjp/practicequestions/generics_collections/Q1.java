package br.com.juliocnsouza.ocpjp.practicequestions.generics_collections;

/**
 * Q1.java -> Job:
 * <p>
 * @since 15/04/2014
 * @version 1.0
 * @author Julio Cesar Nunes de Souza (julio.souza@mobilitasistemas.com.br)
 */
public class Q1 {

}

class A<X , Y extends X> {

    private X t;

    public void set( Y t ) {
        this.t = t;
    }

    public X get() {
        return t;
    }
}

class B {
}

class C extends B {
}

class D {

    //A aa = new A<Object, A<X,Y>();//argumentos invalidos nao compila
    A a = new A();//pode ser do tipo cru
    //A<D, D> aa = new A<X,Y>(); // nao compila tipo da declaração diferente do tipo na instanciação
    //A<X,Y> a = new A<X,Y>(); //X e Y nao são tipos apenas placeholders... nao compila
}

//class E extends A<C,B> {} // nao compila (B nao herda de C, e sim o contrario)

