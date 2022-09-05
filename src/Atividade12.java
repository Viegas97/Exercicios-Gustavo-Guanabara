import java.util.Scanner;
public class Atividade12 {
    


    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        int cigarrosDia, anosFumando, cigarrosAno, diasPerdidos;
        
        System.out.print("Informe quantos cigarros você fuma por dia: ");
        cigarrosDia=ler.nextInt();
        
        System.out.print("Informe há quantos anos você fuma: ");
        anosFumando=ler.nextInt();
        
        cigarrosAno=cigarrosDia*365;
        
        diasPerdidos= cigarrosAno*anosFumando*10;
        
        System.out.printf("Você teve seu tempo de vida reduzido em %d minutos.", diasPerdidos);
    }
}

/*
Escreva um programa para calcular a redução do tempo de vida de um
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias.
 */