import java.util.Scanner;
public class Atv17condicionais {
    


    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        int idade, anoFalta, anoPassou;
        
        System.out.print("Informe sua idade para saber sua situação quanto ao alistamento militar: ");
        idade=ler.nextInt();
        
        anoFalta=18-idade;
        
        anoPassou=idade-18;
        
        if (anoFalta>0) {
            System.out.printf("Faltam %d anos para você se alistar!",anoFalta);
        } else if (idade-18==0){
            System.out.printf("Você está na idade de se alistar!");
        } else {
            System.out.printf("Já se passaram %d anos da sua data de alistamento!",anoPassou);
        }        
    }
}

/*
Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.
 */