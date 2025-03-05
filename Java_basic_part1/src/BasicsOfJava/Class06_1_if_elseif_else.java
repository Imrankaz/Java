package BasicsOfJava;

import java.util.Scanner;

public class Class06_1_if_elseif_else {
	private static Scanner input;
	public static void main(String[] args) {
		System.out.println("if_else if_else");
		input = new Scanner(System.in);
		
		double p;
		
		System.out.println("Input a double value: ");
		p = input.nextDouble();
		
		//System.out.println("p = "+p);
		
		if(p>0) {
			System.out.println(p +": this value is positive");
		}
		else if(p<0) {
			System.out.println(p +": this value is negative");			
		}
		else {
			System.out.println(p +": this value is zero");			
		}
	}
	
}

