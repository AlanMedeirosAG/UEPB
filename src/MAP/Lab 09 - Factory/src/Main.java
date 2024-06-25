import factory.SanduicheDeCheddarFactory;
import factory.SanduicheDeMussarelaFactory;
import factory.SanduicheDiferenteFactory;
import factory.SanduicheFactory;
import sanduiche.Sanduiche;

public class Main {
    public static void main(String[] args) {
        SanduicheFactory factory = new SanduicheDeCheddarFactory();
        Sanduiche sanduiche1 = factory.criarSanduiche();
        System.out.println(sanduiche1.mostrarIngredientes());
        System.out.println("\n");

        factory = new SanduicheDiferenteFactory();
        Sanduiche sanduiche2 = factory.criarSanduiche();
        System.out.println(sanduiche2.mostrarIngredientes());
        System.out.println("\n");

        factory = new SanduicheDeMussarelaFactory();
        Sanduiche sanduiche3 = factory.criarSanduiche();
        System.out.println(sanduiche1.mostrarIngredientes());

    }
}
