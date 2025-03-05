package BasicsOfJava;

import java.util.Scanner;

public class Class03_Arithmatic_Operator {

	private static Scanner input;

	public static void main(String[] args) {

		System.out.println("Arithmatic Operator");


		input = new Scanner(System.in);

		System.out.print("input the valure of n :");

		int n;

		n = input.nextInt();

		System.out.println("n = "+n);


		int m;

		System.out.print("input the valure of m :");

		m = input.nextInt();

		System.out.println("m = "+m);


		int k = n+m;
		System.out.println("addition k = "+k);


		k = n-m;
		System.out.println("Subtraction k = "+k);


		k = n*m;
		System.out.println("Multiplication k = "+k);


		double k1 = (double)  n/m;
		System.out.println("Division (Quotient)  k = "+k1);


		k = n%m;
		System.out.println("Modulus (Remainder) k = "+k);

		k = k+1;
		System.out.println("k = " + k);

		k++;
		System.out.println("k = " + k);
		System.out.println("k++ = " + k++);
		System.out.println("k = " + k);
		System.out.println("++k = " + ++k);
		System.out.println("k = " + k);
		System.out.println("k-- = " + k--);
		System.out.println("k = " + k);
		System.out.println("--k = " + --k);
		System.out.println("k = " + k);

		/*
		List of Arithmetic Operators:
			Operator	Description					Example (a = 10, b = 5)
			+			Addition					a + b → 15
			-			Subtraction					a - b → 5
			*			Multiplication				a * b → 50
			/			Division (Quotient)			a / b → 2 (Integer division)
			%			Modulus (Remainder)			a % b → 0
			++			Increment (a = a + 1)		a++ or ++a → 11
			--			Decrement (a = a - 1)		a-- or --a → 9
		 */

	}

}


