/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv2_questao1 
 * Descrição: 1. Faça um programa que leia dois números A e B e imprima o maior deles.
 * Data: 06/04/2023
 */
import java.util.Scanner;

public class atv2_questao1 {

    public static void main(String[] args){

    System.out.println("Insira o primeiro número:");

    Scanner teclado = new Scanner(System.in);
        int numberA = teclado.nextInt();
    
    System.out.println("Insira o segundo número:");
    int numberB = teclado.nextInt();
        teclado.close();
        
    if (numberA > numberB) {

        System.out.println("O número " + numberA + " é o maior.");
    }

         else {
           System.out.println("O número " + numberB + " é o maior.");
        }


    }
    
}
