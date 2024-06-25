package models;

import util.FiguraGeometrica;

public class Circulo implements FiguraGeometrica {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) throws IllegalArgumentException {
        if (raio <=0) throw new IllegalArgumentException();
        this.raio = raio;
    }

    public Circulo(double raio) throws IllegalArgumentException {
        if (raio <= 0) throw new IllegalArgumentException("O raio do circulo deve ser maior que zero");
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
