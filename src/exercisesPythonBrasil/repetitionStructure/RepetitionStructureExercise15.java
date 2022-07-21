package exercisesPythonBrasil.repetitionStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
 Faça um programa capaz de gerar a série até o n−ésimo termo.
*/

public class RepetitionStructureExercise15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Integer> fibonacciList = new ArrayList<>();
		int first = 1;
		int second = 1;
		int next;

		fibonacciList.add(first);
		fibonacciList.add(second);

		System.out.println("Type the 'n'th term of the Fibonacci sequence: ");
		int n = scan.nextInt();

		for (int i = 3; i <= n; i++) {
			next = first + second;
			first = second;
			second = next;
			fibonacciList.add(next);

		}

		System.out.println("Fibonacci sequence: " + fibonacciList);

		scan.close();

	}
}
