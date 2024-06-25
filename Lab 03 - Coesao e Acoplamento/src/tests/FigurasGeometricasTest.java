package tests;

import models.FigurasGeometricas;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigurasGeometricasTest {
    @Nested
    class Circulos{
        @Test
        void criarCirculoRaioPositivo() {
            assertDoesNotThrow(()->FigurasGeometricas.criarCirculo(10));
        }
        @Test
        void criarCirculoRaioZero() {
            assertDoesNotThrow(()->FigurasGeometricas.criarCirculo(0));
        }
        @Test
        void criarCirculoRaioNegativo() {
            assertDoesNotThrow(()->FigurasGeometricas.criarCirculo(-10));
        }

    }

    @Nested
    class Retangulos{
        @Test
        void criarRetanguloAtributosPositivos() {
            assertDoesNotThrow(()->FigurasGeometricas.criarRetangulo(10,20));
        }
        @Test
        void criarRetanguloAtributosZero() {
            assertDoesNotThrow(()->FigurasGeometricas.criarRetangulo(0,0));
        }
        @Test
        void criarRetanguloAtributosNegativos() {
            assertDoesNotThrow(()->FigurasGeometricas.criarRetangulo(-10,50));
        }

    }

    @Nested
    class Quadrados{
        @Test
        void criarQuadradoLadoPositivo() {
            assertDoesNotThrow(()->FigurasGeometricas.criarQuadrado(10));
        }
        @Test
        void criarQuadradoLadoZero() {
            assertDoesNotThrow(()->FigurasGeometricas.criarQuadrado(0));
        }
        @Test
        void criarQuadradoLadoNegativo() {
            assertDoesNotThrow(()->FigurasGeometricas.criarQuadrado(-10));
        }

    }
}