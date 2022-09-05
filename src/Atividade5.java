import java.util.Scanner;
public class Atividade5 {
     
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int num1, ant, suc;
        
        System.out.println("Informe um número para saber seu antecessor e sucessor: ");
        num1=ler.nextInt();
        
        ant=num1-1;
        
        suc=num1+1;
        
        System.out.printf("O antecessor de %d é %d e seu sucessor é %d", num1, ant, suc);
    }    
}    

//Crie um algoritmo que leia um número e informe ao usuário seu antecessor e seu sucessor