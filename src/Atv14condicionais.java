import java.util.Scanner;
public class Atv14condicionais {
    


    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        int anoNasc, anoAtual;
        
        System.out.print("Informe sem que ano você nasceu: ");
        anoNasc=ler.nextInt();
        
        System.out.print("Informe o ano atual: ");
        anoAtual=ler.nextInt();
        
        if (anoAtual-anoNasc<16) {
            System.out.print("Você não pode votar.");
        } else {
            System.out.print("Você pode votar!");
        }
    }
}

/*
Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
dela e depois mostre se ela pode ou não votar.
 */