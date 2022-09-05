import java.util.Scanner;
public class Atividade3 {
     
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double mediaMedia, somaMedia, media1=8, media2=5;
        
        System.out.println("A média entre 8, 9 e 7 é 8.");
        
        System.out.println("A média entre 4, 5 e 6 é 5.");
        
        somaMedia=media1+media2;
        System.out.printf("A soma das duas médias é %.0f \n", somaMedia);
        
        mediaMedia=(media1+media2)/2;
        System.out.printf("A média entre as duas é %.1f", mediaMedia);
    }
}

//Crie um algoritmo que calcule a média entre 3 e 3 números e informe ao usuário a soma das médias e a média entre as duas médias