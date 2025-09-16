package Lista2_3_4;

import java.util.*;

public class Exercicio28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de n: ");
        int n = sc.nextInt();
        System.out.println("Agora, insira o valor de p: ");
        int p = sc.nextInt();

        double Apn = fatorial(n)/fatorial(n-p);
        double Cpn = fatorial(n)/(fatorial(p)*fatorial(n-p));

        System.out.println("Arranjo = "+Apn);
        System.out.println("Combinação = "+Cpn);
    }
    public static double fatorial(int num){
         int fat = 1;
         for (int i = 1; i <= num; i++) fat *= i;
         return fat;
    }
}
