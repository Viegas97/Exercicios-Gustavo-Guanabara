import java.util.Scanner;
public class Atv22condicionais {
    

    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        String nome; 
        double salario;
        int anos;
        
        System.out.print("Informe seu nome: ");
        nome=ler.nextLine();
        
        System.out.print("Informe seu salário atual: ");
        salario=ler.nextDouble();
        
        System.out.print("Informe há quantos anos você trabalha na empresa: ");
        anos=ler.nextInt();
        
        if (anos<3) {
            System.out.printf("Seu novo salário após o resjuste será de R$ %.2f",salario+(salario*0.03));
        
        } else if (anos>=3 && anos<10){
            System.out.printf("Seu novo salário após o reajuste será de R$ %.2f",salario+(salario*0.125));
        
        } else {
            System.out.printf("Seu novo  salário após o reajuste será de R$ %.2f",salario+(salario*0.20));
        }
    }
}


/*
Desenvolva um programa que leia o nome de um funcionário, seu salário,
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
acordo com a tabela a seguir:
 - Até 3 anos de empresa: aumento de 3%
 - entre 3 e 10 anos: aumento de 12.5%
 - 10 anos ou mais: aumento de 20%
 */