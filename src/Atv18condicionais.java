import java.util.Scanner;
public class Atv18condicionais {
    


    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        String nome;
        char sexo;
        double valor;
        
        System.out.print("Informe seu nome: ");
        nome=ler.nextLine();
        
        System.out.print("Informe seu sexo (M/F): ");
        sexo=ler.next().charAt(0);
        
        System.out.printf("Informe o valor das suas compras em nossa loja: R$ ");
        valor=ler.nextDouble();
        
        if ((sexo=='M') || (sexo=='m')) {
            System.out.printf("Você pagará R$ %.2f",valor - (valor*0.05));
        } else if ((sexo=='F') || (sexo=='f')){
            System.out.printf("Você pagará R$ %.2f",valor - (valor*0.13));
        }
          else {
            System.out.print("Insira seu sexo corretamente para que o devido desconto seja aplicado!");
        }    
    }
}


/*
Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
para todos, mas especialmente para mulheres. Faça um programa que leia nome,
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
que:
 - Homens ganham 5% de desconto
 - Mulheres ganham 13% de desconto
 */



