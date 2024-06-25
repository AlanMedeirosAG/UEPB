package model;

import java.util.ArrayList;

public class AcentosOnibusSource{
    
    private ArrayList<ListenerOnibus> AcentosOnibusListeners = new ArrayList<ListenerOnibus>();
    public ArrayList<Acento> AcentosOnibus = new ArrayList<Acento>();
    
    public AcentosOnibusSource(){
        for (int i = 1; i <= 30; i++) {
            AcentoOnibus acento = new AcentoOnibus(i, "verde");
            AcentosOnibus.add(acento);
        }        
    }

    public void compraAcento(int id){
        for( Acento a : AcentosOnibus ){
            if(a.getId() == id){
                if(a.getSituacao().equals("verde")){
                    a.setSituacao("vermelho");                    
                }
                else{
                    throw new IllegalArgumentException("Esse assento já está ocupado");
                }
            }
        }
        disparaCompraAcento();
    }

    public void reservaAcento(int id){
        for( Acento a : AcentosOnibus ){
            if(a.getId() == id){
                if(a.getSituacao().equals("verde")){
                    a.setSituacao("amarelo");
                }
                else{
                    throw new IllegalArgumentException("Esse assento já foi reservado");
                }
            }
        }
        disparaReservaAcento();
    }

    public synchronized void adicionarListener(ListenerOnibus l){
        if(!AcentosOnibusListeners.contains(l)){
            AcentosOnibusListeners.add(l);
        }
    }

    public synchronized void removerListener(ListenerOnibus l){
            AcentosOnibusListeners.remove(l);
    }    

    private synchronized void disparaCompraAcento(){
        ArrayList<ListenerOnibus> tl;
        synchronized (this){
            tl = ((ArrayList) AcentosOnibusListeners.clone());
        }
        AcentosOnibusEvent evento = new AcentosOnibusEvent(this);
        for( ListenerOnibus t : tl ){
            t.novaCompra(evento);
        }
    }

    private synchronized void disparaReservaAcento(){
        ArrayList<ListenerOnibus> tl;
        synchronized (this){
            tl = ((ArrayList) AcentosOnibusListeners.clone());
        }
        AcentosOnibusEvent evento = new AcentosOnibusEvent(this);
        for( ListenerOnibus t : tl ){
            t.novaReserva(evento);
        }        
    }    

    public ArrayList<Acento> getAcentos(){
        return AcentosOnibus;
    }
    
}

