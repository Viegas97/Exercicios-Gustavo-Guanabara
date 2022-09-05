import java.util.Scanner;
public class Atividade4 {
     
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double salarioMin=788, salarioUsuario, salariosTotal; 
        
        System.out.println("Informe seu salário: ");
        salarioUsuario=ler.nextDouble();
        
        salariosTotal=salarioUsuario/salarioMin;
        
        System.out.printf("Você recebe o equivalente a %.1f salários minimos.", salariosTotal);
    }
}

/*
Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)
*/
