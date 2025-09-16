package Lista2_3_4;

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int A = sc.nextInt();
        System.out.println("Agora, insira um outro número inteiro: ");
        int B = sc.nextInt();

        if(A%B!=0) System.out.println("A divisão de "+A+" por "+B+" não pode ser representada por números inteiros.");
        else System.out.println("A divisão de "+A+" por "+B+" pertence aos inteiros, e é igual a "+A/B);
    }
}
