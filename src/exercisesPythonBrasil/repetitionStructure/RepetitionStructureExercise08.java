package exercisesPythonBrasil.repetitionStructure;

import java.util.Scanner;

/*
 Faça um programa que leia 5 números e informe a soma e a média dos números
*/

public class RepetitionStructureExercise08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0;
		int size = 5;

		double sum = 0;

		while (count < size) {
			count++;
			System.out.println("Type a number [" + count + "]: ");
			sum += scan.nextInt();
		}

		double avarage = sum / size;

		System.out.println("The sum of the values ​​is " + sum);
		System.out.println("The average ​​is " + avarage);

		scan.close();

	}
}
