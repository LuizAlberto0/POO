package Lista2_3_4;

import java.util.*;

public class Exercicio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double res=1;

        System.out.println("Insira o valor de x: ");
        double x = sc.nextDouble();
        System.out.println("Agora, insira o valor de y: ");
        double y = sc.nextDouble();

        for(int i = 1; i<=y; i++){
            res*=x;
        }

        System.out.println("x^y = "+res);
    }
}
