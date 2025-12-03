package ProvaN2.Questao2;

import java.util.*;

public class Teste {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        double valor;
        int resp, opc;
        do{
            System.out.println("### OPERAÇÕES COM AS CONTAS ###");
            System.out.println("(1) - Conta Corrente.");
            System.out.println("(2) - Conta Poupança.");
            System.out.println("(3) - Finalizar.");
            resp = sc.nextInt();
            sc.nextLine();
            switch (resp){
                case 1:
                    do {
                        System.out.println("### CONTA CORRENTE ###");
                        System.out.println("(1) - Mostrar saldo.");
                        System.out.println("(2) - Fazer um saque.");
                        System.out.println("(3) - Fazer um depósito.");
                        System.out.println("(4) - Voltar à tela anterior.");
                        opc = sc.nextInt();
                        sc.nextLine();
                        switch (opc) {
                            case 1:
                                System.out.println("SALDO: R$"+contaCorrente.getSaldo());
                                break;
                            case 2:
                                System.out.println("Insira o valor que desejas sacar(em R$):");
                                valor = sc.nextDouble();
                                contaCorrente.sacar(valor);
                                break;
                            case 3:
                                System.out.println("Insira o valor que desejas depositar(em R$):");
                                valor = sc.nextDouble();
                                contaCorrente.depositar(valor);
                                break;
                            case 4:
                                System.out.println("Voltando à tela anterior...");
                                break;
                            default:
                                System.out.println("Opção inválida! Tente novamente!");
                                break;
                        }
                    }while (opc!=4);
                    break;
                case 2:
                    do{
                        System.out.println("### CONTA POUPANÇA ###");
                        System.out.println("(1) - Mostrar saldo.");
                        System.out.println("(2) - Fazer um saque.");
                        System.out.println("(3) - Fazer um depósito.");
                        System.out.println("(4) - Voltar à tela anterior.");
                        opc = sc.nextInt();
                        sc.nextLine();
                        switch (opc) {
                            case 1:
                                System.out.println("SALDO: R$"+contaPoupanca.getSaldo());
                                break;
                            case 2:
                                System.out.println("Insira o valor que desejas sacar(em R$):");
                                valor = sc.nextDouble();
                                contaPoupanca.sacar(valor);
                                break;
                            case 3:
                                System.out.println("Insira o valor que desejas depositar(em R$):");
                                valor = sc.nextDouble();
                                contaPoupanca.depositar(valor);
                                break;
                            case 4:
                                System.out.println("Voltando à tela anterior...");
                                break;
                            default:
                                System.out.println("Opção inválida! Tente novamente!");
                                break;
                        }
                    }while (opc!=4);
                    break;
                case 3:
                    System.out.println("Finalizando programa.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente!");
                    break;
            }
        }while(resp!=3);
    }
}
