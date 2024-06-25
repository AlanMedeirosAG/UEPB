package tests;

import formas.Circulo;
import formas.Retangulo;
import formas.Trapezio;
import formas.Triangulo;
import org.junit.jupiter.api.Test;
import visitors.VisitorDesenhar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesenharTest {
    VisitorDesenhar visitorDesenheireo = new VisitorDesenhar();
    Circulo c = new Circulo(4);
    Triangulo t = new Triangulo(5, 5, 5);
    Retangulo r = new Retangulo(3, 2);
    Trapezio tp = new Trapezio(4, 3, 5, 2, 2);

    @Test
    void visitaCirculoTest(){
        assertEquals(0, c.aceitaVisita(visitorDesenheireo));
    }
    @Test
    void visitaTrianguloTest(){
        assertEquals(0, t.aceitaVisita(visitorDesenheireo));
    }
    @Test
    void visitaTrapezioTest(){
        assertEquals(0, tp.aceitaVisita(visitorDesenheireo));
    }
    @Test
    void visitaRetanguloTest() {
        assertEquals(0, r.aceitaVisita(visitorDesenheireo));
    }
}
