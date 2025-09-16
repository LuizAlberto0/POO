package Lista2_3_4;

import java.util.*;

public class Exercicio16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int aux = 0;

        System.out.println("Insira um número inteiro: ");
        int n = sc.nextInt();

        System.out.println("Os números primos entre 1 e "+n+" são: ");
        for(int i = 2; i < n; i++){
            if(verificaPrimo.operacao(i)) System.out.print(i+" ");
        }
    }
    static class verificaPrimo{
        public static boolean operacao(int n){
            if(n <= 1) return false;
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n%i == 0) return false;
            }
            return true;
        }
    }
}
