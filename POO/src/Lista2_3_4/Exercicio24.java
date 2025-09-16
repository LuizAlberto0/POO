package Lista2_3_4;

import java.util.*;

public class Exercicio24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];

        int code = 1;

        for(int i = 0; i<10; i++){
            System.out.println("Insira um número inteiro para o vetor: ");
            v[i] = sc.nextInt();
        }
        while(code!=0) {
            System.out.println("Agora, insira o código que gostarias (0 = terminar o programa; 1 = mostrar o vetor na ordem" +
                    "direta; 2 = mostrar o vetor na ordem inversa): ");
            code = sc.nextInt();
            while (code < 0 || code > 3) {
                System.out.println(code + " é uma opção inválida. Insira alguma opção apresentada anteriormente:");
                code = sc.nextInt();
            }
            if (code == 1) {
                System.out.print("v [ ");
                for(int i = 0; i < v.length; i++) System.out.print(v[i] + " ");
                System.out.println("]");
            }
            if (code == 2) {
                System.out.print("v [ ");
                for (int i = v.length - 1; i >= 0; i--) System.out.print(v[i] + " ");
                System.out.println("]");
            }
        }
        System.out.println("Finalizando o programa.");
    }
}
