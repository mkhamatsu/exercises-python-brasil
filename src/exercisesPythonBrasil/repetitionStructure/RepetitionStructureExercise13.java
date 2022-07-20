package exercisesPythonBrasil.repetitionStructure;

import java.util.Scanner;

/*
 Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. 
 Não utilize a função de potência da linguagem.
*/

public class RepetitionStructureExercise13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int result;

		System.out.println("Number[base]: ");
		int base = scan.nextInt();

		System.out.println("Number[exponent]: ");
		int exponent = scan.nextInt();

		result = (int)Math.pow(base, exponent);

		System.out.println("Result: " + result);
		
		scan.close();

	}
}
