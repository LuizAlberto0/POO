package Lista2_3_4;

import java.util.*;

public class Exercicio18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantia de linhas: ");
        int linhas = sc.nextInt();
        while(linhas<=0){
            System.out.println(linhas+" é uma quantia inválida de linhas. Insira um número maior que 0.");
            linhas = sc.nextInt();
        }
        int cont = 1;
        StringBuilder ast = new StringBuilder();
        do{
            ast.append("*");
            System.out.println(ast);
            cont++;
        }while(cont<=linhas);
    }
}
