package model;

public interface  ListenerOnibus extends java.util.EventListener {
    
    public void novaCompra(AcentosOnibusEvent s);
    public void novaReserva(AcentosOnibusEvent s);

}
