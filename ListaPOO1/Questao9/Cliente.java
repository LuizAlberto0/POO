package ListaPOO1.Questao9;

import java.security.SecureRandom;

public class Cliente {
    private final String id;
    private String nome;
    private CartaoCredito cartao;

    public Cliente(){
        this.id = randomString.gerarID(8);
    }
    public String getId() {
        return id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCartao(CartaoCredito cartao) {
        this.cartao = cartao;
    }
    public CartaoCredito getCartao(){ return this.cartao; }
    public String listarClientes(){ return "ID: "+id+" - Titular: "+nome; }
    public String toString(){
        return "ID: "+id+"\nNome: "+nome+"\nCartão: "+cartao;
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
