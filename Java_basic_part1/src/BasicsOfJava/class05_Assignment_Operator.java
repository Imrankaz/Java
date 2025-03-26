package BasicsOfJava;

import java.util.Scanner;

public class Class05_Assignment_Operator {
	private static Scanner input;

	public static void main(String[] args) {
		
		System.out.println("Assignment Operator");

		/*
		List of Assignment Operators:

			Operator	Description				Example (a = 10, b = 5)		Equivalent To
			=			Assign value			a = b → a = 5				—
			+=			Add and assign			a += b → a = 15				a = a + b
			-=			Subtract and assign		a -= b → a = 5				a = a - b
			*=			Multiply and assign		a *= b → a = 50				a = a * b
			/=			Divide and assign		a /= b → a = 2				a = a / b
			%=			Modulus and assign		a %= b → a = 0				a = a % b

		 */
		
		
		input = new Scanner(System.in);
		
		System.out.print("input the valure of m :");
		
		int m,n;
		
		m = input.nextInt();
		
		System.out.println("m = "+m);
		
		System.out.print("input the valure of n :");
		
		n = input.nextInt();
		
		System.out.println("n = "+n);
		
		
		
		n+=m;		
		System.out.println("n+=m; = "+n);

		System.out.println("n = " + n);
		System.out.println("m = " + m);

		
		n-=m;		
		System.out.println("n-=m; = "+n);

		System.out.println("n = " + n);
		System.out.println("m = " + m);
		
		n*=m;		
		System.out.println("n*=m; = "+n);

		System.out.println("n = " + n);
		System.out.println("m = " + m);
		
		n/=m;		
		System.out.println("n/=m; = "+n);

		System.out.println("n = " + n);
		System.out.println("m = " + m);

	}
}

