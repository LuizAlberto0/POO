package ListaPOO3.Questao4;

public class Cachorro extends Animal{
    public Cachorro(){}

    @Override
    public String movimentamento() { return this.getNome()+" correu!"; }
}
