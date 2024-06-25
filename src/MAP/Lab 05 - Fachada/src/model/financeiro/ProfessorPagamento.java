package model.financeiro;
import model.academico.Professor;

import java.time.LocalDate;

public class ProfessorPagamento {
    private Professor servidor;
    private int anosDeServico;
    private float proventosLiquido;
    public ProfessorPagamento(Professor servidor) {
        LocalDate dataAgora = LocalDate.now();
        this.servidor = servidor;
        this.anosDeServico = ( dataAgora.getYear()- servidor.getDataContratacao().getYear());
        calculaProventos();
    }

    public Professor getServidor() {
        return servidor;
    }

    public void setServidor(Professor servidor) {
        this.servidor = servidor;
    }
        public int getAnosDeServico() {
        return anosDeServico;
    }

    public void setAnosDeServico(int anosDeServico) {
        this.anosDeServico = anosDeServico;
    }

    public float getProventosLiquido() {
        return proventosLiquido;
    }

    public void setProventosLiquido(float proventosLiquido) {
        this.proventosLiquido = proventosLiquido;
    }

    public void calculaProventos(){
        proventosLiquido = 8000 + (anosDeServico*200);  //salário mágico :D
    }

    @Override
    public String toString() {
        return servidor.getNome()+" - salario liquido: R$"+proventosLiquido+" em "+LocalDate.now().getMonth();
    }
}
