package ListaPOO1.Questao7;

public class Endereco {
    private String rua;
    private String numero;
    private String cidade;
    private String uf;

    public Endereco(){}

    public void setRua(String rua){
        this.rua = rua;
    }
    public String getRua(){
        return rua;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getNumero(){
        return numero;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getCidade(){
        return cidade;
    }
    public void setUf(String uf){
        this.uf = uf;
    }
    public String getUf(){
        return uf;
    }
    public String toString(){
        return "\nCidade: "+cidade+"\nUf: "+uf+"\nRua: "+rua+"\nNúmero: "+numero;
    }
}
