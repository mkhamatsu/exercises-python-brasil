package exercisesPythonBrasil.repetitionStructure;

import java.util.Scanner;

/*
Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. 
Valide a entrada e permita repetir a operação.. 
*/

public class RepetitionStructureExercise05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int years = 0;
		boolean toContinue = true;

		while (toContinue) {
			System.out.println("Inhabitants country A: ");
			int populationA = scan.nextInt();

			System.out.println("Inhabitants country B: ");
			int populationB = scan.nextInt();

			System.out.println("Growth percentage A: ");
			double growthPercentageA = (1 + scan.nextDouble());
			
			System.out.println("Growth percentage B: ");
			double growthPercentageB = (1 + scan.nextDouble());

			do {
				years += 1;
				populationA *= growthPercentageA;
				populationB *= growthPercentageB;
			} while (populationA <= populationB);

			System.out.println("Population A: " + populationA);
			System.out.println("Population B: " + populationB);
			System.out.println("The populationA is equal or bigger than populationB in " + years + " years.");

			System.out.println();
			System.out.print("Do you want to continue? [Y/N] ");
			String repeat = scan.next();

			if (repeat.equalsIgnoreCase("N")) {
				toContinue = false;
			}

		}

		scan.close();

	}
}
