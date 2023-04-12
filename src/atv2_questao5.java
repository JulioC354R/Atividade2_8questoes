/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv2_questao5
 * Descrição: 5. Faça um programa para imprimir o conceito de um aluno. O
conceito é calculado em função da nota do aluno que varia de 0
a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 100 Ótimo
 * Data: 09/04/2023
 */

import java.util.Scanner;

public class atv2_questao5 {
    public static void main(String[] args){
    
    System.out.println("Insira a nota conceito");
        Scanner entrada = new Scanner(System.in);
        int notaInserida = entrada.nextInt();
        entrada.close();

    if (notaInserida >= 0 && notaInserida < 50){
        System.out.println("Nota Conceito: Insuficiente");
    } else if (notaInserida >= 50 && notaInserida < 65){
        System.out.println("Nota Conceito: Regular");
    } else if(notaInserida >= 65 && notaInserida < 85){
        System.out.println("Nota Conceito: Bom");
    } else if(notaInserida >= 85 && notaInserida <= 100){
        System.out.println("Nota Conceito: Ótimo");
    } else if (notaInserida > 100){
        System.out.println("Insira um valor entre 0 e 100!");
    } else if (notaInserida < 0){
        System.out.println("Insira um valor entre 0 e 100!");
    } else {
        System.out.println("Não entendi! Tente novamente!");
    }


    }



}
