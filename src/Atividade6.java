import java.util.Scanner;
public class Atividade6 {
    

    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        double reais, dolares;
        
        System.out.println("Informe quantos reais você tem: ");
        reais=ler.nextDouble();
        
        dolares= reais / 3.45;
        
        System.out.printf("Com R$ %.2f você poderá comprar U$ %.2f",reais, dolares);
    }
}

/*
Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
*/
