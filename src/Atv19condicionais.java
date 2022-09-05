import java.util.Scanner;
public class Atv19condicionais {
    

    public static void main(String[] args) throws Exception {
        Scanner ler= new Scanner(System.in);
        double n1, n2, n3;
        
        System.out.print("Informe o tamanho do primeiro segmento de reta: ");
        n1=ler.nextDouble();
        
        System.out.print("Informe o tamanho do segundo segmento de reta: ");
        n2=ler.nextDouble();
        
        System.out.print("Informe o tamanho do terceiro segmento de reta: ");
        n3=ler.nextDouble();
        
        if (n1<n2+n3 && n2<n1+n3 && n3<n1+n2){ 
            System.out.print("As 3 retas podem formar um triângulo.");
        } else {
            System.out.print("As 3 retas não podem formar um triângulo.");
        }        
    }
}

/*
 Crie um programa que leia o tamanho de três segmentos de reta.
Analise seus comprimentos e diga se é possível formar um triângulo com essas
retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
de cada lado deve ser menor que a soma dos outros dois.
 */
