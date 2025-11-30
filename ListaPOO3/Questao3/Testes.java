package ListaPOO3.Questao3;

import java.util.*;

public class Testes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Forma> formas = new ArrayList<>();

        int opc;
        do{
            System.out.println("### CRIANDO FORMAS ###");
            System.out.println("(1) - Criar quadrado.");
            System.out.println("(2) - Criar retangulo.");
            System.out.println("(3) - Criar círculo.");
            System.out.println("(4) - Listar formas criadas.");
            System.out.println("(5) - Encerrar programa.");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc){
                case 1:
                    Quadrado quad = new Quadrado();
                    System.out.println("Insira a medida do lado:");
                    quad.setLado(sc.nextFloat());
                    formas.add(quad);
                    System.out.println("Quadrado criado com sucesso!");
                    break;
                case 2:
                    Retangulo ret = new Retangulo();
                    System.out.println("Insira a medida do lado:");
                    ret.setLado(sc.nextFloat());
                    System.out.println("Agora, insira a medida da altura:");
                    ret.setAltura(sc.nextFloat());
                    formas.add(ret);
                    System.out.println("Retangulo criado com exito!");
                    break;
                case 3:
                    Circulo circ = new Circulo();
                    System.out.println("Insira a medida do raio:");
                    circ.setRaio(sc.nextFloat());
                    formas.add(circ);
                    System.out.println("Círculo criado com sucesso!");
                    break;
                case 4:
                    System.out.println("### LISTA DE FORMAS CRIADAS ###");
                    for(Forma a : formas) System.out.println(a);
                    break;
                case 5:
                    System.out.println("Encerrando programa.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }while(opc!=5);
    }
}
