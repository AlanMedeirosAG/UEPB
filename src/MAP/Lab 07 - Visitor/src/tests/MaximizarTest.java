package tests;

import formas.Circulo;
import formas.Retangulo;
import formas.Trapezio;
import formas.Triangulo;
import org.junit.jupiter.api.Test;
import visitors.VisitorMaximizar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MaximizarTest {
    VisitorMaximizar visitorMax = new VisitorMaximizar();
    Circulo c = new Circulo(4);
    Triangulo t = new Triangulo(5, 5, 5);
    Retangulo r = new Retangulo(3, 2);
    Trapezio tp = new Trapezio(4, 3, 5, 2, 2);

    @Test
    void visitaCirculoTest(){
        var raioAntigo = c.getRaio();
        c.aceitaVisita(visitorMax);
        assertEquals(raioAntigo*2, c.getRaio());
    }
    @Test
    void visitaTrianguloTest(){
        var lado1Antigo = t.getLado1();
        var lado2Antigo = t.getLado2();
        var lado3Antigo = t.getLado3();
        t.aceitaVisita(visitorMax);
        assertTrue(((t.getLado1() == lado1Antigo*2) && (t.getLado2() == lado2Antigo*2) && (t.getLado3() == lado3Antigo*2)));
    }
    @Test
    void visitaTrapezioTest(){
        var baseMaiorAntiga = tp.getBaseMaior();
        var baseMenorAntiga = tp.getBaseMenor();
        var alturaAntiga = tp.getAltura();
        tp.aceitaVisita(visitorMax);
        assertTrue(((tp.getBaseMaior() == baseMaiorAntiga*2) && (tp.getBaseMenor() == baseMenorAntiga*2) && (tp.getAltura() == alturaAntiga*2)));
    }
    @Test
    void visitaRetanguloTest() {
        var comprimentoAntigo = r.getComprimento();
        var alturaAntiga = r.getAltura();
        r.aceitaVisita(visitorMax);
        assertTrue((r.getAltura() == alturaAntiga*2) && r.getComprimento() == comprimentoAntigo*2);
    }
}
