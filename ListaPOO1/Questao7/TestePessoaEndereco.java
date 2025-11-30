package ListaPOO1.Questao7;

import java.util.*;

public class TestePessoaEndereco {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        int cont=0;
        do{
            Pessoa p = new Pessoa();
            Endereco e = new Endereco();
            System.out.println("Insira o nome da pessoa:");
            p.setNome(sc.nextLine());
            System.out.println("Agora, insira o cpf:");
            p.setCpf(sc.nextLine());

            System.out.println("Dados inseridos. Agora insira as informações do endereço.");
            System.out.println("Uf:");
            e.setUf(sc.nextLine());
            System.out.println("Cidade:");
            e.setCidade(sc.nextLine());
            System.out.println("Rua:");
            e.setRua(sc.nextLine());
            System.out.println("Número:");
            e.setNumero(sc.nextLine());

            p.setEndereco(e);
            pessoas.add(p);

            cont++;
        }while(cont<5);
        int resp;
        do {
            System.out.println("### OPERAÇÕES ###");
            System.out.println("(0) - Listar pessoas.");
            System.out.println("(1) - Filtrar pessoas por cidade.");
            System.out.println("(2) - Filtrar pessoas por UF.");
            System.out.println("(3) - Trocar endereço de uma pessoa e imprimir.");
            System.out.println("(4) - Encerrar programa.");
            resp = sc.nextInt();
            sc.nextLine();
            switch(resp){
                case 0:
                    System.out.println("### Lista de Pessoas ###");
                    for(Pessoa p : pessoas) System.out.println(p);
                    break;
                case 1:
                    System.out.println("Insira a cidade que deseja filtrar:");
                    String cidade = sc.nextLine();
                    for(Pessoa p : pessoas){
                        if(p.getEndereco().getCidade().equals(cidade)) System.out.println(p);
                    }
                    break;
                case 2:
                    System.out.println("Insira a UF que deseja filtrar:");
                    String uf = sc.nextLine();
                    for(Pessoa p : pessoas){
                        if(p.getEndereco().getUf().equals(uf)) System.out.println(p);
                    }
                    break;
                case 3:
                    Endereco e = new Endereco();
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println((i + 1) + " - " +pessoas.get(i).getNome());
                    }
                    System.out.println("Insira o número referente à pessoa que deseja trocar o endereço:");
                    int num = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Insira o endereço.");
                    System.out.println("UF:");
                    e.setUf(sc.nextLine());
                    System.out.println("Cidade:");
                    e.setCidade(sc.nextLine());
                    System.out.println("Rua:");
                    e.setRua(sc.nextLine());
                    System.out.println("Número:");
                    e.setNumero(sc.nextLine());

                    pessoas.get(num-1).setEndereco(e);
                    break;
                case 4:
                    System.out.println("Encerrando. Tenha um bom dia!");
                    break;
            }
        }while(resp!=4);
    }
}
