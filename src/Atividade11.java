import java.util.Scanner;
public class Atividade11 {
    


    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        double dias, salario;
        
        System.out.print("Informe quantos dias foram trabalhados pelo funcionário no mês: ");
        dias=ler.nextDouble();
        
        salario=dias*8*25;
        
        System.out.printf("O salário do funcionário será de R$ %.2f", salario);
    }
}

/*
 Crie um programa que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
por hora trabalhada.
 */
