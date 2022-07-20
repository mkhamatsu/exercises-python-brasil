package exercisesPythonBrasil.repetitionStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que receba dois números inteiros 
e gere os números inteiros que estão no intervalo compreendido por eles
*/

public class RepetitionStructureExercise10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Integer> numbers = new ArrayList<>();

		System.out.println("Type a number: ");
		int num1 = scan.nextInt();
		System.out.println("Type a number: ");
		int num2 = scan.nextInt();

		int firstNumber;
		int lastNumber;

		if (num1 > num2) {
			firstNumber = num2;
			lastNumber = num1;

		} else {
			firstNumber = num1;
			lastNumber = num2;
		}

		while (firstNumber + 1 <= lastNumber - 1) {
			firstNumber++;
			numbers.add(firstNumber);
		}

		System.out.println(numbers);

		scan.close();

	}
}
