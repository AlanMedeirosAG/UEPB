package tests;

import formas.Circulo;
import formas.Retangulo;
import formas.Trapezio;
import formas.Triangulo;
import org.junit.jupiter.api.Test;
import visitors.VisitorCalculaPerimetro;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculaPerimetroTest {
    VisitorCalculaPerimetro visitorCpmt = new VisitorCalculaPerimetro();
    Circulo c = new Circulo(4);
    Triangulo t = new Triangulo(5, 5, 5);
    Retangulo r = new Retangulo(3, 2);
    Trapezio tp = new Trapezio(4, 3, 5, 2, 2);

    @Test
    void visitaCirculoTest(){
        assertEquals(25.12, c.aceitaVisita(visitorCpmt));
    }
    @Test
    void visitaTrianguloTest(){
        assertEquals(15.0, t.aceitaVisita(visitorCpmt));
    }
    @Test
    void visitaTrapezioTest(){
        assertEquals(34.0, tp.aceitaVisita(visitorCpmt));
    }
    @Test
    void visitaRetanguloTest() {
        assertEquals(7.0, r.aceitaVisita(visitorCpmt));
    }
}
