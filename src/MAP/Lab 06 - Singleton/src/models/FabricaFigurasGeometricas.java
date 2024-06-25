package models;

public class FabricaFigurasGeometricas {

    public static Circulo criarCirculo(double raio) throws IllegalArgumentException{
        Circulo a;
        try {
            a = Circulo.getInstanciaUnicaCirculo(raio);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return null;
        }
        return a;
    }

    public static Quadrado criarQuadrado(double lado) {
        try {
            return new Quadrado(lado);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public static Triangulo criarTriangulo(double lado1, double lado2, double lado3) {
        try {
            return Triangulo.getInstanciaTriangulo(lado1, lado2, lado3);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
