package ListaPOO1.Questao11;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Pedido {
    private String numero;
    private ArrayList<ItemPedido> itens;

    public Pedido(){ this.itens = new ArrayList<>(); this.numero = randomString.gerarID(3); }

    public void adicionarItem(ItemPedido item){
        if(item.getQuantidade() >= 1 && item.getPrecoUnitario() > 0) this.itens.add(item);
        else System.out.println("Erro ao adiconar item. Tente novamente.");
    }
    public boolean removerItemPorDescricao(String descricao){
        return itens.removeIf(itemPedido -> itemPedido.getDescricao().equals(descricao));
    }
    public ItemPedido buscarItemPorDescricao(String descricao){
        ItemPedido item = new ItemPedido();
        for(ItemPedido i : this.itens){
            if(i.getDescricao().equals(descricao)) item = i;
        }
        return item;
    }
    public ArrayList<ItemPedido> filtrarPorPrecoUnitMin(double precoMin){
        ArrayList<ItemPedido> itensEncontrados = new ArrayList<>();
        for(ItemPedido i : this.itens){
            if(i.getPrecoUnitario()<=precoMin) itensEncontrados.add(i);
        }
        return itensEncontrados;
    }
    public double total(){
        double total = 0;
        for (ItemPedido iten : this.itens) total += iten.subTotal();
        return total;
    }
    public String listarItens(){
        StringBuilder lista = new StringBuilder();
        itens.forEach(i -> lista.append(i.getDescricao()).append(";\n"));
        return lista.toString();
    }
}
class randomString{
    private static final String CHARS = "1234567890";
    private static final SecureRandom random = new SecureRandom();

    public static String gerarID(int x){
        StringBuilder sb = new StringBuilder(x);
        for(int i = 0; i < x; i++) sb.append(CHARS.charAt(random.nextInt(CHARS.length())));
        return sb.toString();
    }
}