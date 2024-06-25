package factory;

import ingredientes.*;
import sanduiche.Sanduiche;

public abstract class SanduicheFactory {
    public abstract Pao criarPao();
    public abstract Queijo criarQueijo();
    public abstract Presunto criarPresunto();
    public abstract Ovo criarOvo();
    public abstract Tomate criarTomate();

    public Sanduiche criarSanduiche(){
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.setPao(criarPao());
        sanduiche.setQueijo(criarQueijo());
        sanduiche.setPresunto(criarPresunto());
        sanduiche.setOvo(criarOvo());
        sanduiche.setTomate(criarTomate());
        return sanduiche;
    }
}
