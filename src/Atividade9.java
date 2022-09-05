import java.util.Scanner;
public class Atividade9 {
    


    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        double preco, precoDesc;
        
        System.out.print("Informe o preço do produto: R$ ");
        preco=ler.nextDouble();
        
        precoDesc=preco-(preco*0.05);
        
        System.out.printf("O preço do produto com o desconto promocional é de R$ %.2f ", precoDesc);
    }
}

/*
Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto.
 */
