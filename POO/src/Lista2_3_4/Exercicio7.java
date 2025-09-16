package Lista2_3_4;

import java.util.*;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o código referente ao cargo do funcionário: ");
        int code = sc.nextInt();
        while(code<1 || code>5){
            System.out.println("Código inválido! Insira um código que esteja na tabela.");
            code = sc.nextInt();
        }
        System.out.println("Perfeito, agora insira o salário do funcionário: ");
        double sal = sc.nextDouble();
        while (sal <= 0) {
            System.out.println("Salário inválido. Insira um salário válido: ");
            sal = sc.nextDouble();
        }
        if(code == 1){
            System.out.println("Código: "+code+" - Cargo: Escrituário - Novo salário: R$"+sal*1.5);
        }
        if(code == 2){
            System.out.println("Código: "+code+" - Cargo: Secretário - Novo salário: R$"+sal*1.35);
        }
        if(code == 3){
            System.out.println("Código: "+code+" - Cargo: Caixa - Novo salário: R$"+sal*1.2);
        }
        if(code == 4){
            System.out.println("Código: "+code+" - Cargo: Gerente - Novo salário: R$"+sal*1.1);
        }
        if(code == 5){
            System.out.println("Código: "+code+" - Cargo: Diretor - Não terá aumento, salário: R$"+sal);
        }
    }
}
