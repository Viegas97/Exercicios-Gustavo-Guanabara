import java.util.Scanner;
public class Atv15condicionais {
    


    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        int n1;
        
        System.out.print("Informe um número para saber se ele é par ou ímpar: ");
        n1=ler.nextInt();
        
        if (n1%2>0) {
            System.out.print("Seu número é ímpar!");
        } else {
            System.out.print("Seu número é par!");
        }
    }
}

/*
Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR.
 */