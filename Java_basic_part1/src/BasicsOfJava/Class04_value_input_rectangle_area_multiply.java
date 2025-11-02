package BasicsOfJava;


import java.util.Scanner;

public class Class04_value_input_rectangle_area_multiply {
	

	private static Scanner input;

	public static void main(String[] args)
	{
		System.out.println("value input & rectangle area");
		
		input = new Scanner(System.in);
		
		double n,m,o;
		System.out.print("input the valure of n :");
		
		n = input.nextDouble();
		
		System.out.print("input the valure of m :");
		m = input.nextDouble();
		
		o = n*m;
		
		System.out.print("the valure of the rectangle area is :"+o);
		
	}
	

}


