package Lista2_3_4;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a idade do eleitor: ");
        int idade = sc.nextInt();

        if(idade>=16 && idade<=17) System.out.println("O eleitor é facultativo.");
        else if(idade>=18 && idade<=65) System.out.println("O eleitor é obrigado a votar!");
        else System.out.println("O eleitor é dispensado de votar.");
    }
}
