package factory;

import ingredientes.*;
import ingredientes.ovos.OvoCapoeira;
import ingredientes.ovos.OvoGranja;
import ingredientes.paes.PaoBola;
import ingredientes.presuntos.PresuntoFrango;
import ingredientes.presuntos.PresuntoPeru;
import ingredientes.queijos.QueijoCheddar;
import ingredientes.queijos.QueijoMussarela;
import ingredientes.tomates.TomateFatiado;

public class SanduicheDeMussarelaFactory extends SanduicheFactory{
    @Override
    public Pao criarPao() {
        return new PaoBola();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoMussarela();
    }

    @Override
    public Presunto criarPresunto() {
        return new PresuntoPeru();
    }

    @Override
    public Ovo criarOvo() {
        return new OvoCapoeira();
    }

    @Override
    public Tomate criarTomate() {
        return new TomateFatiado();
    }
}
