package Lista2_3_4;

import java.util.*;

public class Exercicio23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] Num = new int[10];
        int[] Divis = new int[5];

        System.out.println("Vamos preencher o primeiro vetor: ");
        for(int i = 0; i<10; i++){
            System.out.println("Insira um número inteiro para o vetor: ");
            Num[i] = sc.nextInt();
        }
        System.out.println("Agora, vamos preencher o segundo vetor:");
        for(int i = 0; i<5; i++){
            System.out.println("Insira um número inteiro para o vetor:");
            Divis[i] = sc.nextInt();
        }
        System.out.print("Num [ ");
        for(int i = 0; i<10; i++){
            System.out.print(Num[i]+" ");
        }
        System.out.print("]\nDivis [ ");
        for(int i = 0; i<5; i++){
            System.out.print(Divis[i]+" ");
        }
        System.out.println("]");
        for(int i = 0; i<10; i++){
            System.out.println("Número "+Num[i]+":");
            boolean temDivisor = false;
            for(int j = 0; j<5; j++){
                if(Num[i]%Divis[j] == 0){
                    System.out.println("\tDivisível por "+Divis[j]+" na posição "+j);
                    temDivisor = true;
                }
            }
            if(!temDivisor) System.out.println("\tNão possui nenhum divisor no vetor Divis.");
        }
    }
}
