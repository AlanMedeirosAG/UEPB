package tests;

import models.Circulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CirculoTest {
    Circulo circulo;
    @BeforeEach
    void setup(){
        circulo = new Circulo(1);
    }

    @Nested
    class Construtor{
        @Test
        void circuloValido(){
            assertDoesNotThrow(()-> new Circulo(1));
        }
        @Test
        void circuloInvalido(){
            assertThrows(IllegalArgumentException.class,()-> new Circulo(0));
        }
    }
    @Test
    void getRaio() {
        Assertions.assertEquals(1, circulo.getRaio());
    }

    @Nested
    class setRaio {
        @Test
        void setRaioPositivo() {
            assertDoesNotThrow(() -> circulo.setRaio(1));
        }
        @Test
        void setRaioZero() {
            assertThrows(IllegalArgumentException.class, ()->circulo.setRaio(0));
        }
        @Test
        void setRaioNegativo() {
            assertThrows(IllegalArgumentException.class, ()->circulo.setRaio(-10));
        }
    }
    @Test
    void area() {
        Assertions.assertEquals(3.14,circulo.area());
    }

    @Test
    void perimetro() {
        Assertions.assertEquals(6.28, circulo.perimetro());
    }

    @Test
    void testToString() {
        Assertions.assertDoesNotThrow(()->circulo.toString());
    }
}