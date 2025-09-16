package Lista2_3_4;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número de identificação do aluno: ");
        int id = sc.nextInt();
        System.out.println("Insira a N1 do aluno: ");
        double N1 = sc.nextDouble();
        while(N1<0||N1>10){
            System.out.println("N1 inválida! Insira novamente: ");
            N1 = sc.nextDouble();
        }
        System.out.println("Insira a N2 do aluno: ");
        double N2 = sc.nextDouble();
        while(N2<0||N2>10){
            System.out.println("N2 inválida! Insira novamente: ");
            N2 = sc.nextDouble();
        }
        System.out.println("Insira a N3 do aluno: ");
        double N3 = sc.nextDouble();
        while(N3<0||N3>10){
            System.out.println("N3 inválida! Insira novamente: ");
            N3 = sc.nextDouble();
        }
        System.out.println("Insira a média de atividades do aluno: ");
        double MediaAtividades = sc.nextDouble();
        while(MediaAtividades<0||MediaAtividades>10){
            System.out.println("Média de atividades inválida! Insira novamente: ");
            MediaAtividades = sc.nextDouble();
        }
        double Media = (N1+(N2*2)+(N3*3)+MediaAtividades)/7;

        System.out.println("Aluno: "+id);
        System.out.println("Média:"+Media);
        if(Media>=6){
            if(Media>=6&&Media<7.5) System.out.println("Conceito = C");
            else if(Media>=7.5&&Media<9) System.out.println("Conceito = B");
            else if(Media>=9&&Media<=10) System.out.println("Conceito = A");
            System.out.println("Aluno aprovado!");
        }
        else{
            if(Media<4) System.out.println("Conceito = E");
            else if(Media>=4&&Media<6) System.out.println("Conceito = D");
            System.out.println("Aluno reprovado!");
        }

    }
}
