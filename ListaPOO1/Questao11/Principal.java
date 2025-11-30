package ListaPOO1.Questao11;

import java.util.*;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Pedido pedido = new Pedido();

        int opc;
        do{
            System.out.println("### INTERAGINDO COM OS ITENS ###");
            System.out.println("(1) - Listar itens.");
            System.out.println("(2) - Adicionar item.");
            System.out.println("(3) - Remover item por descrição.");
            System.out.println("(4) - Buscar item por descrição.");
            System.out.println("(5) - Filtrar por preço unitário mínimo.");
            System.out.println("(6) - Listar conta total.");
            System.out.println("(7) - Encerrar programa.");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc){
                case 1:
                    System.out.println("### LISTA DE ITENS ###");
                    System.out.println(pedido.listarItens()+"\n");
                    break;
                case 2:
                    ItemPedido item = new ItemPedido();
                    System.out.println("Insira a descrição do item:");
                    item.setDescricao(sc.nextLine());
                    System.out.println("Insira o preço unitário(em R$):");
                    item.setPrecoUnitario(sc.nextDouble());
                    System.out.println("Insira a quantidade:");
                    item.setQuantidade(sc.nextInt());
                    pedido.adicionarItem(item);
                    break;
                case 3:
                    System.out.println("Insira a descrição do item que desejas remover:");
                    String desc = sc.nextLine();
                    if(!pedido.removerItemPorDescricao(desc)) System.out.println("Erro! Item não encontrado!");
                    else {
                        System.out.println("Item removido!");
                        pedido.removerItemPorDescricao(desc);
                    }
                    break;
                case 4:
                    System.out.println("Insira a descrição do item que desejas buscar:");
                    String busca = sc.nextLine();
                    System.out.println(pedido.buscarItemPorDescricao(busca));
                    break;
                case 5:
                    System.out.println("Insira o preço unitário, em R$, para servir de busca:");
                    double preco = sc.nextDouble();
                    while(preco<=0){
                        System.out.println("Preço inválido! Tente novamente.");
                        preco = sc.nextDouble();
                    }
                    System.out.println(pedido.filtrarPorPrecoUnitMin(preco));
                    break;
                case 6:
                    System.out.println("### TOTAL ###");
                    System.out.println("R$"+pedido.total());
                    break;
                case 7:
                    System.out.println("Encerrando programa.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }while(opc!=7);
    }
}
