import java.util.Scanner;
public class Atividade10 {
    


    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        double kmPer, dias, total;
        
        System.out.print("Informe quantos KM foram percorridos pelo cliente: ");
        kmPer=ler.nextDouble();
        
        System.out.print("Informe quantos dias o cliente utilizou o carro: ");
        dias=ler.nextDouble();
        
        total= (kmPer*0.20) + (dias*90);
        
        System.out.printf("O total a ser pago pelo cliente é R$ %.2f", total);
    }
}

/*
A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
 */