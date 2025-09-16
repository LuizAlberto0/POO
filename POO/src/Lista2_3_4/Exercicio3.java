package Lista2_3_4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        double ValorCompra, ValorVenda;

        System.out.println("Insira o valor da compra do produto (em R$): ");
        ValorCompra = sc.nextFloat();
        while(ValorCompra<0){
            System.out.println("Preço inválido! Insira um valor compatível: ");
            ValorCompra = sc.nextFloat();
        }
        if(ValorCompra<10) ValorVenda = ValorCompra*1.7;
        else if(ValorCompra>=10 && ValorCompra<30) ValorVenda = ValorCompra*1.5;
        else if(ValorCompra>=30 && ValorCompra<50) ValorVenda = ValorCompra*1.4;
        else ValorVenda = ValorCompra*1.3;

        System.out.println("O valor de venda do produto será R$"+ValorVenda);
    }
}
