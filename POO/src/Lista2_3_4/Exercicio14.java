package Lista2_3_4;

import java.util.*;

public class Exercicio14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cont=0,qtdReprovados=0,qtdExame=0,qtdAprovados=0;
        double mediaTurma = 0,mediaMaior = 0, mediaMenor = 10;
        String nomeMediaMaior="", nomeMediaMenor="";

        System.out.println("Insira a quantia de alunos que serão avaliados:  ");
        int qtdAlunos = sc.nextInt();

        while(qtdAlunos!=cont){
            sc.nextLine();
            System.out.println("Insira o nome do aluno "+(cont+1)+": ");
            String nome = sc.nextLine();
            System.out.println("Insira a n1 de "+nome+": ");
            double n1 = sc.nextDouble();
            while(n1<0||n1>10){
                System.out.println(n1+" é inválido. Insira uma nota válida (0 a 10): ");
                n1 = sc.nextDouble();
            }
            System.out.println("Agora, insira a n2: ");
            double n2 = sc.nextDouble();
            while (n2 < 0 || n2 > 10) {
                System.out.println(n2+" é inválido. Insira uma nota válida (0 a 10): ");
                n2 = sc.nextDouble();
            }
            double media = (n1+n2)/2;
            mediaTurma+= media;
            if(media<3){
                System.out.println("Aluno reprovado com média: "+media);
                qtdReprovados++;
            }else if(media>=3&&media<7){
                System.out.println("Aluno de exame com média: "+media);
                qtdExame++;
            }else{
                System.out.println("Aluno aprovado com média: "+media);
                qtdAprovados++;
            }

            if(media<mediaMenor){
                mediaMenor = media;
                nomeMediaMenor = nomeMediaMenor.replace(nomeMediaMenor,nome);
            }else if(media>mediaMaior){
                mediaMaior = media;
                nomeMediaMaior = nomeMediaMaior.replace(nomeMediaMaior,nome);
            }
            cont++;
        }
        mediaTurma/=qtdAlunos;

        System.out.println("Quantia de alunos: "+qtdAlunos);
        System.out.println("Média da turma: "+mediaTurma);
        System.out.println("Alunos reprovados: "+qtdReprovados+"\tAlunos de exame: "+qtdExame+"\tAlunos aprovados: "+qtdAprovados);
        System.out.println("Aluno com maior média: "+nomeMediaMaior+"\tMédia: "+mediaMaior);
        System.out.println("Aluno com menor média: "+nomeMediaMenor+"\tMédia: "+mediaMenor);
    }
}
