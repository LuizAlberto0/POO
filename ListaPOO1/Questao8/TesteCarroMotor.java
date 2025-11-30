package ListaPOO1.Questao8;

import java.util.*;

public class TesteCarroMotor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Carro> carros = new ArrayList<>();

        String resp;
        do{
            Carro c = new Carro();
            Motor m = new Motor();
            System.out.println("\n### Tabela de Montagem de Carros ###");
            System.out.println("Responda todas as perguntas para criar um objeto de Carro.");
            System.out.println("Vamos começar com o motor. Insira a potência do motor:");
            m.setPotencia(sc.nextInt());
            while(!m.verificaPotencia()){
                System.out.println("Potência inválida! Somente valores maiores que 0!");
                m.setPotencia(sc.nextInt());
            }
            c.setMotor(m);
            sc.nextLine();

            System.out.println("Agora, vamos para o modelo do carro. Indique qual será:");
            c.setModelo(sc.nextLine());
            carros.add(c);

            System.out.println("Deseja continuar adicionando carros à lista? (Sim/Não)");
            resp = sc.nextLine().toLowerCase();
        }while(resp.equals("sim"));
        int opc;
        do{
            System.out.println("\n### OPERAÇÕES ###");
            System.out.println("(1) - Pesquisar carros num intervalo de potências (min, max).");
            System.out.println("(2) - Dar partida em um carro específico.");
            System.out.println("(3) - Desligar um carro específico.");
            System.out.println("(4) - Imprimir estados de cada veículo.");
            System.out.println("(5) - Encerrar programa.");
            opc = sc.nextInt();
            sc.nextLine();
            switch(opc){
                case 1:
                    System.out.println("Insira o min da pesquisa:");
                    int min = sc.nextInt();
                    System.out.println("Agora, insira o max:");
                    int max = sc.nextInt();
                    for(Carro c : carros){
                        if(c.getMotor().getPotencia() >= min && c.getMotor().getPotencia() <= max){
                            System.out.println(carros.indexOf(c)+1+" - "+c);
                        }
                    }
                    break;
                case 2:
                    System.out.println("\n### Lista de Carros ###");
                    for(int i = 0; i < carros.size(); i++) System.out.println(i+1+" - "+carros.get(i).getModelo());
                    System.out.println("\nInsira o número referente ao carro que desejas dar partida:");
                    opc = sc.nextInt();
                    carros.get(opc-1).darPartida();
                    break;
                case 3:
                    System.out.println("\n### Lista de Carros ###");
                    for(int i = 0; i < carros.size(); i++) System.out.println(i+1+" - "+carros.get(i).getModelo());
                    System.out.println("\nInsira o número referente ao carro que desejas desligar:");
                    opc = sc.nextInt();
                    carros.get(opc-1).parar();
                    break;
                case 4:
                    System.out.println("\n### Lista de Carros ###");
                    for(Carro c : carros) System.out.println(c);
                    break;
                case 5:
                    System.out.println("Encerrando programa. Tenha um bom dia.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }while(opc!=5);
    }
}
