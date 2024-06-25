package visitors;
import formas.*;

public class VisitorCalculaArea implements VisitorIF {

        public double visitaRetangulo(Retangulo r){
            return r.getAltura() * r.getComprimento();
        }
        public double visitaTriangulo (Triangulo t) {

            //formula de Herão A = √p(p−a)(p−b)(p−c) onde p é o semiperimetro e a,b e c são os lados do triangulo

            double s = (t.getLado1() + t.getLado2() + t.getLado3()) / 2;
            double area = Math.sqrt(s * (s - t.getLado1()) * (s - t.getLado2()) * (s - t.getLado3()));

            return area;
        }
        public double visitaCirculo (Circulo c){
            return (3.14 * 3.14) * c.getRaio();
        }
        public double visitaTrapezio (Trapezio tp){
            return ((tp.getBaseMaior() + tp.getBaseMenor()) * tp.getAltura())/2;
        }
    }

