package tests;

import models.Retangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {
    Retangulo retangulo;
    @BeforeEach
    void setUp() {
        retangulo = new Retangulo(10,20);
    }
    @Nested
    class Constructor{
        @Test
        void rectValido(){
            assertDoesNotThrow(()-> new Retangulo(10,20));
        }
        @Test
        void rectInvalidoZero(){
            assertThrows(IllegalArgumentException.class,()-> new Retangulo(0,10));
        }
        @Test
        void rectInvalidoNegativo(){
            assertThrows(IllegalArgumentException.class,()-> new Retangulo(10,-10));
        }
    }

    @Nested
    class Getters {
        @Test
        void getAltura() {
            Assertions.assertEquals(10,retangulo.getAltura());
        }
        @Test
        void getLargura() {
            Assertions.assertEquals(20,retangulo.getLargura());
        }

    }
    @Nested
    class Setters {
        @Nested
        class Altura{
            @Test
            void setAlturaZero() {
                assertThrows(IllegalArgumentException.class, ()-> retangulo.setAltura(0));

            }
            @Test
            void setAlturaPositivo() {
                assertDoesNotThrow(()->retangulo.setAltura(1));
            }
            @Test
            void setAlturaNegativo() {
                assertThrows(IllegalArgumentException.class, ()-> retangulo.setAltura(-1));
            }
        }
        @Nested
        class Largura{
            @Test
            void setLarguraZero() {
                assertThrows(IllegalArgumentException.class, ()-> retangulo.setLargura(0));

            }
            @Test
            void setLarguraPositivo() {
                assertDoesNotThrow(()->retangulo.setLargura(1));
            }
            @Test
            void setLarguraNegativo() {
                assertThrows(IllegalArgumentException.class, ()-> retangulo.setLargura(-1));
            }
        }

    }

    @Nested
    class Methods{
        @Test
        void area() {
            Assertions.assertEquals(200,retangulo.area());
        }

        @Test
        void perimetro() {
            Assertions.assertEquals(60, retangulo.perimetro());
        }

        @Test
        void testToString() {
            Assertions.assertDoesNotThrow(()->retangulo.toString());
        }
    }


}