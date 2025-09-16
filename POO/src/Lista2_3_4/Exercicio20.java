package Lista2_3_4;

import java.util.*;

public class Exercicio20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] V = new int[10];
        int menor = 999999999, maior = 0, posMenor = 0, posMaior = 0;

        for(int i = 0; i<10; i++){
            System.out.println("Insira um número inteiro para o vetor: ");
            V[i] = sc.nextInt();
            if(V[i] < menor){
                menor = V[i];
                posMenor = i;
            }
            if(V[i] > maior){
                maior = V[i];
                posMaior = i;
            }
        }
        System.out.println("O menor elemento do vetor é "+menor+" e sua posição é V["+posMenor+"].");
        System.out.println("O maior elemento do vetor é "+maior+" e sua posição é V["+posMaior+"].");
    }
}
