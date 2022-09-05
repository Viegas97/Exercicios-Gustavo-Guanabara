import java.util.Scanner;
public class Atv23condicionais {
    

    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        double larg, comp, area;
        
        System.out.print("Informe a largura do terreno: ");
        larg=ler.nextDouble();
        
        System.out.print("Informe o comprimento do terreno: ");
        comp=ler.nextDouble();
        
        area=larg*comp;
        
        if (area<100) {
            System.out.print("Este terreno é classificado como Terreno Popular.");
        } else if (area>=100 && area<500) {
            System.out.print("Este terreno é classificado como Terreno Master.");
        } else {
            System.out.print("Este terreno é classificado como Terreno VIP.");
        }
    }
}

/*
Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
devemostrar a classificação desse terreno, de acordo com a lista abaixo:
 - Abaixo de 100m² = TERRENO POPULAR
 - Entre 100m² e 500m² = TERRENO MASTER
 - Acima de 500m² = TERRENO VIP
 */
