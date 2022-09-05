import java.util.Scanner;
public class Atv20condicionais {
    

    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        double n1, n2;
        
        System.out.print("Informe um número: ");
        n1=ler.nextDouble();
        
        System.out.print("Informe outro número: ");
        n2=ler.nextDouble();
        
        if (n1>n2) {
            System.out.print("O primeiro valor é maior!");
        } else if (n2>n1) {
            System.out.print("O segundo valor é maior!");
        } else {
            System.out.print("Não existe valor maior, os dois são iguais!");
        }
    }
}

/*
Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
na tela uma das mensagens abaixo:
 - O primeiro valor é o maior
 - O segundo valor é o maior
 - Não existe valor maior, os dois são iguais
 */