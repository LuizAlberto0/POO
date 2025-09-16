package Lista2_3_4;

import java.util.*;

public class Exercicio17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double totalPedido = 0;
        int qtd,opc = 0;

        do{
            System.out.println("Produto\t\t\tCódigo\tPreço(unitário)");
            System.out.println("Cachorro quente\t1\t\tR$1,50");
            System.out.println("Hamburguer\t\t2\t\tR$2,00");
            System.out.println("Cheeseburger\t3\t\tR$2,50");
            System.out.println("Eggcheeseburger\t4\t\tR$3,00");
            System.out.println("Refrigerante\t5\t\tR$1,50");
            System.out.print("Sair\t\t\t6\n>");
            opc = sc.nextInt();
            while(opc<1||opc>6){
                System.out.println("Opção inválida! Selecione alguma opcção da tabela: ");
                opc = sc.nextInt();
            }
            switch(opc){
                case 1:
                    System.out.println("Quantos cachorros quentes gostaria?");
                    qtd = sc.nextInt();
                    while(qtd<1){
                        System.out.println(qtd+" é uma quantia inválida. Tente novamente: ");
                        qtd = sc.nextInt();
                    }
                    totalPedido+=qtd*1.5;
                    break;
                case 2:
                    System.out.println("Quantos hamburgueres gostaria?");
                    qtd = sc.nextInt();
                    while(qtd<1){
                        System.out.println(qtd+" é uma quantia inválida. Tente novamente: ");
                        qtd = sc.nextInt();
                    }
                    totalPedido+=qtd*2;
                    break;
                case 3:
                    System.out.println("Quantos cheeseburgers gostaria?");
                    qtd = sc.nextInt();
                    while(qtd<1){
                        System.out.println(qtd+" é uma quantia inválida. Tente novamente: ");
                        qtd = sc.nextInt();
                    }
                    totalPedido+=qtd*2.5;
                    break;
                case 4:
                    System.out.println("Quantos eggcheeseburgers gostaria?");
                    qtd = sc.nextInt();
                    while(qtd<1){
                        System.out.println(qtd+" é uma quantia inválida. Tente novamente: ");
                        qtd = sc.nextInt();
                    }
                    totalPedido+=qtd*3;
                    break;
                case 5:
                    System.out.println("Quantos refrigerantes gostaria?");
                    qtd = sc.nextInt();
                    while(qtd<1){
                        System.out.println(qtd+" é uma quantia inválida. Tente novamente: ");
                        qtd = sc.nextInt();
                    }
                    totalPedido+=qtd*1.5;
                    break;
            }
        }while(opc != 6);
        System.out.println("Obrigado por comprar conosco!!!");
        System.out.println("O total do pedido deu: R$"+totalPedido);
    }
}
