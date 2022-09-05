import java.util.Scanner;
public class Atividade7 {
    


    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        double alt, lar, tinta;
        
        System.out.println("Informe a altura da parede a ser pintada: ");
        alt=ler.nextDouble();
        
        System.out.println("Informe a largura da parede a ser pintada: ");
        lar=ler.nextDouble();
        
        tinta=(lar*alt)/2;
        
        System.out.printf("Você precisará de %.1f litros de tinta para pintar a parede completa", tinta);
    }
}       

/* 
Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
 */