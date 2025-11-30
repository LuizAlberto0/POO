package ListaPOO3.Questao7;

public class CarroEletrico implements Veiculo, Eletrico{
    @Override
    public void frear() { System.out.println("O carro elétrico está freando!"); }

    @Override
    public void acelerar() { System.out.println("O carro elétrico irá acelerar, segure-se!"); }

    @Override
    public void carregarBateria(int porcentagem) { System.out.println("Carregando a bateria em "+porcentagem+"%."); }
}
