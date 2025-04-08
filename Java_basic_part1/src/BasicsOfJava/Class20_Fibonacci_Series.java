package BasicsOfJava;
import java.util.Scanner;
public class  Class20_Fibonacci_Series{
	private static Scanner input;
	public static void main(String[] args) {
		
		System.out.println("Fibonacci Series");
		
		input = new Scanner(System.in);
		int firstno,secondno,totalno,fibo;

		System.out.print("input how many numbers to show the fibonacci series: ");
		
		totalno = input.nextInt();
		
		firstno = 0;
		secondno = 1;
		
		System.out.println("Fibonacci Series of "+totalno+" numbers are:");
		
		System.out.print(firstno+" "+secondno);
		for(int i=3; i<=totalno; i++)
		{
			fibo = firstno + secondno;
			System.out.print(" "+fibo);
			firstno = secondno;
			secondno = fibo;
		}
		System.out.println();

	}}


