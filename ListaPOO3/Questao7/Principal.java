package ListaPOO3.Questao7;

import java.util.*;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> carros = new ArrayList<>();

        int opc;
        do{
            System.out.println("### CRIANDO VEÍCULOS ###");
            System.out.println("(1) - Criar carro a combustão.");
            System.out.println("(2) - Criar carro elétrico.");
            System.out.println("(3) - Finalizar criação de veículos.");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc){
                case 1:
                    CarroCombustao carro = new CarroCombustao();
                    carros.add(carro);
                    System.out.println("Carro a combustão criado!");
                    break;
                case 2:
                    CarroEletrico car = new CarroEletrico();
                    carros.add(car);
                    System.out.println("Carro elétrico criado!");
                    break;
                case 3:
                    System.out.println("Finalizando a criação de veículos.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }while(opc!=3);
        System.out.println("### PASSANDO PELA LISTA DE VEÍCULOS ###");
        for (Veiculo carro : carros) {
            System.out.println(carro.getClass().getSimpleName());
            carro.acelerar();
            carro.frear();
            if (carro instanceof CarroEletrico) ((CarroEletrico) carro).carregarBateria(50);
            System.out.println();
        }
    }
}
