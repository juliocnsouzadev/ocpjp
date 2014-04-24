package br.com.juliocnsouza.ocpjp.content.class_design.app.graphicshape;

/**
 * @author Júlio César Nunes de Souza
 */
class Circles {

    void getArea() {
        Circle circle = new Circle();
        circle.area(); //chama metodo publico
        circle.fillCollor(); // chama metodo default (está no mesmo pacote)
    }

}
