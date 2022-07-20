package exercisesPythonBrasil.repetitionStructure;

import java.util.Scanner;

/*
 Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. 
 O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
 Tabuada de 5:
 5 X 1 = 5
 5 X 2 = 10
 ...
 5 X 10 = 50
*/

class RepetitionStructureExercise12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number;
		int result;

		System.out.println("Type a number: ");
		number = scan.nextInt();

		for (int i = 1; i <= 10; i++) {
			result = number * i;
			System.out.println(number + " X " + i + " = " + result);
		}

		scan.close();

	}
}
