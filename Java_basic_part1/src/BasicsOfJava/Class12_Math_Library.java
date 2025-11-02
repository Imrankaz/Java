package BasicsOfJava;

import java.util.Scanner;

public class Class12_Math_Library {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num1,num2, result;

		System.out.println("input int number 1:");
		num1 = input.nextInt();
		System.out.println("input int number 2:");
		num2 = input.nextInt();

		System.out.println("-----------------------------------------------------------------------------------");
		result = Math.abs(num1);
		System.out.println("absolute value of num1 : "+result);
		result = Math.abs(num2);
		System.out.println("absolute value of num2 : "+result);

		System.out.println("-----------------------------------------------------------------------------------");
		result = Math.max(num1,num2);
		System.out.println("Maximum value in between of num1 and num2 : "+result);

		System.out.println("-----------------------------------------------------------------------------------");
		result = Math.min(num1,num2);
		System.out.println("Minimum value in between of num1 and num2 : "+result);

		System.out.println("-----------------------------------------------------------------------------------");
		//Type Conversion
		System.out.println("Type Conversion1");

		double result2;
		result2 = Math.pow((double)num1,(double)num2);
		System.out.println("pow(num1,num2): num1 to the power num2 : "+result2);

		// Type Conversion
		System.out.println("Type Conversion2");
		double num3 = num1;
		double num4 = num2;
		double result3;
		result3 = Math.pow(num3,num4);
		System.out.println("pow(num3,num4): num3 to the power num4 : "+result3);

		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Type Conversion3");
		num1 = (int) num3;
		num2 = (int) num4;
		System.out.println("num1: "+num1+" 	"+"num2: "+num2);


		System.out.println("-----------------------------------------------------------------------------------");
		result3 = Math.PI;
		System.out.println("Value of PI : "+result3);
		result = (int) Math.PI;
		System.out.println("full digit of PI in int : "+result);

		System.out.println("-----------------------------------------------------------------------------------");
		result3 = Math.random();
		System.out.println("random Value : "+result3);
		result = (int) Math.random();
		System.out.println("random Value : "+result);
	}

}
