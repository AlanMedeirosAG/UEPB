package factory;

import ingredientes.*;
import ingredientes.ovos.OvoGranja;
import ingredientes.paes.PaoBola;
import ingredientes.paes.PaoFrances;
import ingredientes.presuntos.PresuntoFrango;
import ingredientes.queijos.QueijoCheddar;
import ingredientes.queijos.QueijoPrato;
import ingredientes.tomates.TomateFatiado;

public class SanduicheDiferenteFactory extends SanduicheFactory{
    @Override
    public Pao criarPao() {
        return new PaoFrances();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoPrato();
    }

    @Override
    public Presunto criarPresunto() {
        return new PresuntoFrango();
    }

    @Override
    public Ovo criarOvo() {
        return new OvoGranja();
    }

    @Override
    public Tomate criarTomate() {
        return new TomateFatiado();
    }
}
