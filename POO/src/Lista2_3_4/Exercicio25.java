package Lista2_3_4;

import java.util.*;

public class Exercicio25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantia de posições dos vetores (1 a 10): ");
        int N = sc.nextInt();
        while(N<=0||N>10){
            System.out.println(N+" é um número inválido. Insira um valor dentro das opções mencionadas anteriormente:");
            N = sc.nextInt();
        }

        float[] v1 = new float[N];
        float[] v2 = new float[N];
        char[] op = new char[N];
        double[] res = new double[N];

        for(int i = 0; i<N; i++){
            System.out.println("Insira um valor para o vetor 1: ");
            v1[i] = sc.nextFloat();
        }
        for(int i = 0; i<N; i++){
            System.out.println("Insira um valor para o vetor 2: ");
            v2[i] = sc.nextFloat();
        }
        for(int i = 0; i<N; i++){
            System.out.println("Insira o símbolo referente à operação que desejas: ");
            op[i] = sc.next().charAt(0);
        }
        for(int i = 0; i<N; i++){
            if(op[i] == '+') res[i] = v1[i]+v2[i];
            if(op[i] == '-') res[i] = v1[i]-v2[i];
            if(op[i] == '*') res[i] = v1[i]*v2[i];
            if(op[i] == '/') res[i] = v1[i]/v2[i];
        }
        System.out.print("v1[ ");
        for(float i : v1) System.out.print(i+" ");
        System.out.print("]\nv2[ ");
        for(float i : v2) System.out.print(i+" ");
        System.out.print("]\nop[ ");
        for(char i : op) System.out.print(i+" ");
        System.out.print("]\nres[ ");
        for(double i : res) System.out.print(i+" ");
        System.out.print("]");
    }
}
