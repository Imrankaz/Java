package BasicsOfJava;

import java.util.Scanner;

public class class05_Assignment_Operator {
	private static Scanner input;

	public static void main(String[] args) {
		
		System.out.println("Assignment Operator");
		
		
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
		
		n-=m;		
		System.out.println("n-=m; = "+n);
		
		n*=m;		
		System.out.println("n*=m; = "+n);
		
		n/=m;		
		System.out.println("n/=m; = "+n);

	}
}

