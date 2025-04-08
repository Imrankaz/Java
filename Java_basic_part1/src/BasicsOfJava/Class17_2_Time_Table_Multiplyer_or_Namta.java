package BasicsOfJava;

import java.util.Scanner;
public class Class17_2_Time_Table_Multiplyer_or_Namta {
	private static Scanner input;
	public static void main(String[] args) {
		
		System.out.println("Time Table (Multiplyer)");
		System.out.println("n er namta; "+" Ex: 5 er namta"); 
		input = new Scanner(System.in);
		
		int num;
		System.out.println("input an int digit: ");
		
		num = input.nextInt();
		
		for (int i=0; i<=10; i++)
		{
			System.out.println(num+ "x" +i+ "  =  "+ num*i);
			
		}
	
		System.out.println("/n*********/n");

		
	}

}

