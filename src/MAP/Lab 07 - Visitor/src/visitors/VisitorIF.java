package visitors;
import formas.*;

public interface VisitorIF {
    double visitaRetangulo(Retangulo r);
    double visitaTriangulo (Triangulo t);
    double visitaCirculo (Circulo c);
     double visitaTrapezio(Trapezio tp);
}
