package Lista2_3_4;

import java.util.*;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String classificacao = "";

        System.out.println("Insira o codigo referente ao produto: ");
        int codigo = sc.nextInt();
        while(codigo<0||codigo>15){
            System.out.println("Código inválido! Insira um código compatível com o armazém: ");
            codigo = sc.nextInt();
        }
        if(codigo == 1) classificacao = "Alimento não perecível";
        else if(2<=codigo&&codigo<=4) classificacao = "Alimento perecível";
        else if(codigo==5||codigo==6) classificacao = "Vestuário";
        else if(codigo==7) classificacao = "Higiene pessoal";
        else classificacao = "Limpeza e utensílios domésticos";

        System.out.println("Código: "+codigo+"\tClassifição: "+classificacao);
    }
}
