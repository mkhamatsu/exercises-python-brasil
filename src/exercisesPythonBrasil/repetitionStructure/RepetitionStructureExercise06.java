package exercisesPythonBrasil.repetitionStructure;

/*
 Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. 
 Depois modifique o programa para que ele mostre os números um ao lado do outro.
*/

public class RepetitionStructureExercise06 {

	public static void main(String[] args) {

// Resolução com For
		for (int i = 1; i < 20; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for (int i = 1; i < 20; i++) {
			System.out.print(i);
		}

// Resolução com While
//		int start = 1;
//		int end = 20;
//
//		while (start <= end) {
//			System.out.println(start);// um abaixo do outro
//			System.out.print(start); // um ao lado do outro
//			start++;
//		}

	}
}
