package ListaPOO3.Questao6;

public class PagamentoBoleto implements Pagamento{
    @Override
    public void processar(double valor) { System.out.println("Um boleto no valor de R$"+valor+" está sendo gerado."); }
}
