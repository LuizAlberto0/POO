package Lista2_3_4;

import java.util.*;

public class Exercicio22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] V = new int[10];
        int cont = 0;

        for(int i = 0; i<10; i++){
            System.out.println("Insira um número inteiro para o vetor: ");
            V[i] = sc.nextInt();
            if(V[i] > 25) cont++;
        }
        if(cont == 0) System.out.println("Não há números acima de 25 no vetor inserido.");
        else{
            System.out.println("Segue os elementos maiores que 25 do vetor e suas respectivas posições: ");
            for(int i = 0; i<10; i++){
                if(V[i] > 25){
                    System.out.println("V["+i+"] = "+V[i]);
                }
            }
        }
    }
}
