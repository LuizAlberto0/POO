package ListaPOO3.Questao5;

public class Email implements Mensagem{
    @Override
    public void enviar(String texto) { System.out.println("Enviando e-mail: "+texto);}
}
