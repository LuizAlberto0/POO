package ListaPOO1.Questao12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Clinica {
    private ArrayList<ConsultaMedica> consultas;

    public Clinica() {
        this.consultas = new ArrayList<>();
    }

    public boolean agendar(ConsultaMedica c) {
        if (c.getDataHora().isBefore(LocalDateTime.now())) {
            System.out.println("Erro! Não é possível agendar a consulta no passado.");
            return false;
        }
        if (consultas.stream().anyMatch(existente -> existente.getPaciente().equals(c.getPaciente()) && existente.getDataHora().equals(c.getDataHora()))) {
            System.out.println("Erro! Não é possível agendar a consulta neste horário.");
            return false;
        }
        if (consultas.stream().anyMatch(existente -> existente.getPaciente().equals(c.getPaciente()) && existente.getDataHora().toLocalDate().equals(c.getDataHora().toLocalDate()))) {
            System.out.println("Erro! Não é possível agendar a consulta neste dia.");
            return false;
        }
        consultas.add(c);
        System.out.println("Consulta agendada!");
        return true;
    }

    public ArrayList<ConsultaMedica> buscarPorPaciente(String Id) {
        return consultas.stream().filter(consulta -> consulta.getId().equalsIgnoreCase(Id)).collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<ConsultaMedica> buscarPorDia(LocalDate data) {
        return consultas.stream().filter(consulta -> consulta.getDataHora().toLocalDate().equals(data)).collect(Collectors.toCollection(ArrayList::new));
    }

    public boolean cancelar(String Id) {
        return consultas.removeIf(consulta -> consulta.getId().equalsIgnoreCase(Id));
    }

    public String listar() {
        StringBuilder lista = new StringBuilder();
        consultas.forEach(c -> lista.append(c.toString()).append(";\n"));
        return lista.toString();
    }
}
