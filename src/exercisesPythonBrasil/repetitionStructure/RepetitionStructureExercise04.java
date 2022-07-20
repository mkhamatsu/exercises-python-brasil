package exercisesPythonBrasil.repetitionStructure;

/*
 Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% 
 e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. 
 Faça um programa que calcule e escreva o número de anos necessários para que a população 
 do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento. 
*/

public class RepetitionStructureExercise04 {

	public static void main(String[] args) {

		int populationA = 80000;
		int populationB = 200000;

		double growthPercentageA = (1 + 0.03);
		double growthPercentageB = (1 + 0.015);

		int years = 0;

		do {
			years += 1;
			populationA *= growthPercentageA;
			populationB *= growthPercentageB;
		} while (populationA <= populationB);

		System.out.println("Population A: " + populationA);
		System.out.println("Population B: " + populationB);
		System.out.println("The populationA is equal or bigger than populationB in " + years + " years.");
		
	}
}
