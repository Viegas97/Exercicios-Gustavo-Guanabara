import java.util.Scanner;
public class Atv13condicionais {
    


    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        double vel, multa;
        
        System.out.print("Informe a velocidade em que o veículo se encontrava: ");
        vel=ler.nextInt();
        
        multa= (vel-80) * 5;
        
        if (multa>0) {
            System.out.printf("Você foi multado. O valor a ser pago é de R$ %.2f", multa);
        } else {
            System.out.print("Você estava dentro da velocidade permitida, não há multa.");
        }
    }
}

/*
Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
 */