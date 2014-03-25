package br.com.juliocnsouza.ocpjp.class_design.app.appcanvas;

import br.com.juliocnsouza.ocpjp.class_design.app.graphicshape.Circle;

/**
 * @author Júlio César Nunes de Souza
 */
final class Canvas { //classes final não podem ser herdadas

    void getArea() {
        Circle circle = new Circle();
        circle.area(); // chama metoo publico de fora do pacote
    }

}
