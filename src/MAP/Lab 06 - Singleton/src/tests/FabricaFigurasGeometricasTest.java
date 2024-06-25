package tests;

import models.FabricaFigurasGeometricas;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaFigurasGeometricasTest {

    @Nested
    class CirculoTest{
        @Test
        void criarCirculoRaioPositivo() {
            assertNotNull(FabricaFigurasGeometricas.criarCirculo(1));
        }
        @Test
        void criarCirculoRaioZero() {
            assertNull(FabricaFigurasGeometricas.criarCirculo(0) );
        }
        @Test
        void criarCirculoRaioNegativo() {
            assertNull(FabricaFigurasGeometricas.criarCirculo(-1) );
        }

    }

    @Nested
    class QuadradoTest{
        @Test
        void criarQuadradoLadoPositivo() {
            assertNotNull(FabricaFigurasGeometricas.criarQuadrado(1));
        }
        @Test
        void criarQuadradoLadoZero() {
            assertNull(FabricaFigurasGeometricas.criarQuadrado(0) );
        }
        @Test
        void criarQuadradoLadoNegativo() {
            assertNull(FabricaFigurasGeometricas.criarQuadrado(-1) );
        }

    }
    @Nested
    class TrianguloTest{
        @Test
        void criarTrianguloValido(){
            assertNotNull(FabricaFigurasGeometricas.criarTriangulo(5,5,5));
        }
        @Test
        void criarTrianguloInvalidoNegativo(){
            assertNull(FabricaFigurasGeometricas.criarTriangulo(5,-1,5));
        }
        @Test
        void criarTrianguloInvalidoZero(){
            assertNull(FabricaFigurasGeometricas.criarTriangulo(5,0,5));
        }

    }
}