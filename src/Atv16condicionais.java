import java.util.Scanner;
public class Atv16condicionais {
    


    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        int ano;
        
        System.out.print("Informe um ano para saber se ele é bissexto: ");
        ano=ler.nextInt();
        
        if (ano%4==0) {
            System.out.printf("O ano %d é bissexto!",ano);
        } else {
            System.out.printf("O ano %d não é bissexto.",ano);
        }
    }
}

/*
Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
BISSEXTO.
 */