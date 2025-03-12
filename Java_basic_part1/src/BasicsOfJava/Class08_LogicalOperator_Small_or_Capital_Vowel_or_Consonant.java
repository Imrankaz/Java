package BasicsOfJava;

import java.util.Scanner;

public class Class08_LogicalOperator_Small_or_Capital_Vowel_or_Consonant {
	private static Scanner input;

	public static void main(String[] args)
	{
		System.out.println("using Logical Operator >>	&& (and) ,	|| (or) ,	! (not)");
		System.out.println("&&  => Logical AND");
		System.out.println("||  => Logical OR");
		System.out.println("!   => Logical NOT");
		System.out.println("Small or Capital letter");
		System.out.println("Vowel or Consonant");

		input = new Scanner(System.in);
		char c;
		System.out.print("input a character:");

		c = input.next().charAt(0);

		/*
		char ch = input.next().charAt(0); // Reads first character of input string

		✅ Why use next().charAt(0)?
				next() reads a word (String).
				.charAt(0) extracts the first character.

		✅ Using nextLine().charAt(0) (Handles Spaces)
				If you want to capture a single character but allow spaces before input, use nextLine().


		 */
		
		
		
		if(c>='a' && c<='z') {
			System.out.println("Small letter\t");
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				System.out.println("Vowel");
			}
			else {
				System.out.println("Consonant");
			}							
		}
		
		
		else if(c>='A' && c<='Z') {
			System.out.println("Capital letter\t");
			
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				System.out.println("Vowel");
			}
			else {
				System.out.println("Consonant");
			}
		}
		
		
		//else if(c!='%'){
		//	System.out.println("dvsfv");
		//}
		else {
			System.out.println("not Letter");
		}

		input.close(); // Close scanner
	}

}

