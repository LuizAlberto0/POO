package ListaPOO3.Questao2;

public class Cliente extends Pessoa{
    private double valorDivida;
    private int anoNascim;

    public Cliente(){}

    public void setValorDivida(double valorDivida) { this.valorDivida = valorDivida; }
    public double getValorDivida() { return this.valorDivida; }
    public void setAnoNascim(int anoNascim) { this.anoNascim = anoNascim; }
    public int getAnoNascim() { return this.anoNascim; }
    public String toString(){ return "Nome: "+getNome()+" - Idade: "+getIdade()+" anos - Ano de nascimento: "+this.anoNascim+
    "\nSexo: "+getSexo()+" - Dívida: R$"+this.valorDivida; }
}
