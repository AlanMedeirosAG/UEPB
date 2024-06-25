package tests;

import models.Triangulo;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import util.TipoTriangulo;


import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {
    @Nested
    class Isoceles{
        @Test
        void TrianguloTipoEhIsosceles(){
            double[] lados= {8,15,15};
            assertEquals(Triangulo.getTipoDoTriangulo(lados[0],lados[1],lados[2]), TipoTriangulo.ISOSCELES);
        }
        @Test
        void NaoCriaDoisIsoceles(){
            Triangulo isosceles0 = Triangulo.getInstanciaTriangulo(8,15,15);
            Triangulo isosceles1 = Triangulo.getInstanciaTriangulo(3,15,15);
            assertEquals(isosceles1, isosceles0);
        }
    }
    @Nested
    class Equilatero{
        @Test
        void TrianguloTipoEhEquilatero(){
            double[] lados= {15,15,15};
            assertEquals(Triangulo.getTipoDoTriangulo(lados[0],lados[1],lados[2]), TipoTriangulo.EQUILATERO);
        }
        @Test
        void NaoCriaDoisEquilateros(){
            Triangulo equilateros0 = Triangulo.getInstanciaTriangulo(15,15,15);
            Triangulo equilateros1 = Triangulo.getInstanciaTriangulo(10,10,10);
            assertEquals(equilateros0,equilateros1);
        }
    }
    @Nested
    class Escaleno{
        @Test
        void TrianguloTipoEhEscaleno(){
            double[] lados= {10,15,30};
            assertEquals(Triangulo.getTipoDoTriangulo(lados[0],lados[1],lados[2]), TipoTriangulo.ESCALENO);
        }
        @Test
        void NaoCriaDoisEscalenos(){
            Triangulo escaleno0 = Triangulo.getInstanciaTriangulo(15,15,15);
            Triangulo escaleno1 = Triangulo.getInstanciaTriangulo(10,10,10);
            assertEquals(escaleno0,escaleno1);
        }
    }



}
