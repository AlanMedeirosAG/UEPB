import formas.*;
import visitors.*;

public class Main {
    public static void main(String[] args) {

        VisitorIF visitorCA = new VisitorCalculaArea();
        VisitorIF visitorCP = new VisitorCalculaPerimetro();
        VisitorIF visitorDE = new VisitorDesenhar();
        VisitorIF visitorMX = new VisitorMaximizar();

        Circulo c = new Circulo(4);
        Triangulo t = new Triangulo(5, 5, 5);
        Retangulo r = new Retangulo(3, 2);
        Trapezio tp = new Trapezio(4, 3, 5, 2, 2);

        System.out.println("Informações circulo: ");

        System.out.println("Perimetro: "+c.aceitaVisita(visitorCP));
        System.out.println("Area: "+ c.aceitaVisita(visitorCA));
        c.aceitaVisita(visitorDE);
        c.aceitaVisita(visitorMX);

        System.out.print("\n");

        System.out.println("Informações triangulo: ");

        System.out.println("Perimetro: "+t.aceitaVisita(visitorCP));
        System.out.println("Area: "+t.aceitaVisita(visitorCA));
        t.aceitaVisita(visitorDE);
        t.aceitaVisita(visitorMX);

        System.out.print("\n");

        System.out.println("Informações retangulo: ");

        System.out.println("Perimetro: "+r.aceitaVisita(visitorCP));
        System.out.println("Area: "+ r.aceitaVisita(visitorCA));
        r.aceitaVisita(visitorDE);
        r.aceitaVisita(visitorMX);

        System.out.print("\n");

        System.out.println("Informações trapezio: ");

        System.out.println("Perimetro: "+tp.aceitaVisita(visitorCP));
        System.out.println("Area: "+ tp.aceitaVisita(visitorCA));
        tp.aceitaVisita(visitorDE);
        tp.aceitaVisita(visitorMX);

        System.out.print("\n");




    }
}
