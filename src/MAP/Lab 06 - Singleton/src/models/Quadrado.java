package models;

import util.FiguraGeometrica;

public class Quadrado implements FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        if(lado <=0) throw new IllegalArgumentException("O quadrado deve haver lados de comprimentos positivos");
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) throws IllegalArgumentException{
        if(lado <=0) throw new IllegalArgumentException("O lado do quadrado deve ser positivo");
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public double perimetro() {
        return 4*lado;
    }

    @Override
    public String toString() {
        return "Este e um quadrado com lado de tamanho " + lado + ", de perimetro de tamanho " + perimetro() + " e area de tamanho " + area();
    }
}
