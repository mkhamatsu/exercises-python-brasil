package exercisesPythonBrasil.repetitionStructure;

import java.util.Scanner;

/* 
 Faça um programa que peça uma nota, entre zero e dez. 
 Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
*/

public class RepetitionStructureExercise01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int note;

// Resolução com Do While
		do {
			System.out.println("Type a note between 0 and 10: ");
			note = scan.nextInt();
			if (note < 0 || note > 10) {
				System.out.println("This note " + note + " is invalid.");
			}
		} while (note < 0 || note > 10);
		System.out.println("This note was " + note + ".");

// Resolução com While
//		System.out.println("Type a note between 0 and 10: ");
//		note = scan.nextInt();
//		
//		while (note < 0 || note > 10) {
//			System.out.println("This note " + note + " is invalid.\nType a note between 0 and 10: ");
//			note = scan.nextInt();
//		}
//		System.out.println("This note was " + note + ".");

		scan.close();

	}
}
