package Lista2_3_4;

import java.util.*;

public class Exercicio21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double[] V = new double[15];

        for(int i = 0; i<15; i++){
            System.out.println("Insira um número inteiro aleatório: ");
            int num = sc.nextInt();
            if(num < 0) V[i]=-1;
            else V[i] = Math.sqrt(num);
        }
        System.out.print("Os elementos do vetor: V["+V[0]);
        for(int i = 1; i<15; i++){
            System.out.print(", "+V[i]);
        }
        System.out.print("]");
    }
}
