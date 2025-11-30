package ListaPOO3.Questao6;

public class PagamentoCartaoCredito implements Pagamento{
    @Override
    public void processar(double valor) { System.out.println("Pagamento do Cartão de Crédito de R$"+valor+" está sendo processado."); }
}
