import java.util.Scanner;
public class Atividade8 {
    


    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        double A, B, C, Delta;
        
        System.out.println("Informe o A da sua equação: ");
        A=ler.nextDouble();
        
        System.out.println("Informe o B da sua equação: ");
        B=ler.nextDouble();
        
        System.out.println("Informe o C da sua equação: ");
        C=ler.nextDouble();
        
        Delta=(B*B)-4*A*C;
        
        System.out.printf("O delta da sua equação é %.1f", Delta);
    }
}

/*
Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
segundo grau e mostre o valor de Delta.
 */