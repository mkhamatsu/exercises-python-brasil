package exercisesPythonBrasil.repetitionStructure;

import java.util.ArrayList;
import java.util.Scanner;

/*
 Faça um programa que peça 10 números inteiros, 
 calcule e mostre a quantidade de números pares e a quantidade de números impares.
*/

public class RepetitionStructureExercise14 {

	public static void main(String[] args) {

		var evenNumbers = new ArrayList<>();
		var oddNumbers = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int size = 10;
		int inputNumber;

		while (count < size) {
			count++;
			System.out.println("Type a number [" + count + "]: ");
			inputNumber = scan.nextInt();
			if (inputNumber % 2 == 0) {
				evenNumbers.add(inputNumber);
			} else {
				oddNumbers.add(inputNumber);
			}
		}

		System.out.println("Even numbers: " + evenNumbers.size());
		System.out.println("The odd numbers: " + oddNumbers.size());

		scan.close();

	}
}
