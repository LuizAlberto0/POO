package ProvaN2.Questao1;

import java.util.*;

public class ControleGeral {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<CursoEspecializacao> cursosEspecializacao = new ArrayList<>();
        ArrayList<CursoMestrado> cursosMestrado = new ArrayList<>();
        ArrayList<Aluno> alunosInstituicao = new ArrayList<>();

        int codigoAluno, idadeAluno, codigoCurso, cargaHoraria, sala;
        double valorCurso, nota;
        String nomeAluno, cpfAluno, enderecoAluno, nomeCurso, nomeProfessor;
        boolean sexo;

        int resp,opc,cont=0;
        do{
            ArrayList<Aluno> alunos = new ArrayList<>();
            System.out.println("### CRIANDO E ATRIBUINDO ALUNOS A CURSOS ###");
            System.out.println("Escolha um tipo de curso:");
            System.out.println("(1) - Curso.");
            System.out.println("(2) - Curso Mestrado.");
            System.out.println("(3) - Curso Especialização.");
            System.out.println("(4) - Sair da página.");
            resp = sc.nextInt();
            sc.nextLine();
            switch (resp){
                case 1:
                    System.out.println("### CRIANDO CURSO ###");
                    codigoCurso = cont;
                    cont++;
                    System.out.println("Insira o nome do curso:");
                    nomeCurso = sc.nextLine();
                    System.out.println("Insira o nome do professor:");
                    nomeProfessor = sc.nextLine();
                    System.out.println("Insira a carga horária:");
                    cargaHoraria = sc.nextInt();
                    while(cargaHoraria<=0){
                        System.out.println("Carga horária inválida! Somente valores acima de 0! Tente novamente:");
                        cargaHoraria = sc.nextInt();
                    }
                    System.out.println("Insira o valor do curso:");
                    valorCurso = sc.nextDouble();
                    while(valorCurso<=0){
                        System.out.println("Valor inválido! Somente valores acima de 0! Tente novamente:");
                        valorCurso = sc.nextDouble();
                    }
                    System.out.println("Insira a sala do curso:");
                    sala = sc.nextInt();
                    do {
                        System.out.println("### CRIANDO ALUNOS E ATRIBUINDO A UM CURSO DE MESTRADO ###");
                        System.out.println("(1) - Criar aluno.");
                        System.out.println("(2) - Voltar para a página anterior.");
                        opc = sc.nextInt();
                        sc.nextLine();
                        if (opc == 1) {
                            Notas notas = new Notas();
                            codigoAluno = alunosInstituicao.size();
                            System.out.println("Insira o nome do aluno:");
                            nomeAluno = sc.nextLine();
                            System.out.println("Insira a idade do aluno:");
                            idadeAluno = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Insira o cpf do aluno:");
                            cpfAluno = sc.nextLine();
                            while(cpfAluno.length()!=11){
                                System.out.println("Informação inválida! CPF apresenta, somente, 11 digitos. Tente novamente:");
                                cpfAluno = sc.nextLine();
                            }
                            System.out.println("Insira o endereço do aluno:");
                            enderecoAluno = sc.nextLine();
                            System.out.println("Insira o sexo do aluno(0 - M/1 - F):");
                            sexo = sc.nextInt() == 0;

                            System.out.println("Insira a n1 do aluno:");
                            nota = sc.nextDouble();
                            while(nota<0||nota>10){
                                System.out.println("Valor inválido! Somente valores maiores que 0 e menores que 10. Tente novamente:");
                                nota = sc.nextDouble();
                            }
                            notas.setN1(nota);
                            System.out.println("Insira a n2 do aluno:");
                            nota = sc.nextDouble();
                            while(nota<0||nota>10){
                                System.out.println("Valor inválido! Somente valores maiores que 0 e menores que 10. Tente novamente:");
                                nota = sc.nextDouble();
                            }
                            notas.setN2(nota);
                            System.out.println("Insira a n3 do aluno:");
                            nota = sc.nextDouble();
                            while(nota<0||nota>10){
                                System.out.println("Valor inválido! Somente valores maiores que 0 e menores que 10. Tente novamente:");
                                nota = sc.nextDouble();
                            }
                            notas.setN3(nota);

                            Aluno aluno = new Aluno(codigoAluno, idadeAluno, nomeAluno, cpfAluno, enderecoAluno, sexo, notas);
                            alunos.add(aluno);
                            alunosInstituicao.add(aluno);
                        }
                    }while(opc!=2);
                    Curso curso = new Curso(codigoCurso, cargaHoraria, sala, nomeCurso, nomeProfessor, valorCurso, alunos);
                    cursos.add(curso);
                    break;
                case 2:
                    boolean ss;
                    System.out.println("### CRIANDO CURSO MESTRADO ###");
                    codigoCurso = cont;
                    cont++;
                    System.out.println("Insira o nome do curso:");
                    nomeCurso = sc.nextLine();
                    System.out.println("Insira o nome do professor:");
                    nomeProfessor = sc.nextLine();
                    System.out.println("Insira a carga horária:");
                    cargaHoraria = sc.nextInt();
                    while(cargaHoraria<=0){
                        System.out.println("Carga horária inválida! Somente valores acima de 0! Tente novamente:");
                        cargaHoraria = sc.nextInt();
                    }
                    System.out.println("Insira o valor do curso:");
                    valorCurso = sc.nextDouble();
                    while(valorCurso<=0){
                        System.out.println("Valor inválido! Somente valores acima de 0! Tente novamente:");
                        valorCurso = sc.nextDouble();
                    }
                    System.out.println("Insira a sala do curso:");
                    sala = sc.nextInt();
                    System.out.println("O curso é stricto sensu? (0 - sim, 1 - não)");
                    int SS = sc.nextInt();
                    ss = SS == 0;
                    do {
                        System.out.println("### CRIANDO ALUNOS E ATRIBUINDO A UM CURSO DE MESTRADO ###");
                        System.out.println("(1) - Criar aluno.");
                        System.out.println("(2) - Voltar para a página anterior.");
                        opc = sc.nextInt();
                        sc.nextLine();
                        if (opc == 1) {
                            Notas notas = new Notas();
                            codigoAluno = alunosInstituicao.size();
                            System.out.println("Insira o nome do aluno:");
                            nomeAluno = sc.nextLine();
                            System.out.println("Insira a idade do aluno:");
                            idadeAluno = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Insira o cpf do aluno:");
                            cpfAluno = sc.nextLine();
                            while(cpfAluno.length()!=11){
                                System.out.println("Informação inválida! CPF apresenta, somente, 11 digitos. Tente novamente:");
                                cpfAluno = sc.nextLine();
                            }
                            System.out.println("Insira o endereço do aluno:");
                            enderecoAluno = sc.nextLine();
                            System.out.println("Insira o sexo do aluno(0 - M/1 - F):");
                            sexo = sc.nextInt() == 0;

                            System.out.println("Insira a n1 do aluno:");
                            nota = sc.nextDouble();
                            while(nota<0||nota>10){
                                System.out.println("Valor inválido! Somente valores maiores que 0 e menores que 10. Tente novamente:");
                                nota = sc.nextDouble();
                            }
                            notas.setN1(nota);
                            System.out.println("Insira a n2 do aluno:");
                            nota = sc.nextDouble();
                            while(nota<0||nota>10){
                                System.out.println("Valor inválido! Somente valores maiores que 0 e menores que 10. Tente novamente:");
                                nota = sc.nextDouble();
                            }
                            notas.setN2(nota);
                            System.out.println("Insira a n3 do aluno:");
                            nota = sc.nextDouble();
                            while(nota<0||nota>10){
                                System.out.println("Valor inválido! Somente valores maiores que 0 e menores que 10. Tente novamente:");
                                nota = sc.nextDouble();
                            }
                            notas.setN3(nota);

                            Aluno aluno = new Aluno(codigoAluno, idadeAluno, nomeAluno, cpfAluno, enderecoAluno, sexo, notas);
                            alunos.add(aluno);
                            alunosInstituicao.add(aluno);
                        }
                    }while(opc!=2);
                    CursoMestrado cursoMestrado = new CursoMestrado(codigoCurso, cargaHoraria, sala, nomeCurso, nomeProfessor, valorCurso, alunos, ss);
                    cursoMestrado.setAdicionalDiploma();
                    cursosMestrado.add(cursoMestrado);
                    break;
                case 3:
                    boolean ll;
                    System.out.println("### CRIANDO CURSO ESPECIALIZAÇÃO ###");
                    codigoCurso = cont;
                    cont++;
                    System.out.println("Insira o nome do curso:");
                    nomeCurso = sc.nextLine();
                    System.out.println("Insira o nome do professor:");
                    nomeProfessor = sc.nextLine();
                    System.out.println("Insira a carga horária:");
                    cargaHoraria = sc.nextInt();
                    while(cargaHoraria<=0){
                        System.out.println("Carga horária inválida! Somente valores acima de 0! Tente novamente:");
                        cargaHoraria = sc.nextInt();
                    }
                    System.out.println("Insira o valor do curso:");
                    valorCurso = sc.nextDouble();
                    while(valorCurso<=0){
                        System.out.println("Valor inválido! Somente valores acima de 0! Tente novamente:");
                        valorCurso = sc.nextDouble();
                    }
                    System.out.println("Insira a sala do curso:");
                    sala = sc.nextInt();
                    System.out.println("O curso é lato sensu? (0 - sim, 1 - não)");
                    ll = sc.nextInt() == 0;
                    do {
                        System.out.println("### CRIANDO ALUNOS E ATRIBUINDO A UM CURSO DE MESTRADO ###");
                        System.out.println("(1) - Criar aluno.");
                        System.out.println("(2) - Voltar para a página anterior.");
                        opc = sc.nextInt();
                        sc.nextLine();
                        if (opc == 1) {
                            Notas notas = new Notas();
                            codigoAluno = alunosInstituicao.size();
                            System.out.println("Insira o nome do aluno:");
                            nomeAluno = sc.nextLine();
                            System.out.println("Insira a idade do aluno:");
                            idadeAluno = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Insira o cpf do aluno:");
                            cpfAluno = sc.nextLine();
                            while(cpfAluno.length()!=11){
                                System.out.println("Informação inválida! CPF apresenta, somente, 11 digitos. Tente novamente:");
                                cpfAluno = sc.nextLine();
                            }
                            System.out.println("Insira o endereço do aluno:");
                            enderecoAluno = sc.nextLine();
                            System.out.println("Insira o sexo do aluno(0 - M/1 - F):");
                            sexo = sc.nextInt() == 0;

                            System.out.println("Insira a n1 do aluno:");
                            nota = sc.nextDouble();
                            while(nota<0||nota>10){
                                System.out.println("Valor inválido! Somente valores maiores que 0 e menores que 10. Tente novamente:");
                                nota = sc.nextDouble();
                            }
                            notas.setN1(nota);
                            System.out.println("Insira a n2 do aluno:");
                            nota = sc.nextDouble();
                            while(nota<0||nota>10){
                                System.out.println("Valor inválido! Somente valores maiores que 0 e menores que 10. Tente novamente:");
                                nota = sc.nextDouble();
                            }
                            notas.setN2(nota);
                            System.out.println("Insira a n3 do aluno:");
                            nota = sc.nextDouble();
                            while(nota<0||nota>10){
                                System.out.println("Valor inválido! Somente valores maiores que 0 e menores que 10. Tente novamente:");
                                nota = sc.nextDouble();
                            }
                            notas.setN3(nota);

                            Aluno aluno = new Aluno(codigoAluno, idadeAluno, nomeAluno, cpfAluno, enderecoAluno, sexo, notas);
                            alunos.add(aluno);
                            alunosInstituicao.add(aluno);
                        }
                    }while(opc!=2);
                    CursoEspecializacao cursoEspecializacao = new CursoEspecializacao(codigoCurso, cargaHoraria, sala, nomeCurso, nomeProfessor, valorCurso, alunos, ll);
                    cursoEspecializacao.setAdicionalDiploma();
                    cursosEspecializacao.add(cursoEspecializacao);
                    break;
                case 4:
                    System.out.println("Saindo da página...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }while(resp!=4);
        do{
            System.out.println("### TABELA DE INFORMAÇÕES ###");
            System.out.println("Insira algum número referente a alguma opção para acessar as informações de algum arraylist específico:");
            System.out.println("(1) - Alunos da instituição.");
            System.out.println("(2) - Cursos.");
            System.out.println("(3) - Cursos de Mestrado.");
            System.out.println("(4) - Cursos de Especialização.");
            System.out.println("(5) - Sair da página.");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc){
                case 1:
                    System.out.println("#### TODOS OS ALUNOS DA INSTITUIÇÃO ####");
                    for(Aluno al : alunosInstituicao) System.out.println(al.toString());
                    break;
                case 2:
                    System.out.println("#### CURSOS ####");
                    for(Curso c : cursos) System.out.println(c.toString());
                    break;
                case 3:
                    System.out.println("#### CURSOS de MESTRADO ####");
                    for(CursoMestrado c : cursosMestrado) System.out.println(c.toString());
                    break;
                case 4:
                    System.out.println("#### CURSOS de ESPECIALIZAÇÃO ####");
                    for(CursoEspecializacao c : cursosEspecializacao) System.out.println(c.toString());
                    break;
                case 5:
                    System.out.println("Saindo da página...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente!");
                    break;
            }
        }while(opc!=5);
        System.out.println("Agora, para finalizar, insira um nome para eu lhe informar qual o curso que este aluno frequenta:");
        String nomeBusca = sc.nextLine();
        Aluno alunoBusca = null;
        for(Aluno a : alunosInstituicao){
            if(a.getNome().equalsIgnoreCase(nomeBusca)){
                alunoBusca = a;
                break;
            }
        }
        String cursoBusca=null;
        for(CursoMestrado c : cursosMestrado){
            if(c.getAlunos().contains(alunoBusca)){
                cursoBusca = c.getClass().getSimpleName();
                break;
            }
        }
        for(CursoEspecializacao c : cursosEspecializacao){
            if(c.getAlunos().contains(alunoBusca)){
                cursoBusca = c.getClass().getSimpleName();
                break;
            }
        }
        for(Curso c : cursos){
            if(c.getAlunos().contains(alunoBusca)){
                cursoBusca = c.getClass().getSimpleName();
                break;
            }
        }
        if(cursoBusca != null) System.out.println("O aluno "+nomeBusca+" faz parte de um "+cursoBusca);
        else System.out.println("Aluno não encontrado!");
    }
}
