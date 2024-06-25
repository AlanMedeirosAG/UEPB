package tests;

import models.Quadrado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {

    Quadrado quadrado;
    @BeforeEach
    void setUp() {
        quadrado = new Quadrado(10);
    }
    @Nested
    class Constructor{
        @Test
        void rectValido(){
            assertDoesNotThrow(()-> new Quadrado(10));
        }
        @Test
        void rectInvalido(){
            assertThrows(IllegalArgumentException.class,()-> new Quadrado(-10));
        }
    }

    @Nested
    class Getters {
        @Test
        void getLado() {
            Assertions.assertEquals(10,quadrado.getLado());
        }

    }
    @Nested
    class Setters {
        @Nested
        class Lado{
            @Test
            void setLadosZero() {
                assertThrows(IllegalArgumentException.class, ()-> quadrado.setLado(0));

            }
            @Test
            void setLadosPositivo() {
                assertDoesNotThrow(()->quadrado.setLado(1));
            }
            @Test
            void setLadosNegativo() {
                assertThrows(IllegalArgumentException.class, ()-> quadrado.setLado(-1));
            }
        }

    }

    @Nested
    class Methods{
        @Test
        void area() {
            Assertions.assertEquals(100,quadrado.area());
        }

        @Test
        void perimetro() {
            Assertions.assertEquals(40, quadrado.perimetro());
        }

        @Test
        void testToString() {
            Assertions.assertDoesNotThrow(()->quadrado.toString());
        }
    }
}