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
		System.out.println("sub k = "+k);
		
		
		k = n*m;
		System.out.println("mul k = "+k);
		
		
		double k1 = (double)  n/m;
		System.out.println("div k = "+k1);
		
		
		k = n%m;
		System.out.println("mod k = "+k);
		
		
		

	}

}


