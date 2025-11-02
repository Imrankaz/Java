package BasicsOfJava;

import java.util.Scanner;

public class Class09_switch_case {
	private static Scanner input;
	public static void main(String[] args)
	{
		System.out.println("using Switch Case");

		//---------------------------------------------------------------------------------------------------------------------------
		System.out.println("if not use \"break\", than will print all the cases under the matching case");
		input = new Scanner(System.in);
		int n;
		System.out.println("input an int or digit:");
		
		n = input.nextInt();
		
		switch(n) {
				
				case 0:
					System.out.println("zero");
					break;
				case 1:	
					System.out.println("one");
					break;
				case 2:
					System.out.println("two");
					break;
				case 3:
					System.out.println("three");	
					break;
				case 4:
					System.out.println("four");	
					break;
				case 5:
					System.out.println("five");	
					break;
				case 6:
					System.out.println("six");	
					break;
				case 7:
					System.out.println("seven");
					break;
				case 8:
					System.out.println("eight");	
					break;
				case 9:
					System.out.println("nine");	
					break;
					
				default: 		//works like else;
					System.out.println("not in between 0-9 digits");		
						
		}
		//---------------------------------------------------------------------------------------------------------------------------

		System.out.print("Enter a grade (A, B, C): ");
		char grade = input.next().charAt(0);

		switch (grade) {
				case 'A':
					System.out.println("Excellent!");
					break;
				case 'B':
					System.out.println("Good job!");
					break;
				case 'C':
					System.out.println("You passed.");
					break;
				default:
					System.out.println("Invalid grade.");
		}

		//---------------------------------------------------------------------------------------------------------------------------

		System.out.print("Enter a day: ");
		String day = input.next().toLowerCase(); // Convert to lowercase

		switch (day) {
				case "monday":
					System.out.println("Start of the week!");
					break;
				case "friday":
					System.out.println("Weekend is near!");
					break;
				case "sunday":
					System.out.println("It's a holiday!");
					break;
				default:
					System.out.println("A normal day.");
		}

		//---------------------------------------------------------------------------------------------------------------------------

		/*
			 switch Without break (Fall-Through Behavior)
			 If you omit break, execution continues to the next case.
		 */

		int num = 2;
		switch (num) {
				case 1:
					System.out.println("One");
				case 2:
					System.out.println("Two"); // No break, so case 3 will also execute
				case 3:
					System.out.println("Three");
		}
		//---------------------------------------------------------------------------------------------------------------------------

		int day2 = 2;
		switch (day2) {
			case 1: case 2: case 3: case 4: case 5:
				System.out.println("It's a weekday.");
				break;
			case 6: case 7:
				System.out.println("It's the weekend!");
				break;
			default:
				System.out.println("Invalid day.");
		}


		//---------------------------------------------------------------------------------------------------------------------------
		input.close();
		//---------------------------------------------------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------------------------------------------------


		/*
		Conditions in switch Statement in Java
			The switch statement in Java only works with discrete values,
				meaning you cannot use relational (>, <, >=, <=) or logical (&&, ||) operators directly inside case labels.

			✅ Valid switch Expressions:
			int, byte, short, char
			String (Java 7+)
			enum types
			❌ Not Allowed in switch:
			Relational Conditions (>, <)
			❌ case (x > 10): → ❌ Not allowed
			Logical Conditions (&&, ||)
			❌ case (x > 5 && x < 10): → ❌ Not allowed
		 */
	}

}

