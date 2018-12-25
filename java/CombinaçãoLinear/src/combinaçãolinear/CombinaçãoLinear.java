package combinaçãolinear;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class CombinaçãoLinear {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int v1[] = new int[3]; //Primeiro vetor (v1) 
        int v2[] = new int[3]; //Segundo vetor (v2)
        int W[] = new int[3];  //Vetor Resultante
        int a, b; //Coeficientes;
        int resA[] = new int[3]; //Recebe o resultado da conta entre o coeficiente e cada respectiva posição do vetor<a.v1>
        int resB[] = new int[3]; //Recebe o resultado da conta entre o coeficiente e cada respectiva posição do vetor<b.v2>
        int comb[] = new int[3]; //Armazena o a soma dos vetores de mesma posição( resA[] + resB[] )
        
        System.out.println("Digite o vetor resultante: ");
        for(int i=0; i<3; i++){ //preenchendo vetor w(x,x,x)
            W[i] = in.nextInt();
        }
        System.out.println("Entre com os valores do vetor v1:");
        for(int i=0; i<3; i++){ //preenchendo v1(x,x,x)
            v1[i] = in.nextInt();
        }
        System.out.println("Entre com os valores do vetor v2:");
        for(int i=0; i<3; i++){ //preenchendo v2(x,x,x)
            v2[i] = in.nextInt();
        }
        System.out.println("Digite o valor do primeiro coeficiente <a>: ");
        a = in.nextInt();
        System.out.println("Digite o valor do segundo coeficiente <b>: ");
        b = in.nextInt();
        
        System.out.println("\nW = a.v1 + b.v2");
        System.out.println("("+W[0]+","+W[1]+","+W[2]+")" + " = " + a + "." + "("+v1[0]+","+v1[1]+","+v1[2]+")" + " + " +
                           b + "." + "("+v2[0]+","+v2[1]+","+v2[2]+")");
        
    }
    
}
