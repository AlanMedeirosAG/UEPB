package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.IndicativeSentencesGeneration;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class TriangleTest { 

	
	@Nested
    @IndicativeSentencesGeneration(generator = ReplaceUnderscores.class)
	class Triangulo_equilatero{
	    @DisplayName("Triângulo É equilátero")
	    @Test
	    public void equilateralTriangleHasEqualSides() throws Exception {
	        Triangle triangle = new Triangle(2, 2, 2);
	        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind());
	    }
	    
	    @DisplayName("Triângulo NÃO É equilátero")
	    @Test
	    public void equilateralTriangleHasDifferentSides() throws Exception {
	        Triangle triangle = new Triangle(2, 2, 3);
	        assertNotEquals(TriangleKind.EQUILATERAL, triangle.getKind());
	    }
	}

	@Nested
    @IndicativeSentencesGeneration(generator = ReplaceUnderscores.class)
	class Triangulo_isoceles{
	    @DisplayName("Triangulo É isósceles")
	    @Test
	    public void validIsoscelesTriangle() throws Exception {
	        Triangle triangle = new Triangle(2, 2, 1);
	        assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
	    }
	    @DisplayName("Triangulo NÃO É isósceles")
	    @Test
	    public void inalidIsoscelesTriangle() throws Exception {
	        Triangle triangle = new Triangle(2, 2, 2);
	        assertNotEquals(TriangleKind.ISOSCELES, triangle.getKind());
	    }
		
	}

	@Nested
    @IndicativeSentencesGeneration(generator = ReplaceUnderscores.class)
	class Triangulo_escaleno{
	    @DisplayName("Triangulo É escaleno")
	    @Test
	    public void validScaleneTriangle() throws Exception {
	        Triangle triangle = new Triangle(4, 2, 3);
	        assertEquals(TriangleKind.SCALENE, triangle.getKind());
	    }
	    @DisplayName("Triangulo NÃO É escaleno")
	    @Test
	    public void invalidScaleneTriangle() throws Exception {
	        Triangle triangle = new Triangle(4, 4, 1);
	        assertNotEquals(TriangleKind.SCALENE, triangle.getKind());
	    }
	}


	@Nested
    @IndicativeSentencesGeneration(generator = ReplaceUnderscores.class)
	class Testes_comuns{
	    @DisplayName("Triangulo de lados impossíveis")
	    @Test
	    public void hasImpossibleSidesTest() {
	        assertThrows(TriangleException.class, () -> {
	            new Triangle(-1, 2, 3);
	        });
	    }

	    @DisplayName("Triangulo de lados 0")
	    @Test
	    public void allSidesAreZeroTest() {
	        assertThrows(TriangleException.class, () -> {
	            new Triangle(0, 0, 0);
	        });
	    }

	    @DisplayName("Desigualdade triangular")
	    @Test
	    public void violatesTriangleInequalityTest() {
	        assertThrows(TriangleException.class, () -> {
	            new Triangle(2, 3, 6);
	        });
	    }
	}
    
    @Nested
    @IndicativeSentencesGeneration(generator = ReplaceUnderscores.class)
    class Numero_de_lados_unicos{
        @DisplayName("1 lado unico")
        @Test
        public void hasOneUniqueSides() throws Exception {
        	Triangle triangle = new Triangle(2,2,2);
        	assertEquals(1,triangle.getNumberOfUniqueSides());
        }
        @DisplayName("2 lados unicos")
        @Test
        public void hasTwoUniqueSides() throws Exception {
        	Triangle triangle = new Triangle(2,2,3);
        	assertEquals(2,triangle.getNumberOfUniqueSides());
        }
        @DisplayName("3 lados unicos")
        @Test
        public void hasThreeUniqueSides() throws Exception {
        	Triangle triangle = new Triangle(2,4,3);
        	assertEquals(3,triangle.getNumberOfUniqueSides());
        }
    	
    }
}