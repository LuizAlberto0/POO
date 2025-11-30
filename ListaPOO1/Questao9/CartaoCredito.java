package ListaPOO1.Questao9;

public class CartaoCredito {
    private double limite;
    private double fatura;

    public CartaoCredito(){
        this.fatura = 0;
    }
    public double getFatura() {
        return fatura;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double getLimite() {
        return limite;
    }
    public boolean comprar(double valor){
        if(this.fatura + valor <= this.limite){
            this.fatura += valor;
            this.limite -= valor;
            return true;
        }
        else return false;
    }
    public boolean pagar(double valor){
        if(valor > 0){
            this.fatura -= valor;
            return true;
        }
        else return false;
    }
    public double disponivel(){
        return limite;
    }
    public String toString(){
        return "Limite: R$"+limite+" - Fatura: R$"+fatura;
    }
}
