import java.util.Scanner;
public class Atv21condicionais {
    

    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        double nota1, nota2;
        
        System.out.print("Informe sua primeira nota: ");
        nota1=ler.nextDouble();
        
        System.out.print("Informe sua segunda nota: ");
        nota2=ler.nextDouble();
        
        if ((nota1+nota2)/2<5) {
            System.out.printf("Sua nota foi %.2f e você foi reprovado.",(nota1+nota2)/2);
        } else if((nota1+nota2)/2>=5 && (nota1+nota2)/2<7) {
            System.out.printf("Sua nota foi %.2f e você está na recuperação.",(nota1+nota2)/2);
        } else {
            System.out.printf("Sua nota foi %.2f e você foi aprovado!",(nota1+nota2)/2);
        }
    }
}

/*
 Crie um programa que leia duas notas de um aluno e calcule a sua média,
mostrando uma mensagem no final, de acordo com a média atingida:
 - Média até 4.9: REPROVADO
 - Média entre 5.0 e 6.9: RECUPERAÇÃO
 - Média 7.0 ou superior: APROVADO
 */