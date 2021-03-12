package com.epsi.mycal;

import java.util.Scanner;

public class Application {
	/**
	 * Méthode Application Main // OK
	 */
	public static void main(String[] args) {
		int valueA;
		int valueB;
		int actual;
		Calculator calc = new Calculator();
		Scanner myObj = new Scanner(System.in);
		for (boolean i = true; i == true; ) {
			System.out.println("Choisisez une méthode : \n");
			System.out.println("1. Addition");
			System.out.println("2. Soustraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Quitter");
			int choix = myObj.nextInt();
			switch (choix) {
				case 1:
					System.out.println("Choisisez une valeur pour A : \n");
					valueA = myObj.nextInt();
					System.out.println("Choisisez une valeur pour B : \n");
					valueB = myObj.nextInt();
					actual = calc.add(valueA, valueB);
					System.out.println("Résultat de l'addition :" + actual + "\n");
					break;
				case 2:
					System.out.println("Choisisez une valeur pour A : \n");
					valueA = myObj.nextInt();
					System.out.println("Choisisez une valeur pour B : \n");
					valueB = myObj.nextInt();
					actual = calc.sub(valueA, valueB);
					System.out.println("Résultat de la soustraction :" + actual + "\n");
					break;
				case 3:
					System.out.println("Choisisez une valeur pour A : \n");
					valueA = myObj.nextInt();
					System.out.println("Choisisez une valeur pour B : \n");
					valueB = myObj.nextInt();
					actual = calc.mul(valueA, valueB);
					System.out.println("Résultat de la multiplication :" + actual + "\n");
					break;
				case 4:
					System.out.println("Choisisez une valeur pour A : \n");
					valueA = myObj.nextInt();
					System.out.println("Choisisez une valeur pour B : \n");
					valueB = myObj.nextInt();
					actual = calc.div(valueA, valueB);
					System.out.println("Résultat de la division :" + actual + "\n");
					break;
				case 5:
					i = false;
					break;
				default:
					System.out.println("Veuillez indiquer une valeur valide \n");
			}
		}
	}

}
