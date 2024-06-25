package models;

import util.FiguraGeometrica;

public class Retangulo implements FiguraGeometrica {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) throws IllegalArgumentException{
        if (altura <= 0 || largura <=0) throw new IllegalArgumentException("O retangulo deve ter altura e largura maiores que 0");
        this.altura = altura;
        this.largura = largura;
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura)throws IllegalArgumentException{
        if (altura <=0) throw new IllegalArgumentException();
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) throws IllegalArgumentException{
        if (largura <=0) throw new IllegalArgumentException();
        this.largura = largura;
    }


    @Override
    public double area() throws IllegalArgumentException{
        if (altura <= 0 || largura <= 0) {
            throw new IllegalArgumentException("Altura e largura devem ser maiores que zero.");
        }
        return altura* largura;
    }
    @Override
    public double perimetro() throws IllegalArgumentException{
        return (altura*2)+(largura *2);
    }
    @Override
    public String toString() {
        return "Este e um retangulo com altura de tamanho "+ altura+", de largura de tamanho "
                + largura+", perimetro de tamanho "+perimetro()+" e area de tamanho "+ area();
    }
}