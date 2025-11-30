package ListaPOO3.Questao4;

import java.util.*;

public class Zoologico {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Animal> jaulas = new ArrayList<>();

        int opc, resp;
        do{
            System.out.println("### JAULAS ###");
            System.out.println("(1) - Adicionar um animal à uma jaula.");
            System.out.println("(2) - Examinar um animal de alguma jaula.");
            System.out.println("(3) - Passar por cada jaula.");
            System.out.println("(4) - Finalizar programa.");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc){
                case 1:
                    do {
                        System.out.println("### TIPOS DE ANIMAIS ###");
                        System.out.println("(1) - Cachorro.");
                        System.out.println("(2) - Cavalo.");
                        System.out.println("(3) - Preguiça.");
                        System.out.println("(4) - Voltar à tela anterior.");
                        resp = sc.nextInt();
                        sc.nextLine();
                        switch (resp) {
                            case 1:
                                Cachorro cacho = new Cachorro();
                                System.out.println("Insira o nome do cachorro:");
                                cacho.setNome(sc.nextLine());
                                System.out.println("Insira a idade do cachorro(em anos):");
                                cacho.setIdade(sc.nextInt());
                                jaulas.add(cacho);
                                System.out.println("Cachorro adicionado!");
                                break;
                            case 2:
                                Cavalo cav = new Cavalo();
                                System.out.println("Insira o nome do cavalo:");
                                cav.setNome(sc.nextLine());
                                System.out.println("Insira a idade do cavalo(em anos):");
                                cav.setIdade(sc.nextInt());
                                jaulas.add(cav);
                                System.out.println("Cavalo adicionado!");
                                break;
                            case 3:
                                Preguica preg = new Preguica();
                                System.out.println("Insira o nome da preguiça:");
                                preg.setNome(sc.nextLine());
                                System.out.println("Insira a idade da preguiça(em anos):");
                                preg.setIdade(sc.nextInt());
                                jaulas.add(preg);
                                System.out.println("Preguiça adicionada!");
                                break;
                            case 4:
                                System.out.println("Voltando à tela inicial!");
                                break;
                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                                break;
                        }
                    }while(resp!=4);
                    break;
                case 2:
                    Veterinario vet = new Veterinario();
                    System.out.println("### LISTA DE JAULAS ###");
                    for(Animal a : jaulas) System.out.println(jaulas.indexOf(a)+" - "+a.getNome()+", o "+a.getClass().getSimpleName().toLowerCase()+" - "+a);
                    System.out.println("Insira o index referente à jaula que desejas acessar:");
                    int index = sc.nextInt();
                    vet.examinar(jaulas.get(index));
                    System.out.println(jaulas.get(index).getNome()+" foi examinado... "+vet.examinar(jaulas.get(index)));
                    break;
                case 3:
                    for(Animal a : jaulas) {
                        if(!a.getClass().getSimpleName().equalsIgnoreCase("preguica")) System.out.println("Passando pela jaula de "+a.getNome()+", o "+a.getClass().getSimpleName().toLowerCase()+ "... "+a.movimentamento());
                        else System.out.println("Passando pela jaula de "+a.getNome()+", a "+a.getClass().getSimpleName().toLowerCase()+"...");
                    }
                    break;
                case 4:
                    System.out.println("Finalizando programa.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }while(opc!=4);
    }
}
