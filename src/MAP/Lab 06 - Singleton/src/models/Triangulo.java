package models;

import util.FiguraGeometrica;
import util.TipoTriangulo;

public class Triangulo implements FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;

    private static Triangulo instanciaUnicaEquilatero = null;
    private static Triangulo instanciaUnicaIsosceles = null;
    private static Triangulo instanciaUnicaEscaleno = null;

    private Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public static Triangulo getInstanciaTriangulo(double lado1, double lado2, double lado3) {
        try {
            if (getTipoDoTriangulo(lado1, lado2, lado3) == TipoTriangulo.EQUILATERO) {
                if (instanciaUnicaEquilatero == null && isValidTriangle(lado1, lado2, lado3)) {
                    instanciaUnicaEquilatero = new Triangulo(lado1, lado2, lado3);
                }
                return instanciaUnicaEquilatero;
            }
            if (getTipoDoTriangulo(lado1, lado2, lado3)== TipoTriangulo.ISOSCELES) {
                if (instanciaUnicaIsosceles == null && isValidTriangle(lado1, lado2, lado3)) {
                    instanciaUnicaIsosceles = new Triangulo(lado1, lado2, lado3);
                }
                return instanciaUnicaIsosceles;
            }
            if (getTipoDoTriangulo(lado1, lado2, lado3)== TipoTriangulo.ESCALENO) {
                if (instanciaUnicaEscaleno == null && isValidTriangle(lado1, lado2, lado3)) {
                    instanciaUnicaEscaleno = new Triangulo(lado1, lado2, lado3);
                }
                return instanciaUnicaEscaleno;
            }
            throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.println("Já existe uma instância de triângulo " + getTipoDoTriangulo(lado1, lado2, lado3) + " ou a desigualdade triangular não foi atendida.");
            return null;
        }
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado1(double lado1) {
        if (!isValidTriangle(lado1, this.lado2, this.lado3)) {
            throw new IllegalArgumentException("Os lados fornecidos não formam um triângulo válido.");
        }
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        if (!isValidTriangle(this.lado1, lado2, this.lado3)) {
            throw new IllegalArgumentException("Os lados fornecidos não formam um triângulo válido.");
        }
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        if (!isValidTriangle(this.lado1, this.lado2, lado3)) {
            throw new IllegalArgumentException("Os lados fornecidos não formam um triângulo válido.");
        }
        this.lado3 = lado3;
    }

    public TipoTriangulo getTipo(){
        return getTipoDoTriangulo(lado1,lado2,lado3);
    }

    public static TipoTriangulo getTipoDoTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return TipoTriangulo.EQUILATERO;
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return TipoTriangulo.ISOSCELES;
        } else {
            return TipoTriangulo.ESCALENO;
        }
    }

    @Override
    public double area() {
        double p = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
        return "Este é um triângulo " + getTipoDoTriangulo(lado1, lado2, lado3) + " com lados " + lado1 + ", " + lado2 + " e " + lado3 +
                ", perímetro de tamanho " + perimetro() + " e área de tamanho " + area();
    }

    private static boolean isValidTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }
}
