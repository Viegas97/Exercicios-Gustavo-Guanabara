import java.util.Scanner;
public class Atividade2 {
     
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int idade, meses, dias;
        
        System.out.println("Informe sua idade: ");
        idade=ler.nextInt();
        
        System.out.println("Fora sua idade em anos, informe os meses: ");
        meses=ler.nextInt();
        
        System.out.println("Fora sua idade em anos e o meses, informe os dias: ");
        dias=ler.nextInt();
        
        System.out.printf("O total de dias que você viveu foi de %d", (idade*365+meses*30+dias));
    }
}

//Crie um algoritmo que leia a idade do usuário em anos, meses e dias, e a informe em dias totais