package Lista2_3_4;

import java.util.*;

public class Exercicio15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String escolha;
        double saldo = 0;

        do{
            System.out.println("Opções:");
            System.out.println("(a) consulta saldo");
            System.out.println("(b) saque");
            System.out.println("(c) depósito");
            System.out.print("(d) sair\n>");
            escolha = sc.nextLine().toLowerCase();

            if(escolha.equals("a")) System.out.println("\tR$ "+saldo);
            if(escolha.equals("b")){
                System.out.println("Insira a quantia que deseja sacar (em R$): ");
                double saque = sc.nextDouble();
                while(saque<0){
                    System.out.println("R$"+saque+" é um valor inválido! Insira um valor positivo: ");
                    saque = sc.nextDouble();
                }
                saldo-=saque;
                sc.nextLine();
            }
            if(escolha.equals("c")){
                System.out.println("Insira a quantia que desejas depositar (em R$): ");
                double deposito = sc.nextDouble();
                while(deposito<0){
                    System.out.println("R$"+deposito+" é um valor inválido! Insira um valor positivo: ");
                    deposito = sc.nextDouble();
                }
                saldo+=deposito;
                sc.nextLine();
            }
            if(escolha.equals("d")) System.out.println("Tenha um bom dia!");
        }while(!escolha.equals("d"));
    }
}
