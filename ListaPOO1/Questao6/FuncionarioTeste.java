package ListaPOO1.Questao6;

import java.util.*;

public class FuncionarioTeste {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        int cont = 0;
        do{
            Funcionario func = new Funcionario();
            System.out.println("Insira o ID do funcionário:");
            func.setId(sc.nextLine());

            System.out.println("Agora, insira o nome do funcionário:");
            func.setNome(sc.nextLine());

            System.out.println("Por fim, insira o salário do funcionário (em R$):");
            func.setSalario(sc.nextDouble());
            while(!func.verificaSalario()){
                System.out.println("Valor inválido! Salário >= 0!");
                func.setSalario(sc.nextDouble());
                func.verificaSalario();
            }
            funcionarios.add(func);
            cont++;
        }while(cont<6);
        int resp;
        do{
            System.out.println("### Operações ###");
            System.out.println("(0) - Buscar funcionário por ID.");
            System.out.println("(1) - Filtrar por salário (min-max).");
            System.out.println("(2) - Listar top3 maiores salários.");
            System.out.println("(3) - Encerrar o programa.");
            resp = sc.nextInt();

            switch(resp){
                case 0:
                    System.out.println("Insira o ID do funcionário que deseja buscar:");
                    String id = sc.nextLine();
                    for(Funcionario a : funcionarios){
                        if(a.getId().equals(id)) System.out.println(a);
                        else System.out.println("ID não encontrado!");
                    }
                    break;
                case 1:
                    System.out.println("Insira o mínimo para a pesquisa (min):");
                    double min = sc.nextDouble();
                    System.out.println("Agora, insira o máximo para a pesquisa (max):");
                    double max = sc.nextDouble();
                    for(Funcionario a : funcionarios){
                        if(a.getSalario()>= min && a.getSalario()<= max) System.out.println(a);
                    }
                    break;
                case 2:
                    funcionarios.sort(Comparator.comparingDouble(Funcionario::getSalario).reversed());
                    System.out.println("### Top3 maiores salários ###");
                    for(int i = 0; i<3; i++) System.out.println(i+1+"º:"+funcionarios.get(i).getNome());
                    break;
                case 3:
                    System.out.println("\nTenha um bom dia!");
                    break;
                default:
                    break;
            }
        }while(resp!=3);
    }
}