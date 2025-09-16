package Lista2_3_4;

import java.util.*;

public class Exercicio29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int limiteInf, limiteSup, num, flag=1;
        do {
            System.out.println("Insira o limite inferior:");
            limiteInf = sc.nextInt();
            System.out.println("Insira o limite superior:");
            limiteSup = sc.nextInt();
            if(limiteInf>=limiteSup) System.out.println("Limite inferior é maior que o limite superior. Tente novamente:");
        }while(limiteInf>=limiteSup);
        int[] v = new int[1000];

        for(int i = 0; i<v.length; i++){
            num=sorteia(limiteInf,limiteSup);
            for(int j = 0; j<i; j++){
                if(num == v[i]) flag = 0;
                else flag = 1;
            }
            if(flag == 1) v[i] = num;
        }
        System.out.print("v[");
        for(int i : v) System.out.print(i+" ");
        System.out.print("]");
    }
    public static int sorteia(int limiteInf, int limiteSup){
        Random rd = new Random();
        return rd.nextInt(limiteSup - limiteInf + 1)+limiteInf;
    }
}
