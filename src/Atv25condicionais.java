import java.util.Scanner;
public class Atv25condicionais {
    

    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        double valor, salario, valorParcelas;
        int anos;
        
        System.out.print("Informe o valor da casa: R$ ");
        valor=ler.nextDouble();
        
        System.out.print("Informe seu salário: R$ ");
        salario=ler.nextDouble();
        
        System.out.print("Informe em quantos anos a casa será paga: ");
        anos=ler.nextInt();

        valorParcelas=(valor/12)/anos;

        if (valorParcelas>salario*0.30) {
            System.out.print("Empréstimo negado!\n");
            
            System.out.printf("O valor das parcelas seria de R$ %.2f e isso excede 30%% do seu salário.",valorParcelas);
        
        } else {
            System.out.print("Empréstimo concedido!\n");
            
            System.out.printf("O valor das parcelas será de R$ %.2f.",valorParcelas);
        }
    }
}

/*
Escreva um programa para aprovar ou não o empréstimo bancário para a compra
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
ela não pode exceder 30% do salário ou então o empréstimo será negado.
 */
