
/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv2_questao6 
 * Descrição: 6. Faça um programa calcula o total de uma hospedagem em um
hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15.
 * Data: 09/04/2023
 */
import java.util.Scanner;

 public class atv2_questao6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Insira os dias de hospedagem:");
        Scanner teclado = new Scanner(System.in);
        int diaria = teclado.nextInt();
        teclado.close();
        double valorDiaria = diaria * 60;
        double taxaDeServico = 5.5;
    if (diaria > 15) {
        taxaDeServico = 5.5;
    } else if (diaria == 15){
        taxaDeServico = 6;
    } else if (diaria < 15){
        taxaDeServico = 8;
    }
    double valorServico = taxaDeServico * diaria;
    double valorTotal = valorDiaria + valorServico;
    
    System.out.printf("Valor da diária:          " + "R$ %.2f" , valorDiaria);
    System.out.println();
    System.out.printf("Valor da Taxa de Serviço: " + "R$ %.2f" , valorServico);
    System.out.println();
    System.out.printf("Valor Total:              " + "R$ %.2f" , valorTotal);


    }
}


