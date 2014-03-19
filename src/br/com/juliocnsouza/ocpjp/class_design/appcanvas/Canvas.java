package br.com.juliocnsouza.ocpjp.class_design.appcanvas;

import br.com.juliocnsouza.ocpjp.class_design.graphicshape.Circle;

/**
 * @author Júlio César Nunes de Souza
 */
class Canvas {

    void getArea() {
        Circle circle = new Circle();
        circle.area(); // chama metoo publico de fora do pacote
    }

}
