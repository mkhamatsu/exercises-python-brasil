package exercisesPythonBrasil.repetitionStructure;

import java.util.ArrayList;
import java.util.List;

/*
 Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
*/

public class RepetitionStructureExercise09 {

	public static void main(String[] args) {

		List<Integer> oddNumbers = new ArrayList<>();

		int min = 1;
		int max = 50;

		for (int number = min; number <= max; number++) {
			if (number % 2 != 0) {
				oddNumbers.add(number);
			}
		}

		System.out.println("The odd numbers between 1 and 50 are: " + oddNumbers);

	}
}
