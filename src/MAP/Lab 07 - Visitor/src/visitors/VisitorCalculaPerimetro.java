package visitors;

import formas.Circulo;
import formas.Retangulo;
import formas.Trapezio;
import formas.Triangulo;

public class VisitorCalculaPerimetro implements VisitorIF {

    public double visitaRetangulo(Retangulo r){
       return (r.getAltura()*2+(r.getComprimento()));
    }
    public double visitaTriangulo (Triangulo t) {
        return (t.getLado1()+t.getLado2()+t.getLado3());
    }
    public double visitaCirculo (Circulo c){
        return 2 * 3.14 * c.getRaio();
    }
    public double visitaTrapezio (Trapezio tp){
        return (tp.getBaseMaior() + tp.getBaseMenor() * (tp.getAltura()*2));

    }
}
