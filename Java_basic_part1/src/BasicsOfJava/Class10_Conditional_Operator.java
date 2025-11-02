package BasicsOfJava;

import java.util.Scanner;

public class Class10_Conditional_Operator {
	private static Scanner input;

	public static void main(String[] args) {
		
		System.out.println("Conditional_Operator");
		System.out.println("(x>y) ? x : y");
		System.out.println("if x>y then print x");
		System.out.println("if x<y then print y");
		System.out.println("\n**********\n");
		input = new Scanner(System.in);
		
		int num1,num2,large;
		System.out.println("input int number 1:");
		
		num1 = input.nextInt();
		
		System.out.println("input int number 2:");
		
		num2 = input.nextInt();
		
		
		large = (num1>num2) ? num1 : num2;
		
		System.out.println("Largest number is: "+large);

		input.close();
	}

}


