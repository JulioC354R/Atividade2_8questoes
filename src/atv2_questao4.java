/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv2_questao3
 * Descrição: 4. Faça um programa que leia o nome, o sobrenome, a idade, em
anos, e a naturalidade (cidade de nascimento) de uma pessoa.
Depois, o programa deve dar a seguinte opção “Deseja
visualizar dados completos?”. Se o caractere digitado pelo
usuário for ‘S’ o programa deve imprimir na tela Nome,
Sobrenome, idade e naturalidade. Se o caractere digitado pelo
usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
o caractere não for nenhuma das outras opções acima o programa
deve imprimir “Digitação errada. Tente Novamente”.
 * Data: 06/04/2023
 */
import java.util.Scanner;

public class atv2_questao4 {
    public static void main(String[] args){

    Scanner teclado = new Scanner(System.in);

    System.out.println("Por favor insira seus dados abaixo:");

    System.out.println("Nome:");
    String nome = teclado.nextLine();

    System.out.println("Sobrenome:");
    String sobrenome = teclado.nextLine();

    System.out.println("Idade:");
    String idade = teclado.nextLine();

    System.out.println("Naturalidade (cidade de nascimento):");
    String naturalidade = teclado.nextLine();
    

    System.out.println("Deseja visualizar dados completos? (s/n)");
    String resposta = teclado.nextLine();
    teclado.close();
    if (resposta.equals("s")){
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Naturalidade: " + naturalidade);
    
    } else if(resposta.equals("n")){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    
    } else{
        System.out.println("Digitação errada. Tente Novamente.");

    }



    }

}
