package Lista2_3_4;

import java.util.*;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String cont;

        do {
            System.out.println("Insira o nome: ");
            String nome = sc.nextLine();
            System.out.println("Insira a n1 de " + nome + ": ");
            double n1 = sc.nextDouble();
            while (n1 < 0 || n1 > 10) {
                System.out.println(n1 + " é inválido. Insira uma nota válida: ");
                n1 = sc.nextDouble();
            }
            System.out.println("Agora, insira a n2: ");
            double n2 = sc.nextDouble();
            while (n2 < 0 || n2 > 10) {
                System.out.println(n2 + " é inválido. Insira uma nota válida: ");
                n2 = sc.nextDouble();
            }

            double media = (n1+n2)/2;

            System.out.println("O "+nome+" tem uma média: "+media);

            System.out.println("Gostaria de continuar (sim/não)? ");
            sc.nextLine();
            cont = sc.nextLine();
        }while(cont.equals("sim")||cont.equals("Sim")||cont.equals("SIM"));
    }
}
