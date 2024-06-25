package models;

public class FigurasGeometricas {

    public static Circulo criarCirculo(double raio){
        try{
            return new Circulo(raio);
        }catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        return null;
    }

    public static Retangulo criarRetangulo(double altura, double largura){
        try{
            return new Retangulo(altura, largura);
        }catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
    public static Quadrado criarQuadrado(double lado) {
        try{
            return new Quadrado(lado);
        }catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
}
