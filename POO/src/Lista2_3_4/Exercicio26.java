package Lista2_3_4;

import java.util.*;

public class Exercicio26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];

        System.out.println("Insira 10 números inteiros distintos.");
        for(int i = 0; i<v.length; ){
            System.out.println("Insira um número: ");
            int numero = sc.nextInt();
            boolean repetido = false;
            for(int j = 0; j<i; j++){
                if(v[j] == numero) repetido = true;
            }
            if(repetido) System.out.println("Número já inserido anteriormente. Tente novamente:");
            else{
                v[i] = numero;
                i++;
            }
        }
        System.out.print("\n\nv[ ");
        for(int i : v) System.out.print(i+" ");
        System.out.print("]");
    }
}
