import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Atv24condicionais {
    

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
            System.out.println("As 3 retas podem formar um triângulo.");
        } else {
            System.out.println("As 3 retas não podem formar um triângulo.");
        }
        
        if (n1==n2 && n2==n3) {
            System.out.print("Este triângulo é um triângulo equilátero!");
        } else if (n1==n2 || n1==n3 || n2==n3) {
            System.out.print("Este triângulo é um triângulo isósceles!");
        } else {
            System.out.print("Este triângulo é um triângulo escaleno!");
        }
    }
}


/*
Refaça o algoritmo 19, acrescentando o recurso de mostrar que tipo
de triângulo será formado:
 - EQUILÁTERO: todos os lados iguais
 - ISÓSCELES: dois lados iguais
 - ESCALENO: todos os lados diferentes
 */
