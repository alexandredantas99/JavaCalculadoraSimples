package br.com.pessoal.calculadora.main;

import java.util.Scanner;

import br.com.pessoal.calculadora.Calculadora;

public class TesteCalcular {
	private static Scanner entrada;

	public static void main(String[] args) {

		double options;
		double x;
		double y;
		Calculadora cal = new Calculadora();

		entrada = new Scanner(System.in);

		System.out.println("Basic Calculator");

		System.out.println("1 = Sum");
		System.out.println("2 = Decrease");
		System.out.println("3 = Multiply");
		System.out.println("4 = Part");

		options = entrada.nextDouble();

		if (options == 1) {
			System.out.println("You Selected Sum");
			System.out.println("Insert Value 1");
			x = entrada.nextDouble();

			System.out.println("Insert Value 2");
			y = entrada.nextDouble();

			System.out.println(cal.soma(x, y));
		}

		if (options == 2) {
			System.out.println("You Selected Decrease");
			System.out.println("Insert Value 1");
			x = entrada.nextDouble();

			System.out.println("Insert Value 2");
			y = entrada.nextDouble();

			System.out.println(cal.dif(x, y));
		}

		if (options == 3) {
			System.out.println("You Selected Multiply");
			System.out.println("Insert Value 1");
			x = entrada.nextDouble();

			System.out.println("Insert Value 2");
			y = entrada.nextDouble();

			System.out.println(cal.multi(x, y));
		}

		if (options == 4) {
			System.out.println("You Selected Part");
			System.out.println("Insert Value 1");
			x = entrada.nextDouble();

			System.out.println("Insert Value 2");
			y = entrada.nextDouble();

			System.out.println(cal.div(x, y));

		}
	}
}
