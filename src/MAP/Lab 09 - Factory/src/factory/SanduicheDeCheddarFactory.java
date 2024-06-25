package factory;

import ingredientes.*;
import ingredientes.ovos.OvoGranja;
import ingredientes.paes.PaoBola;
import ingredientes.presuntos.PresuntoFrango;
import ingredientes.queijos.QueijoCheddar;
import ingredientes.tomates.TomateFatiado;

public class SanduicheDeCheddarFactory extends SanduicheFactory{
    @Override
    public Pao criarPao() {
        return new PaoBola();
    }

    @Override
    public Queijo criarQueijo() {
        return new QueijoCheddar();
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
