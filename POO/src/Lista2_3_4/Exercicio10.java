package Lista2_3_4;

import java.util.*;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double fat = 1;

        System.out.println("Insira um número inteiro: ");
        int N = sc.nextInt();
        while(N<=0){
            System.out.println("Valor inválido! Insira um valor válido: ");
            N = sc.nextInt();
        }
        int aux = N;
        do{
            fat*=aux;
            aux--;
        }while(aux != 1);
        System.out.println(N+"! = "+fat);
    }
}
