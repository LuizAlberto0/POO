package ListaPOO3.Questao6;

import java.util.*;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        int opc;
        do{
            System.out.println("### TABELA DE PAGAMENTOS ###");
            System.out.println("(1) - Pagar Cartão de Crédito.");
            System.out.println("(2) - Pagar Boleto.");
            System.out.println("(3) - Listar pagamentos feitos.");
            System.out.println("(4) - Encerrar programa.");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc){
                case 1:
                    PagamentoCartaoCredito cartao = new PagamentoCartaoCredito();
                    System.out.println("Insira o valor, em reais, que desejas pagar do cartão de crédito:");
                    double card = sc.nextDouble();
                    while(card<=0){
                        System.out.println("Valor inválido! Tente novamente.");
                        card = sc.nextDouble();
                    }
                    cartao.processar(card);
                    pagamentos.add(cartao);
                    System.out.println("Pagamento realizado!");
                    break;
                case 2:
                    PagamentoBoleto boleto = new PagamentoBoleto();
                    System.out.println("Insira o valor, em reais, que desejas gerar um boleto de:");
                    double bolet = sc.nextDouble();
                    while(bolet<=0){
                        System.out.println("Valor inválido! Tente novamente.");
                        bolet = sc.nextDouble();
                    }
                    boleto.processar(bolet);
                    pagamentos.add(boleto);
                    System.out.println("Boleto gerado!");
                    break;
                case 3:
                    System.out.println("### LISTA DE PAGAMENTOS ###");
                    for(Pagamento a : pagamentos) System.out.println(pagamentos.indexOf(a)+" - "+a.getClass().getSimpleName());
                    break;
                case 4:
                    System.out.println("Encerrando programiu.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }while(opc!=4);
    }
}
