package BasicsOfJava;

import java.util.Scanner;
public class Class23_Palindrome_no {
	//private static Scanner input;
	public static void main(String[] args) {
		
		System.out.println("finding Palindrome_no ");

		/*
		A palindrome number is a number that reads the same backward as forward.
		📌 Examples: 121, 12321, 1331, 7
		 */
		Scanner input = new Scanner(System.in);
		//input = new Scanner(System.in);
		int reminder,sum=0,num, temp;

		System.out.print("input a no. to see it's reverse: ");
		//Scanner input = new Scanner(System.in);
		num = input.nextInt();
		temp = num;
		
		while(temp!=0)
		{
			reminder = temp%10;
			System.out.println("reminder: "+reminder);
			sum = (sum * 10) + reminder;
			System.out.println("sum: "+ sum);
			temp = temp/10;
			System.out.println("temp: "+ temp);
			
		}
		System.out.println("reverse of this no. is: " + sum);
		
		if(sum==num) {
			System.out.println(num + " is a Palindrome no");
		}
		else
		{
			System.out.println(num + " is not a Palindrome no");
		}
	}
}

