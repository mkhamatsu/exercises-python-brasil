package exerciciosPythonBrasil.estruturaDeRepeticao;

import java.util.Scanner;

/*
 Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
 mostrando uma mensagem de erro e voltando a pedir as informações.
*/

public class EstruturaRepeticaoExercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String name;
		String password;

// Resolução com Do While
		do {
			System.out.println("Digite o seu nome: ");
			name = scan.next();
			System.out.println("Digite sua senha: ");
			password = scan.next();
			if (name.equals(password)) {
				System.out.println("A senha não pode ser igual o nome.");
			}
		} while (name.equals(password));
		System.out.println("Dados inseridos corretamente.\nPrograma finalizado!");

// Resolução com While
//		while (true) {
//			System.out.println("Digite o seu nome: ");
//			name = scan.next();
//			System.out.println("Digite sua senha: ");
//			password = scan.next();
//			if (name.equals(password)) {
//				System.out.println("A senha não pode ser igual o nome.");
//				continue;
//			} else {
//				System.out.println("Dados inseridos corretamente.\nPrograma finalizado!");
//				break;
//			}
//		}

		scan.close();

	}
}
