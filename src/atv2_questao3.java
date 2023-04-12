/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv2_questao3
 * Descrição: 3. Faça um programa que leia um número inteiro e mostre uma
mensagem indicando se este número é par ou ímpar e se é
positivo ou negativo.
 * Data: 04/04/2023
 */
import java.util.Scanner;

public class atv2_questao3 {
    public static void main(String [] args) {
        System.out.println("Insira um número inteiro:");

        Scanner teclado = new Scanner(System.in);
        int number = teclado.nextInt();
        teclado.close();

        if (number %2 == 0){
            System.out.println("O número " + number + " é Par");
        } else {
            System.out.println("O número " + number + " é Impar");

        }

        if (number > 0){
            System.out.println("O número " + number + " é Positivo");
        } else {
            System.out.println("O número " + number + " é Negativo");

        }
        


    }


}
