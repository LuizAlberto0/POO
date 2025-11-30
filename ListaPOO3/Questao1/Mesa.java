package ListaPOO3.Questao1;

import java.util.*;

public class Mesa {
    private int numero;
    private String cliente;
    private ArrayList<Pedido> pedidos;

    public Mesa(){ this.pedidos = new ArrayList<>(); }

    public void setCliente(String cliente) { this.cliente = cliente; }
    public String getCliente(){ return this.cliente; }
    public void setNumero(int numero) { this.numero = numero; }
    public int getNumero() { return this.numero; }
    public void setPedidos(ArrayList<Pedido> pedidos) { this.pedidos = pedidos; }
    public ArrayList<Pedido> getPedidos() { return this.pedidos; }
    public String listarMesa(){ return "Mesa número: "+this.numero+" - Cliente: "+this.cliente; }
    public String toString(){ return "Mesa número "+this.numero+" - Cliente: "+this.cliente+"\nPedidos: "+this.pedidos; }
}
