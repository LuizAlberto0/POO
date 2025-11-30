package ListaPOO1.Questao12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.random.RandomGenerator;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Clinica clinica = new Clinica();

        Paciente p1 = new Paciente("Pedro");
        Paciente p2 = new Paciente("Paulo");
        Paciente p3 = new Paciente("Fernanda");
        Paciente p4 = new Paciente("Luiz");

        LocalDate hoje = LocalDate.now();
        LocalDateTime dt1 = hoje.atTime(9,0);
        LocalDateTime dt2 = hoje.atTime(15,45);
        LocalDateTime dt3 = hoje.plusDays(1).atTime(8,30);
        LocalDateTime dt4 = hoje.plusDays(1).atTime(11,0);
        LocalDateTime dt5 = hoje.minusDays(1).atTime(10,0);
        LocalDateTime dt6 = hoje.plusDays(2).atTime(13,30);

        ConsultaMedica c1 = new ConsultaMedica("Consulta1", dt1, p1, "Dermatologia");
        ConsultaMedica c2 = new ConsultaMedica("Consulta2", dt2, p2, "Oftalmologia");
        ConsultaMedica c3 = new ConsultaMedica("Consulta3", dt3, p1, "Cardiologia");
        ConsultaMedica c4 = new ConsultaMedica("Consulta4",dt4, p3, "Pediatria");
        ConsultaMedica c5 = new ConsultaMedica("Consulta5", dt5, p3, "Check-up");
        ConsultaMedica c6 = new ConsultaMedica("Consulta6", dt6, p4, "Ortopedia");

        clinica.agendar(c1);
        clinica.agendar(c2);
        clinica.agendar(c3);
        clinica.agendar(c4);
        clinica.agendar(c5);
        clinica.agendar(c6);

        System.out.println(clinica.listar());

        System.out.println("Insira o nome do paciente para a busca:");
        clinica.buscarPorPaciente(sc.nextLine());

        System.out.println("Buscar pelo dia ("+hoje+"):");
        clinica.buscarPorDia(hoje);

        System.out.println("Cancelar a consulta3 e listar o resto:");
        boolean cancelado = clinica.cancelar("Consulta3");
        System.out.println("A consulta3 foi cancelada? "+cancelado);
        System.out.println(clinica.listar());
    }
}
