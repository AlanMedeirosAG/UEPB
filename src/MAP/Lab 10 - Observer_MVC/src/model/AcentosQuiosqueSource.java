package model;
import java.util.ArrayList;


public class AcentosQuiosqueSource{
    
    private ArrayList<ListenerQuiosque> AcentosQuiosqueListeners = new ArrayList<ListenerQuiosque>();
    public ArrayList<Acento> AcentosQuiosque = new ArrayList<Acento>();
    
    public AcentosQuiosqueSource(){
        for (int i = 1; i <= 30; i++) {
            Acento acento = new AcentoQuiosque(i, "Disponível");
            AcentosQuiosque.add(acento);
        }        
    }

    public void compraAcento(int id){
        for( Acento a : AcentosQuiosque ){
            if(a.getId() == id){
                if(a.getSituacao().equals("Disponível")){
                    a.setSituacao("Indisponível");                    
                }
                else{
                    throw new IllegalArgumentException("Esse assento já está ocupado");
                }
            }
        }
        disparaCompraAcento();
    }

    public void reservaAcento(int id){
        for( Acento a : AcentosQuiosque ){
            if(a.getId() == id){
                if(a.getSituacao().equals("Disponível")){
                    a.setSituacao("Reservado");                    
                }
                else{
                    throw new IllegalArgumentException("Esse assento já está reservado");
                }
            }
        }
        disparaReservaAcento();
    }

    public synchronized void adicionarListener(ListenerQuiosque l){
        if(!AcentosQuiosqueListeners.contains(l)){
            AcentosQuiosqueListeners.add(l);
        }
    }

    public synchronized void removerListener(ListenerQuiosque l){
            AcentosQuiosqueListeners.remove(l);
    }    

    private synchronized void disparaCompraAcento(){
        ArrayList<ListenerQuiosque> tl;
        synchronized (this){
            tl = ((ArrayList) AcentosQuiosqueListeners.clone());
        }
        AcentosQuiosqueEvent evento = new AcentosQuiosqueEvent(this);
        for( ListenerQuiosque t : tl ){
            t.novaCompra(evento);
        }
    }

    private synchronized void disparaReservaAcento(){
        ArrayList<ListenerQuiosque> tl;
        synchronized (this){
            tl = ((ArrayList) AcentosQuiosqueListeners.clone());
        }
        AcentosQuiosqueEvent evento = new AcentosQuiosqueEvent(this);
        for( ListenerQuiosque t : tl ){
            t.novaReserva(evento);
        }        
    }

    public ArrayList<Acento> getAcentos(){
        return AcentosQuiosque;
    }    
}
