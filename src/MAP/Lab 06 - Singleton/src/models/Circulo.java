package models;

import util.FiguraGeometrica;

public class Circulo implements FiguraGeometrica {

    private double raio;
    private static Circulo instanciaUnicaCirculo = null;


    private Circulo(double raio){
        this.raio = raio;
    }


    public static Circulo getInstanciaUnicaCirculo(double raio) throws IllegalArgumentException{
        if(!circuloPossivel(raio)) throw new IllegalArgumentException("Raio impossivel");

        if (instanciaUnicaCirculo == null) {
            instanciaUnicaCirculo = new Circulo(raio);
        }
            return instanciaUnicaCirculo;
        }


    public static boolean circuloPossivel(double raio){
        return raio > 0;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) throws IllegalArgumentException {
        if (raio <=0) throw new IllegalArgumentException();
        this.raio = raio;
    }

    @Override
    public double area() {
        return 3.14 * (raio * raio);
    }

    @Override
    public double perimetro() {
        return 2 * 3.14 * raio;
    }

    @Override
    public String toString(){
        return "Este e um circulo com raio de tamanho " + raio+", perimetro de tamanho "+ perimetro()+" e area de tamanho "+ area();
    }
}
