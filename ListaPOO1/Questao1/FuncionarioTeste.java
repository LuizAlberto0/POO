package ListaPOO1.Questao1;

import java.util.*;

public class FuncionarioTeste {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Funcionario func1 = new Funcionario();

        System.out.println("Insira o nome do funcionário:");
        func1.setNome(sc.nextLine());

        System.out.println("Agora, insira o valor referente à venda do funcionário: ");
        double venda = sc.nextDouble();

        System.out.println("Funcionário: "+func1.getNome()+"\t\t\tSalário: $"+func1.calcularSalario(venda));
    }
}
