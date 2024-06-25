package visitors;

import formas.Circulo;
import formas.Retangulo;
import formas.Trapezio;
import formas.Triangulo;

public class VisitorDesenhar implements VisitorIF {


    public double visitaRetangulo(Retangulo r) {
        System.out.println("Retangulo desenhado");
        return 0;
    }
    public double visitaTriangulo(Triangulo t) {
        System.out.println("Triangulo desenhado");
        return 0;
    }
    public double visitaCirculo(Circulo c) {
        System.out.println("Circulo desenhado");
        return 0;
    }
    public double visitaTrapezio(Trapezio tp) {
        System.out.println("Trapezio desenhado");
        return 0;
    }


}
