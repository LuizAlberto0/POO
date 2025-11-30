package ListaPOO1.Questao13;

import java.util.ArrayList;
import java.util.Optional;

public class PedidoCompra {
    private String id;
    private Fornecedor fornecedor;
    private ArrayList<ItemPedido> itens;
    private int porcentualDesconto;
    private String status;

    public PedidoCompra(String id, Fornecedor fornecedor){
        this.id = id;
        this.fornecedor = fornecedor;
        this.itens = new ArrayList<>();
        this.porcentualDesconto = 0;
        this.status = "ABERTO";
    }

    public ArrayList<ItemPedido> getItens(){ return this.itens; }

    public void adicionarItem(ItemPedido i){
        if(!this.status.equals("ABERTO")){
            System.out.println("Não é possível adicionar um item à um pedido que não está ABERTO.");
            return;
        }
        Optional<ItemPedido> itemPresente = itens.stream().filter(itemPedido -> itemPedido.getProduto().getSku().equals(i.getProduto().getSku())).findAny();
        if(itemPresente.isPresent()){
            ItemPedido item = itemPresente.get();
            item.setQuantidade(item.getQuantidade()+i.getQuantidade());
            item.setPrecoUnitario(i.getPrecoUnitario());
            System.out.println("SKU encontrado na lista! SKU, quantidade e preço unitário atualizados.");
        }
        else{
            itens.add(i);
            System.out.println("Item adicionado!");
        }
    }

    public boolean removerPorSKU(String sku){
        if(!this.status.equals("ABERTO")){
            System.out.println("Não é possível adicionar um item à um pedido que não está ABERTO.");
            return false;
        }
        boolean remove = itens.removeIf(itemPedido -> itemPedido.getProduto().getSku().equalsIgnoreCase(sku));
        if(remove) System.out.println("Item removido com sucesso!");
        else System.out.println("SKU não encontrado! Nenhum item foi removido.");
        return remove;
    }

    public ItemPedido buscarPorSKU(String sku){
        return itens.stream().filter(itemPedido -> itemPedido.getProduto().getSku().equalsIgnoreCase(sku)).findFirst().orElse(null);
    }

    public double totalBruto(){
        return itens.stream().mapToDouble(ItemPedido::subTotal).sum();
    }

    public boolean aplicarDesconto(int porcentualDesconto){
        if(porcentualDesconto>=0 && porcentualDesconto<=20){
            this.porcentualDesconto = porcentualDesconto;
            System.out.println("Desconto aplicado!");
            return true;
        }
        System.out.println("Desconto não foi aplicado!");
        return false;
    }

    public double totalLiquido(){
        double liquido = totalBruto() - (totalBruto()*(this.porcentualDesconto/100.0));
        return Math.max(0,liquido);
    }

    public boolean aprovar(){
        if(!this.status.equals("ABERTO")){
            System.out.println("FALHA! Não é possível aprovar um pedido que não está aberto.");
            return false;
        }
        if(itens.isEmpty()){
            System.out.println("FALHA! Não é possível aprovar um pedido que não há itens.");
            return false;
        }
        if(totalLiquido()<=0){
            System.out.println("FALHA! Não é possível aprovar um pedido que não apresenta um total líquido maior que 0.");
            return false;
        }
        this.status = "APROVADO";
        System.out.println("Pedido aprovado!");
        return true;
    }

    public boolean cancelar(){
        if(this.status.equals("APROVADO")){
            System.out.println("ERRO! Não é possível cancelar um pedido aprovado!");
            return false;
        }
        this.status = "CANCELADO";
        System.out.println("Pedido cancelado com sucesso!");
        return true;
    }
}
