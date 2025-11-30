package ListaPOO3.Questao5;

import java.util.*;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Email emailEnviar = new Email();

        System.out.println("Insira o texto para enviar como teste:");
        emailEnviar.enviar(sc.nextLine());
        System.out.println("\nTeste realizado!");
    }
}
