package formas;

import visitors.ElementoConcretoIF;
import visitors.VisitorIF;

public class Retangulo implements ElementoConcretoIF {

        double comprimento;
        double altura;

        public Retangulo(double comprimento, double altura) throws IllegalArgumentException {

            if( comprimento > 0 && altura > 0){
                this.comprimento = comprimento;
                this.altura = altura;
            }
            else{
                throw new IllegalArgumentException();
            }

        }

        public double getComprimento() {
            return this.comprimento;
        }

        public double getAltura() {
            return this.altura;
        }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double aceitaVisita(VisitorIF v) {
        return v.visitaRetangulo(this);
    }

    }

