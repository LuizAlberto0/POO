package ListaPOO1.Questao2;

import java.util.*;

public class PrincipalQuadrado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a medida do lado do quadrado 1: ");
        Quadrado q1 = new Quadrado(sc.nextDouble());

        System.out.println("Agora, insira a medida do lado do quadrado 2: ");
        Quadrado q2 = new Quadrado(sc.nextDouble());

        System.out.println("Perfeito, agora insira a medida do lado do quadrado 3: ");
        Quadrado q3 = new Quadrado(sc.nextDouble());

        System.out.println("### Informações ###");
        System.out.println("# q1 #\nLado: "+q1.getLado()+"\nArea: "+q1.area()+"\nPerimetro: "+q1.perimetro());
        System.out.println("# q2 #\nLado: "+q2.getLado()+"\nArea: "+q2.area()+"\nPerimetro: "+q2.perimetro());
        System.out.println("# q3 #\nLado: "+q3.getLado()+"\nArea: "+q3.area()+"\nPerimetro: "+q3.perimetro());
    }
}
