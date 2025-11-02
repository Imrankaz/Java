package BasicsOfJava;

import java.util.Scanner;
public class Class22_Reversing_no{
	//private static Scanner input;
	public static void main(String[] args) {
		
		System.out.println("Reversing the no");

		Scanner input = new Scanner(System.in);
		input = new Scanner(System.in);
		int reminder,sum=0,num, temp;

		System.out.print("input a no. to see it's reverse: ");
		
		num = input.nextInt();
		temp = num;
		
		while(temp!=0)
		{
			reminder = temp%10;
			sum = (sum * 10) + reminder;
			temp = temp/10;
			
		}
		System.out.println("reverse of this no. is: " + sum);
	}
}

