package model.administracao;

import java.util.ArrayList;
import java.util.List;

public class AdmReuniao {

    private String horario;
    private List<String> participantes;

    public AdmReuniao(String horario) {
        this.horario = horario;
        participantes = new ArrayList<>();
    }

    public void adicionarParticipante(String participante) {
        if (participante == null || participante.isEmpty()) {
            throw new IllegalArgumentException("Nome do participante não pode ser nulo ou vazio.");
        }
        participantes.add(participante);
        System.out.println(participante + " adicionado à reunião às " + horario);
    }


    public void listarParticipantes() {
        System.out.println("Participantes da reunião às " + horario + ":");
        for (String participante : participantes) {
            System.out.println(participante);
        }
    }

    public List<String> getParticipantes() {
        return participantes;
    }


}
