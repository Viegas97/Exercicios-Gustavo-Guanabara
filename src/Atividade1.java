import java.util.Scanner;
public class Atividade1 {
     
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double n1,n2,n3;
        
        System.out.println("Digite 3 números: ");
        n1=ler.nextDouble();
        n2=ler.nextDouble();
        n3=ler.nextDouble();
        
        System.out.printf("A média entre os 3 números é: %.1f",(n1+n2+n3)/3);
    }
}

//Crie um algoritmo que leia 3 números e imprima a média entre eles