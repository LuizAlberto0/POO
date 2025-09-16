package Lista2_3_4;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.*;

public class Exercicio19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantia de linhas: ");
        int linhas = sc.nextInt();
        while(linhas<=0){
            System.out.println(linhas+" é uma quantia inválida de linhas. Insira um número maior que 0.");
            linhas = sc.nextInt();
        }
        StringBuilder ast = new StringBuilder();
        int cont = 1;
        do{
            ast.append("*");
            System.out.println(ast+" ");
            cont++;
        }while(cont<=linhas);
        cont = linhas - 1;
        do{
            ast.deleteCharAt(cont);
            System.out.println(ast+" ");
            cont--;
        }while(cont >= 1);
    }
}
