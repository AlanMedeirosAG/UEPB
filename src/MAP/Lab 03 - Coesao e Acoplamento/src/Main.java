import models.Circulo;
import models.FigurasGeometricas;
import models.Quadrado;
import models.Retangulo;

public class Main {
	static final int raio = 10;
	static final int lado = 20;
	static final int altura = 15;
	static final int largura = 10;
	public static void main(String[] args) {
		System.out.println("Figuras geometricas: ");

		//Circulo
            Circulo circulo = FigurasGeometricas.criarCirculo(raio);
			if (circulo != null){
			System.out.println(circulo);

		}

		//Quadrdado
			Quadrado quadrado = FigurasGeometricas.criarQuadrado(lado);
			if (quadrado != null){
				System.out.println(quadrado);
			}

		//Retangulo
			Retangulo retangulo = FigurasGeometricas.criarRetangulo(altura, largura);
			if (retangulo != null){
				System.out.println(retangulo);
			}


	}
}
