package exercisesPythonBrasil.repetitionStructure;

import java.util.ArrayList;
import java.util.List;

/*
A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... 
Faça um programa que gere a série até que o valor seja maior que 500.
*/

public class RepetitionStructureExercise16 {

	public static void main(String[] args) {

		List<Integer> fibonacciList = new ArrayList<>();
		int first = 1;
		int second = 1;
		int last = 500;
		int next;

		fibonacciList.add(first);
		fibonacciList.add(second);

		while (true) {
			next = first + second;
			first = second;
			second = next;
			fibonacciList.add(next);
			if (next > last)
				break;
		}

		System.out.println("Fibonacci sequence: " + fibonacciList);

	}
}
