package tests;

import formas.Circulo;
import formas.Retangulo;
import formas.Trapezio;
import formas.Triangulo;
import org.junit.jupiter.api.Test;
import visitors.VisitorCalculaArea;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculaAreaTest {
    VisitorCalculaArea visitorCA = new VisitorCalculaArea();
    Circulo c = new Circulo(4);
    Triangulo t = new Triangulo(5, 5, 5);
    Retangulo r = new Retangulo(3, 2);
    Trapezio tp = new Trapezio(4, 3, 5, 2, 2);

    @Test
    void visitaCirculoTest(){
        assertEquals(39.4384, c.aceitaVisita(visitorCA));
    }
    @Test
    void visitaTrianguloTest(){
        assertEquals(10.825317547305483, t.aceitaVisita(visitorCA));
    }
    @Test
    void visitaTrapezioTest(){
        assertEquals(17.5, tp.aceitaVisita(visitorCA));
    }
    @Test
    void visitaRetanguloTest() {
        assertEquals(6.0, r.aceitaVisita(visitorCA));
    }
}
