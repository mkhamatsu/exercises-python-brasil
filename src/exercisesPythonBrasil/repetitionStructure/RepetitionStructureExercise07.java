package exercisesPythonBrasil.repetitionStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 Faça um programa que leia 5 números e informe o maior número.
*/

public class RepetitionStructureExercise07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Integer> numberList = new ArrayList<Integer>(5);
		int count = 0;
		int size = 5;

		while (count < size) {
			count++;
			System.out.println("Type a number ["+count+"]: ");
			numberList.add(scan.nextInt());
		}
		
		System.out.println("The highest number on the list is the: "+ Collections.max(numberList));
		
		scan.close();
		
	}
}
