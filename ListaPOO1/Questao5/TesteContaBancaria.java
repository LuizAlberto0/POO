package ListaPOO1.Questao5;

import java.util.*;

public class TesteContaBancaria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        String codigo;
        double valor;
        int opc, resp;

        do {
            ContaBancaria contaEncontrada = new ContaBancaria();
            System.out.println("\n### Banco ###");
            System.out.println("Insira um número referente a alguma opção:");
            System.out.println("(0) - Acessar alguma conta já existente.");
            System.out.println("(1) - Criar nova conta.");
            System.out.println("(2) - Exibir conta existente.");
            System.out.println("(3) - Encerrar programa.");
            opc = sc.nextInt();
            sc.nextLine();
            if(opc == 0){
                System.out.println("Insira o número da conta que desejas acessar:");
                codigo = sc.nextLine();
                for(ContaBancaria c : contas){
                    if(c.getNumero().equals(codigo)) {
                        contaEncontrada = c;
                    }
                }
                if(contaEncontrada.getNumero().isEmpty()) System.out.println("Conta não encontrada! Tente novamente.");
                else{
                    do{
                        contaEncontrada.telaConta();
                        resp = sc.nextInt();
                        switch(resp){
                            case 0:
                                System.out.println("Insira a quantia que desejas depositar (em R$):");
                                valor = sc.nextDouble();
                                contaEncontrada.deposito(valor);
                                break;
                            case 1:
                                System.out.println("Insira a quantia que desejas sacar (em R$):");
                                valor = sc.nextDouble();
                                if(contaEncontrada.saque(valor) == false){
                                    if(contaEncontrada.getSaldo()<=0) System.out.println("Saldo negativo!\n");
                                    else if(valor>contaEncontrada.getSaldo()) System.out.println("Saldo inválido!\n");
                                    else if(valor<0) System.out.println("Erro! Valor de saque menor que 0!");
                                }
                                break;
                            case 2:
                                System.out.println(contaEncontrada.exibirSaldo());
                                break;
                            default:
                                System.out.println("Tenha um bom dia!");
                                break;
                        }
                    }while(resp!=3);
                    sc.nextLine();
                }
            }
            if(opc == 1){
                ContaBancaria conta = new ContaBancaria();
                System.out.println("Insira o número que desejas para a conta:");
                conta.setNumero(sc.nextLine());

                System.out.println("Insira o nome do titular da conta:");
                conta.setTitular(sc.nextLine());

                System.out.println("Perfeito! Agora, para começar a sua conta, deposite um valor inicial (em R$):");
                valor = sc.nextDouble();
                while(valor<=0){
                    System.out.println("Valor inválido! Somente valores acima de 0!");
                    valor = sc.nextDouble();
                }
                conta.setSaldo(valor);
                System.out.println("Perfeito! Conta aberta com sucesso. Tenha um bom dia.");
                contas.add(conta);
            }
            if(opc == 2){
                System.out.println("Insira o código da conta que desejas imprimir:");
                codigo = sc.nextLine();
                for(ContaBancaria c : contas){
                    if(c.getNumero().equals(codigo)) System.out.println(c);
                }
            }
        }while (opc!=3);
        System.out.println("\nTenha um bom dia! Programa encerrado.");
    }
}
