package Lista2_3_4;

import java.util.*;

public class Exercicio13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a senha do sistema: ");
        int senha = sc.nextInt();
        System.out.println("Agora, insira a senha para entrar no sistema: ");
        int novaSenha = sc.nextInt();
        while(senha != novaSenha){
            System.out.println("Senha incorreta! Tente novamente: ");
            novaSenha = sc.nextInt();
        }
        System.out.println("Senha correta! Bem-vindo ao sistema!");
    }
}
