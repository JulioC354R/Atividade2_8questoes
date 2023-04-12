/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv2_questao2 
 * Descrição: 2. Construa um programa que receba como entrada três valores A, B
 * e C e os imprima em ordem crescente.
 * Data: 04/04/2023
 */

import java.util.Scanner;

public class atv2_questao2 {
    public static void main(String[] args){
        System.out.println("Insira três números");
        
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        teclado.close();

        System.out.println("Aqui estão os números em ordem crescente:");

        if (A > B && A > C && B > C){
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);

        }

        if (A > B && A > C && C > B){
            System.out.println(A);
            System.out.println(C);
            System.out.println(B);

        }

        if (B > A && B > C && A > C){
            System.out.println(B);
            System.out.println(A);
            System.out.println(C);

        }

        if (B > A && B > C && C > A){
            System.out.println(B);
            System.out.println(C);
            System.out.println(A);
        }

         if (C > A && C > B && B > A){
            System.out.println(C);
            System.out.println(B);
            System.out.println(A);
         }

            if (C > A && C > B && A > B){
            System.out.println(C);
            System.out.println(A);
            System.out.println(B);
    
            }           
        }    
    }



