package model;

public interface ListenerQuiosque extends java.util.EventListener {
    
    public void novaCompra(AcentosQuiosqueEvent s);
    public void novaReserva(AcentosQuiosqueEvent s);

}