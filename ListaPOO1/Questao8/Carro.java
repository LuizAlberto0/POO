package ListaPOO1.Questao8;

public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(){}

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public Motor getMotor(){
        return motor;
    }
    public void darPartida(){
        motor.ligar();
    }
    public void parar(){
        motor.desligar();
    }
    public String toString(){
        return "Modelo: "+modelo+"\nMotor: "+motor;
    }
}
