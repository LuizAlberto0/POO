package Lista2_3_4;

import java.util.*;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double funcao = 0;

        System.out.println("Insira x: ");
        double x = sc.nextDouble();
        System.out.println("Agora, insira y: ");
        double y = sc.nextDouble();

        System.out.println("Por fim, insira o código referente a função que deseja executar:");
        System.out.println(" 1 => f(x,y) = sqrt(x³ + ((x(2y - x))/y²))");
        System.out.println(" 2 => f(x,y) = (sqrt((x³ + y³)+(x³ - y³))/xy");
        System.out.println(" 3 => f(x,y) = 2x + sqrt(xy)");
        System.out.println(" 4 => f(x,y) = sin(x) + cos(y)");
        int code = sc.nextInt();
        while(code<1 || code>4){
            System.out.println("Código inválido! Insira um código referente às opções apresentadas acima.");
            code = sc.nextInt();
        }

        switch(code){
            case 1:
                funcao = Math.sqrt(Math.pow(x,3)+((x*(2*y - x))/Math.pow(y,2)));
                break;
            case 2:
                funcao = (Math.sqrt((Math.pow(x,3)+Math.pow(y,3))+(Math.pow(x,3) - Math.pow(y,3))));
                break;
            case 3:
                funcao = 2*x + Math.sqrt(x*y);
                break;
            case 4:
                funcao = Math.sin(x) + Math.cos(y);
                break;
        }

        System.out.println("O resultado da f(x,y) do código "+code+" é: "+funcao);
    }
}
