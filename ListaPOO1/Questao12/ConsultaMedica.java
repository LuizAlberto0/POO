package ListaPOO1.Questao12;

import java.time.LocalDateTime;

public class ConsultaMedica {
    private String id;
    private LocalDateTime dataHora;
    private Paciente paciente;
    private String especialidade;

    public ConsultaMedica(String id, LocalDateTime dataHora, Paciente paciente, String especialidade){
        this.id = id;
        this.dataHora = dataHora;
        this.paciente = paciente;
        this.especialidade = especialidade;
    }

    public String getId(){
        return this.id;
    }

    public LocalDateTime getDataHora() {
        return this.dataHora;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public String toString(){ return "ID: "+getId()+" - Especialidade: "+getEspecialidade()+" - Data_Hora: "+getDataHora()+"\nPaciente: "+getPaciente(); }
}
