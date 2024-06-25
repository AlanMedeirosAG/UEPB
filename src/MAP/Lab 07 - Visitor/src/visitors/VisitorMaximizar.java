package visitors;

import formas.Circulo;
import formas.Retangulo;
import formas.Trapezio;
import formas.Triangulo;

public class VisitorMaximizar implements VisitorIF {

    public double visitaRetangulo(Retangulo r){
        r.setComprimento(r.getComprimento()*2);
        r.setAltura(r.getAltura()*2);
        System.out.println("Retangulo maximizado: " + "Comprimento "+ r.getComprimento() + " Largura " + r.getAltura());
        return 0;
    }
    public double visitaTriangulo (Triangulo t) {
        t.setLado1(t.getLado1()*2);
        t.setLado2(t.getLado2()*2);
        t.setLado3(t.getLado3()*2);
        System.out.println("Triangulo maximizado: " + "lado 1 "+ t.getLado1()  + " lado 2 " + t.getLado2() + " Lado 3 " + t.getLado3());
        return 0;
    }
    public double visitaCirculo (Circulo c){
        c.setRaio(c.getRaio()*2);
        System.out.println("Circulo maximizado: " + "raio "+ c.getRaio());
        return 0;
    }
    public double visitaTrapezio (Trapezio tp){
        tp.setBaseMenor(tp.getBaseMenor()*2);
        tp.setBaseMaior(tp.getBaseMaior()*2);
        tp.setAltura(tp.getAltura()*2);
        tp.setLado1(2*tp.getLado1());
        tp.setLado2(2*tp.getLado2());
        System.out.println("Trapezio maximizado: " + "Base menor "+ tp.getBaseMenor() + " base maior " + tp.getBaseMaior() + " altura " + tp.getAltura());
        return 0;
    }
}
