package tests;

import models.Circulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CirculoTest {
    Circulo circuloTest = null;
    @BeforeEach
    void setup(){
        circuloTest = Circulo.getInstanciaUnicaCirculo(1);
    }

    @Test
    void NaoCriaDoisCirculos(){
        Circulo c0 = Circulo.getInstanciaUnicaCirculo(5);
        assertEquals(c0.getRaio(),1);
    }

    @Test
    void area() {
        assertEquals(3.14,circuloTest.area());
    }

    @Test
    void perimetro() {
        assertEquals(6.28, circuloTest.perimetro());
    }
}