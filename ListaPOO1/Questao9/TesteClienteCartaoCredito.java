package ListaPOO1.Questao9;

import java.util.*;

public class TesteClienteCartaoCredito {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();

        System.out.println("### Criando Clientes ###");
        int cont = 0;
        do{
            Cliente c = new Cliente();
            CartaoCredito card = new CartaoCredito();
            System.out.println("Vamos começar com o nome do cliente. Insira o nome:");
            c.setNome(sc.nextLine());
            System.out.println("Perfeito, agora vamos para as definições do cartão de crédito. Insira o limite:");
            card.setLimite(sc.nextDouble());

            c.setCartao(card);
            clientes.add(c);
            cont++;
            sc.nextLine();
        }while(cont!=4);
        int resp, index=0;
        double valor;
        do{
            System.out.println("\n### OPERAÇÕES ###");
            System.out.println("(0) - Acessar conta específica.");
            System.out.println("(1) - Listar clientes com limite disponível menor que X (valor inserido).");
            System.out.println("(2) - Exibir cliente com a maior fatura atual.");
            System.out.println("(3) - Encerrar Programa.");
            resp = sc.nextInt();
            sc.nextLine();
            switch(resp){
                case 0:
                    System.out.println("### Lista de Clientes ###");
                    for(int i = 1; i <= clientes.size(); i++) System.out.println(i+"º - "+clientes.get(i-1).listarClientes());
                    System.out.println("Insira o número referente ao cliente que deseja acessar:");
                    int opc = sc.nextInt();
                    sc.nextLine();
                    do{
                        System.out.println("\n### Conta de ID "+clientes.get(opc-1).getId()+" ###");
                        System.out.println("Titular: "+clientes.get(opc-1).getNome());
                        System.out.println("(0) - Comprar algo.");
                        System.out.println("(1) - Ver limite disponível.");
                        System.out.println("(2) - Ver fatura.");
                        System.out.println("(3) - Pagar fatura.");
                        System.out.println("(4) - Sair da conta.");
                        resp = sc.nextInt();
                        sc.nextLine();
                        switch(resp){
                            case 0:
                                System.out.println("Insira o valor do que comprará (em R$):");
                                valor = sc.nextDouble();
                                if(!clientes.get(opc - 1).getCartao().comprar(valor)) System.out.println("Compra falhou!");
                                else System.out.println("Compra efetuada com sucesso!");
                                break;
                            case 1:
                                System.out.println("Limite disponível: R$"+clientes.get(opc).getCartao().getFatura());
                                break;
                            case 2:
                                System.out.println("Fatura atual: R$"+clientes.get(opc).getCartao().getFatura());
                                break;
                            case 3:
                                System.out.println("Insira o valor que deseja pagar da fatura (em R$):");
                                valor = sc.nextDouble();
                                if(!clientes.get(opc).getCartao().pagar(valor)) System.out.println("Pagamento falhou!");
                                else System.out.println("Pagamento realizado com sucesso!");
                                break;
                            case 4:
                                System.out.println("Retornando à tela inicial.");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                    }while(resp!=4);
                case 1:
                    int amount = 0;
                    System.out.println("Insira o valor que deseja utilizar para a pesquisa (em R$):");
                    valor = sc.nextDouble();
                    while(valor<0){
                        System.out.println("Valor inválido! Somente valores acima de 0!");
                        valor = sc.nextDouble();
                    }
                    for(Cliente c : clientes){
                        if(c.getCartao().disponivel()<valor) amount++;
                    }
                    if(amount == 0) System.out.println("Não há clientes com limite disponível dentro do intervalo inserido!");
                    else{
                        System.out.println("Clientes com limite abaixo de R$"+valor+":");
                        for(Cliente c : clientes){
                            if(c.getCartao().disponivel()<valor) System.out.println(clientes.indexOf(c)+1+"º - "+c);
                        }
                    }
                    break;
                case 2:
                    double maiorFatura = clientes.getFirst().getCartao().getFatura();
                    for(Cliente c : clientes){
                        if(maiorFatura < c.getCartao().getFatura()){
                            maiorFatura = c.getCartao().getFatura();
                            index = clientes.indexOf(c);
                        }
                    }
                    System.out.println("Cliente com maior fatura:\n"+clientes.get(index).toString());
                    break;
                case 3:
                    System.out.println("Encerrando programa. Tenha um bom dia!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(resp!=3);
    }
}
