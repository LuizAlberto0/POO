package Lista2_3_4;

import java.awt.*;
import java.util.*;

public class Exercicio27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int limiteSup, limiteInf;
        do{
            System.out.println("Insira o limite inferior: ");
            limiteInf = sc.nextInt();
            System.out.println("Insira o limite superior: ");
            limiteSup = sc.nextInt();

            if(limiteInf>=limiteSup) System.out.println("Limite inferior deve ser menor que o superior. Tente novamente:");
        }while(limiteInf>=limiteSup);

        int[] A = new int[10];
        int[] B = new int[10];

        for(int i = 0; i<10; i++){
            A[i] = sorteia(limiteInf,limiteSup);
            B[i] = sorteia(limiteInf,limiteSup);
        }
        System.out.println("\nVetor A: {");
        for(int i : A) System.out.print(i+" ");
        System.out.println("}\nVetor B: {");
        for(int i : B) System.out.print(i+" ");
        System.out.println("}");

        int[] Soma = new int[10];
        for(int i = 0; i<10; i++) Soma[i] = A[i]+B[i];
        System.out.println("Soma: {");
        for(int i : Soma) System.out.println(i+" ");
        System.out.println("}");

        ArrayList<Integer> intersec = new ArrayList<>();
        for(int i = 0; i<10; i++) {
            if(A[i] == B[i]) intersec.add(A[i]);
        }
        System.out.print("Intersecção: {"+intersec+"}");

        ArrayList<Integer> diferenca = new ArrayList<>();
        for(int i = 0; i<10; i++){
            if(A[i] != B[i]) diferenca.add(A[i]);
        }
        System.out.println("Diferença: {"+diferenca+"}");

        int[] intercal = new int[20];
        for(int i = 0, j = 0; i<10; i++){
            intercal[j++] = A[i];
            intercal[j++] = B[i];
        }
        System.out.println("Intercalação: {");
        for(int i : intercal) System.out.println(i+" ");
        System.out.println("}");
    }
    public static int sorteia(int limiteInf, int limiteSup){
        Random rd = new Random();
        return rd.nextInt(limiteSup - limiteInf + 1)+limiteInf;
    }
}
