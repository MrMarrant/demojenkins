package com.epsi.mycal;

public class Calculator {

	public int add(int valueA, int valueB) {
		return valueA + valueB;
	}

	public int sub(int valueA, int valueB) {
		return valueA - valueB;
	}

	public int mul(int valueA, int valueB) {
		return valueA * valueB;
	}

	public int div(int valueA, int valueB) {
		return valueA / valueB;
	}

	/**
	 * Méthode Pair // OK
	 */
	public boolean pair(int valueA) {
		if (valueA % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Méthode Premier // OK
	 */
	public boolean premier(int valueA) {
		int result;
		boolean flag = true;
		for (int i = 2; i <= valueA / 2; i++) {
			//nombre est divisible par lui-meme
			result = valueA % i;

			//si le reste est 0, alors arrete la boucle. Sinon continuer la boucle
			if (result == 0) {
				flag = false;
				break;
			}
		}

		if (flag) {
			return true;
		} else {
			return false;
		}
	}
}
