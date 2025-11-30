package ListaPOO1.Questao8;

public class Motor {
    private  int potencia;
    private boolean ligado;

    public Motor(){}

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public int getPotencia() {
        return potencia;
    }
    public boolean verificaPotencia(){
        return potencia>0;
    }
    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }
    public boolean isLigado(){
        return ligado;
    }
    public String toString(){
        return "Potência: "+potencia+" - Ligado: "+ligado;
    }
}
