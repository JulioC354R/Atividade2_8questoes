/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv2_questao7 
 * Descrição: 7. Crie um programa que lê um número entre 1 e 12, correspondendo
a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
Ao final, o programa deve imprimir uma mensagem identificando,
com base no número digitado, o nome do mês e a estação.
 * Data: 09/04/2023
 */

import java.util.Scanner;
 public class atv2_questao7 {
    public static void main(String[] args) throws Exception {
        System.out.println("Insira o número do mês:");
        Scanner teclado = new Scanner(System.in);
        int número = teclado.nextInt();
        teclado.close();

        switch (número) { 
            case 1:
            System.out.println("Mês: Janeiro");
            System.out.println("Estação: Verão");
            break;
            case 2:
            System.out.println("Mês: Fevereiro");
            System.out.println("Estação: Verão");
            break;
            case 3:
            System.out.println("Mês: Março");
            System.out.println("Estação: Outono");
            break;
            case 4:
            System.out.println("Mês: Abril");
            System.out.println("Estação: Outono");
            break;
            case 5:
            System.out.println("Mês: Maio");
            System.out.println("Estação: Outono");
            break;
            case 6:
            System.out.println("Mês: Junho");
            System.out.println("Estação: Inverno");
            break;
            case 7:
            System.out.println("Mês: Julho");
            System.out.println("Estação:Inverno");
            break;
            case 8:
            System.out.println("Mês: Agosto");
            System.out.println("Estação: Inverno");
            break;
            case 9:
            System.out.println("Mês: Setembro");
            System.out.println("Estação: Primavera");
            break;
            case 10:
            System.out.println("Mês: Outubro");
            System.out.println("Estação: Primavera");
            break;
            case 11:
            System.out.println("Mês: Novembro");
            System.out.println("Estação: Primavera");
            break;
            case 12:
            System.out.println("Mês: Dezembro");
            System.out.println("Estação: Verão");
            break;
            default: 
            System.out.println("Insira um número entre 1 e 12");
            

        }
    }
}


