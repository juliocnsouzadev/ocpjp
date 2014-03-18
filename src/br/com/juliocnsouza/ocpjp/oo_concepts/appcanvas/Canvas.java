package br.com.juliocnsouza.ocpjp.oo_concepts.appcanvas;

import br.com.juliocnsouza.ocpjp.oo_concepts.graphicshape.Circle;

/**
 * @author Júlio César Nunes de Souza
 */
class Canvas {

    void getArea() {
        Circle circle = new Circle();
        circle.area(); // chama metoo publico de fora do pacote
    }

}
