package BasicsOfJava;

import java.util.Scanner;
public class Class24_Armstrong_No {
	private static Scanner input;
	public static void main(String[] args) {
   	 
    	System.out.println("Armstrong No:");
   	 
    	input = new Scanner(System.in);
    	int reminder,sum=0,num, temp;

    	System.out.print("input a no. to see it's summation: ");
   	 
    	num = input.nextInt();
    	temp = num;
   	 
    	while(temp!=0)
    	{
        	reminder = temp%10;
        	sum  = sum  + (reminder *reminder *reminder) ;
        	temp = temp/10;
       	 
    	}
    	System.out.println("Sum of this no. is: " + sum);
    	if(num==sum)
    	{
   		  System.out.println(sum + ": This is an Armstrong No");
    	}
    	else {
   		 System.out.println(sum + ":  Not an Armstrong No");
    	}
   	 
	}
}



