package exercisesPythonBrasil.repetitionStructure;

import java.util.Scanner;

/*
 Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
 mostrando uma mensagem de erro e voltando a pedir as informações.
 */

public class RepetitionStructureExercise02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String name;
		String password;

// Resolução com Do While
		do {
			System.out.println("Type your name: ");
			name = scan.next();
			System.out.println("Type your password: ");
			password = scan.next();
			if (name.equalsIgnoreCase(password)) {
				System.out.println("The password cannot be the same as the name.");
			}
		} while (name.equalsIgnoreCase(password));
		System.out.println("That's all!\nFinished Program!");

// Resolução com While
//		while (true) {
//			System.out.println("Type your name: ");
//			name = scan.next();
//			System.out.println("Type your password: ");
//			password = scan.next();
//			if (name.equalsIgnoreCase(password)) {
//				System.out.println("The password cannot be the same as the name.");
//				continue;
//			} else {
//				System.out.println("That's all!\nFinished Program!");
//				break;
//			}
//		}

		scan.close();

	}
}
