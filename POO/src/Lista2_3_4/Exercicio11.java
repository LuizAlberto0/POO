package Lista2_3_4;

import java.util.*;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o divisor: ");
        int divisor = sc.nextInt();
        System.out.println("Agora, insira um número para definir o intervalo: ");
        int inicio = sc.nextInt();
        System.out.println("Perfeito, agora um outro número para fechar o intervalo: ");
        int fim = sc.nextInt();

        System.out.println("Os números entre "+inicio+" e "+fim+" divisíveis por "+divisor+" são:");
        for(int i = Math.min(inicio, fim); i <= Math.max(inicio, fim); i++){
            if(i%divisor==0) System.out.print(i+"\t");
        }
    }
}
