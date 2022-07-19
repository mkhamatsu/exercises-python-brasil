package exerciciosPythonBrasil.estruturaDeRepeticao;

import java.util.Scanner;

/* 
Faça um programa que peça uma nota, entre zero e dez. 
Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
*/

public class EstruturaRepeticaoExercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int note;
		
// Resolução com DO WHILE
		
		do {
			System.out.println("Digite uma nota entre 0 e 10: ");
			note = scan.nextInt();
			if (note < 0 || note > 10) {
				System.out.println("A nota digitada " + note + " é invalida.");
			}
		} while (note < 0 || note > 10);
		System.out.println("A nota digitada foi " + note + ".");

// Resolução com WHILE		
/*		
 		System.out.println("Digite uma nota entre 0 e 10: ");
		note = scan.nextInt();
		while (note < 0 || note > 10) {
			System.out.println("A nota digitada " + note + " é invalida.\nDigite uma nota entre 0 e 10.");
			note = scan.nextInt();
		}
		System.out.println("A nota digitada foi " + note + ".");
*/
		scan.close();
	}
}
