package exercisesPythonBrasil.repetitionStructure;

import java.util.Scanner;

/*
 Faça um programa que leia e valide as seguintes informações:
 a- Nome: maior que 3 caracteres;
 b- Idade: entre 0 e 150;
 c- Salário: maior que zero;
 d- Sexo: 'f' ou 'm';
 e- Estado Civil: 's', 'c', 'v', 'd';
*/

public class RepetitionStructureExercise03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		double salary;
		String gender;
		String maritalCivil;

		String women = "w";
		String men = "m";

		String single = "s";
		String married = "m";
		String widower = "w";
		String divorced = "d";

		do {
			System.out.println("Name: ");
			name = scan.next();
		} while (name.length() < 3);

		do {
			System.out.println("Age: ");
			age = scan.nextInt();
		} while (age < 0 || age > 150);

		do {
			System.out.println("Salary: ");
			salary = scan.nextDouble();
		} while (salary < 0);

		do {
			System.out.println("Gender: ");
			gender = scan.next();
		} while (!gender.equalsIgnoreCase(women) 
				&& !gender.equalsIgnoreCase(men));

		do {
			System.out.println("MaritalCivil: ");
			maritalCivil = scan.next();
		} while (!maritalCivil.equalsIgnoreCase(single) 
				&& !maritalCivil.equalsIgnoreCase(married)
				&& !maritalCivil.equalsIgnoreCase(widower) 
				&& !maritalCivil.equalsIgnoreCase(divorced));
		
		System.out.println("That's all!\nFinished Program!");

		scan.close();

	}
}
