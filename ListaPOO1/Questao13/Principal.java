package ListaPOO1.Questao13;

import java.util.*;

public class Principal {
    public static void main(String[] args){
        Fornecedor fornecedor = new Fornecedor("FORNEC001", "Fornecedor 001", "69.420 000 1337 69");

        Produto p1 = new Produto("P5P25TN23", "Iphone 15 PRO Max 256 GB cor titânio natural", 8000);
        Produto p2 = new Produto("A22JN21", "Agenda 22 cm Journal", 50);
        Produto p3 = new Produto("B30ZN01", "Barbeadora", 300);
        Produto p4 = new Produto("B30ZN01", "Barbeadora PRO", 450);
        Produto p5 = new Produto("Y02UH82", "Kit de Amolar Facas", 120);

        PedidoCompra pedidoCompra = new PedidoCompra("000T1", fornecedor);

        ItemPedido item1 = new ItemPedido(p1);
        item1.setQuantidade(5);
        pedidoCompra.adicionarItem(item1);

        ItemPedido item2 = new ItemPedido(p2);
        item2.setQuantidade(20);
        pedidoCompra.adicionarItem(item2);

        ItemPedido item3 = new ItemPedido(p3);
        item3.setQuantidade(15);
        pedidoCompra.adicionarItem(item3);

        ItemPedido item4 = new ItemPedido(p5);
        item4.setQuantidade(8);
        pedidoCompra.adicionarItem(item4);

        ItemPedido item5 = new ItemPedido(p4);
        item5.setQuantidade(12);
        pedidoCompra.adicionarItem(item5);



        System.out.println("Buscando SKU A22JN21 nos itens:");
        pedidoCompra.buscarPorSKU("A22JN21");
        System.out.println("Subtotal: R$"+pedidoCompra.buscarPorSKU("A22JN21").subTotal());

        System.out.println("Removendo item pelo SKU P5P25TN23:");
        pedidoCompra.removerPorSKU("P5P25TN23");

        pedidoCompra.aplicarDesconto(10);
        System.out.println("Total Bruto: R$"+pedidoCompra.totalBruto()+"\nTotal Líquido: R$"+pedidoCompra.totalLiquido());

        pedidoCompra.aprovar();
        pedidoCompra.cancelar();
    }
}
