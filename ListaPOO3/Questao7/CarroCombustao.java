package ListaPOO3.Questao7;

public class CarroCombustao implements Veiculo{
    @Override
    public void frear() { System.out.println("Carro a combustão está freando!"); }

    @Override
    public void acelerar() { System.out.println("Carro a combustão está acelerando, pisa fundo!"); }
}
