package Lista2_3_4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int Matricula;
        double QHoras, SalMinimo = 788, ValorHoraExtra = 10, SalHoraExtra, SalBruto, SalLiquido, DescontoInss = 0, DescontoImpostoDeRenda = 0;

        System.out.println("Insira a matrícula do funcionário: ");
        Matricula = sc.nextInt();
        System.out.println("Agora, insira a quantia de horas extras trabalhadas pelo funcionário: ");
        QHoras = sc.nextDouble();
        while(QHoras<0){
            System.out.println("Quantia de horas extras inválida! Tente novamente: ");
            QHoras = sc.nextDouble();
        }
        SalHoraExtra = QHoras*ValorHoraExtra;
        SalBruto = 3*SalMinimo+SalHoraExtra;
        if(SalBruto>1500) DescontoInss = SalBruto*0.12;
        if(SalBruto>2000) DescontoImpostoDeRenda = SalBruto*0.2;
        SalLiquido = SalBruto - (DescontoInss+DescontoImpostoDeRenda);

        System.out.println("ID funcionário: "+Matricula);
        System.out.println("Salário bruto: R$"+SalBruto);
        System.out.println("Salário líquido: R$"+SalLiquido);
    }
}
