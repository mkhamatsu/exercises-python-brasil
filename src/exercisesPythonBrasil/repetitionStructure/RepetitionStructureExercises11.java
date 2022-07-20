package exercisesPythonBrasil.repetitionStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 Altere o programa anterior para mostrar no final a soma dos números.
*/

public class RepetitionStructureExercises11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Integer> numbers = new ArrayList<>();

		System.out.println("Type a number: ");
		int num1 = scan.nextInt();
		System.out.println("Type a number: ");
		int num2 = scan.nextInt();

		int firstNumber;
		int lastNumber;

		int sum = 0;

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
			sum += firstNumber;
		}

		System.out.println("Numbers: " + numbers);
		System.out.println("The sum of the values ​​is " + sum);

		scan.close();

	}
}
