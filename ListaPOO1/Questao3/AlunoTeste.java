package ListaPOO1.Questao3;

import java.util.*;

public class AlunoTeste {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Aluno> alunos = new ArrayList<>();

        String resp;
        do{
            Aluno a = new Aluno();
            double n;

            System.out.println("Insira a matrícula do aluno:");
            a.setMatricula(sc.nextLine());

            System.out.println("Insira o nome do aluno:");
            a.setNome(sc.nextLine());

            System.out.println("Insira a nota 1 do aluno:");
            n = sc.nextDouble();
            while(n<0||n>10){
                System.out.println(n+" é uma nota inválida! Tente novamente (0 a 10):");
                n = sc.nextDouble();
            }
            a.setN1(n);

            System.out.println("Insira a nota 2 do aluno:");
            n = sc.nextDouble();
            while(n<0||n>10){
                System.out.println(n+" é uma nota inválida! Tente novamente (0 a 10):");
                n = sc.nextDouble();
            }
            a.setN2(n);

            System.out.println("Insira a nota de trabalho do aluno:");
            n = sc.nextDouble();
            while(n<0||n>10){
                System.out.println(n+" é uma nota inválida! Tente novamente (0 a 10):");
                n = sc.nextDouble();
            }
            a.setNotaTrabalho(n);

            a.calcularMedia();
            a.notaFaltante();

            alunos.add(a);

            System.out.println("Deseja continuar cadastrando alunos? (sim/não)");
            sc.nextLine();
            resp = sc.nextLine().toLowerCase();
        }while(resp.equals("sim"));
        System.out.println("### LISTA DE ALUNOS ###");
        for(Aluno b : alunos) System.out.println(b);
    }
}
