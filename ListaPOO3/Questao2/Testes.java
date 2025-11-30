package ListaPOO3.Questao2;

import java.util.*;

public class Testes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente();

        System.out.println("Insira os dados do cliente.\nInsira o nome:");
        cliente.setNome(sc.nextLine());
        System.out.println("Insira o sexo:");
        cliente.setSexo(sc.nextLine());
        System.out.println("Insira a idade:");
        cliente.setIdade(sc.nextInt());
        System.out.println("Ano do nascimento:");
        cliente.setAnoNascim(sc.nextInt());
        System.out.println("Valor da dívida(em R$):");
        cliente.setValorDivida(sc.nextDouble());
        sc.nextLine();

        Gerente gerente = new Gerente();

        System.out.println("\nAgora, insira os dados do gerente.\nInsira o nome:");
        gerente.setNome(sc.nextLine());
        System.out.println("Insira a idade:");
        gerente.setIdade(sc.nextInt());
        System.out.println("Insira a matrícula:");
        gerente.setMatricula(sc.nextLine());
        sc.nextLine();
        System.out.println("Insira o nome da gerencia:");
        gerente.setNomeGerente(sc.nextLine());
        System.out.println("Insira o salário(em R$):");
        gerente.setSalario(sc.nextDouble());
        sc.nextLine();

        Vendedor vendedor = new Vendedor();

        System.out.println("\nPor fim, insira os dados do vendedor.\nInsira o nome:");
        vendedor.setNome(sc.nextLine());
        System.out.println("Insira o salário(em R$):");
        vendedor.setSalario(sc.nextDouble());
        System.out.println("Insira o valor de vendas(em R$):");
        vendedor.setValorVendas(sc.nextDouble());
        System.out.println("Para finalizar, insira a quantia de vendas:");
        vendedor.setQtdVendas(sc.nextInt());

        System.out.println("### INFORMAÇÕES COLETADAS ###");
        System.out.println(cliente);
        System.out.println("\n"+gerente);
        System.out.println("\n"+vendedor);
    }
}
