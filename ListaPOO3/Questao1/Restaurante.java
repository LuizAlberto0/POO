package ListaPOO3.Questao1;

import java.util.*;

public class Restaurante {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Mesa> mesas = new ArrayList<>();
        double faturamento = 0;

        int opc, index, resp;
        do{
            System.out.println("### RESTAURANTE DO TADEU ###");
            System.out.println("(1) - Adicionar mesas.");
            System.out.println("(2) - Selecionar mesa.");
            System.out.println("(3) - Encerrar programa e ver o faturamento do dia.");
            opc = sc.nextInt();
            sc.nextLine();
            switch(opc){
                case 1:
                    Mesa mesa = new Mesa();
                    System.out.println("Indique o número da mesa:");
                    mesa.setNumero(sc.nextInt());
                    System.out.println("Indique o nome do cliente:");
                    mesa.setCliente(sc.nextLine());
                    sc.nextLine();
                    mesas.add(mesa);
                    break;
                case 2:
                    System.out.println("### LISTA DE MESAS ###");
                    for(Mesa i : mesas) System.out.println("Posição "+mesas.indexOf(i)+" - "+i.listarMesa());
                    System.out.println("Insira a posição referente à mesa que desejas acessar:");
                    index = sc.nextInt();
                    do{
                        System.out.println("### MESA "+mesas.get(index).getNumero()+" ###");
                        System.out.println("(1) - Fazer um pedido.");
                        System.out.println("(2) - Retirar a mesa.");
                        System.out.println("(3) - Voltar à tela inicial.");
                        resp = sc.nextInt();
                        sc.nextLine();
                        switch(resp){
                            case 1:
                                Pedido pedido = new Pedido();
                                System.out.println("Insira o nome do produto:");
                                pedido.setNome(sc.nextLine());
                                System.out.println("Insira o valor do produto (em R$):");
                                pedido.setValor(sc.nextDouble());
                                mesas.get(index).getPedidos().add(pedido);
                                break;
                            case 2:
                                for(Pedido p : mesas.get(index).getPedidos()) faturamento += p.getValor();
                                mesas.remove(mesas.get(index));
                                System.out.println("Mesa removida!");
                                resp = 3;
                                break;
                            case 3:
                                System.out.println("Retornando à tela inicial!");
                                break;
                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                                break;
                        }
                    }while(resp!=3);
                    break;
                case 3:
                    System.out.println("Encerrando programa. Faturamento do dia: R$"+faturamento);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }while(opc!=3);
    }
}
