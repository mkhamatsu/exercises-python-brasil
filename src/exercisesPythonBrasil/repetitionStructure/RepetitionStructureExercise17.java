package exercisesPythonBrasil.repetitionStructure;

import java.util.Scanner;

/*
 Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. 
 Ex.: 5!=5.4.3.2.1=120
*/

public class RepetitionStructureExercise17 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Type a number: ");
		int number = scan.nextInt();

		int fatorial = number;

		while (number > 1) {
			fatorial = fatorial * (number - 1);
			number--;
		}

		System.out.println(fatorial);

		scan.close();

	}
}
