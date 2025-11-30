package ListaPOO1.Questao4;

import java.util.*;

public class PrincipalEstoque {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Estoque estoque1 = new Estoque("Impressora Jato de Tinta",13,6);
        Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas",11,13);
        Estoque estoque3 = new Estoque("Mouse Ótico",6,2);

        estoque1.darBaixa(5);

        estoque2.repor(7);

        estoque3.darBaixa(4);

        System.out.println("Precisa repor o estoque 1?");
        System.out.println(estoque1.precisaRepor());
        System.out.println("Precisa repor o estoque 2?");
        System.out.println(estoque2.precisaRepor());
        System.out.println("Precisa repor o estoque 3?");
        System.out.println(estoque3.precisaRepor());

        System.out.println(estoque1.mostra());
        System.out.println(estoque2.mostra());
        System.out.println(estoque3.mostra());
    }
}
