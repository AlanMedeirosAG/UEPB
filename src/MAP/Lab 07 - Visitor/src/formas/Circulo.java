package formas;
import visitors.*;

public class Circulo implements ElementoConcretoIF {

    private double raio;

    public Circulo(double r) throws IllegalArgumentException {

        if(r > 0){
        this.raio = r;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }
    public double aceitaVisita(VisitorIF v) {
        return v.visitaCirculo(this);
    }
}
