package BasicsOfJava;
import java.util.Scanner;

public class Class07_uninary_operator {
	private static Scanner input;

	public static void main(String[] args) {
	
		System.out.println("uninary operator");
	
	
		input = new Scanner(System.in);
	
		System.out.print("input the value of int m :");
	
		int m,n;
	
		m = input.nextInt();
	
		System.out.println("\n**********\n");
		
		n = --m;		//5-1=4 prefix, so print 4
		
		System.out.println("value of n = --m : " +n);
		System.out.println("value of m : " +m);
		
		n = m--;		//4-1=3 but postfix, so print 4
		
		System.out.println("value of n = m-- : " +n);
		System.out.println("value of m : " +m);
		
		n = ++m;		//3+1=4 prefix, so print 4
		
		System.out.println("value of n = ++m : " +n);
		System.out.println("value of m : " +m);
			
		n = m++;		//4+1 = 5 but postfix, so print 4
			
		System.out.println("value of n = m++ : " +n);
		System.out.println("value of m : " +m);
		
		n=m;			//5
		System.out.println("value of n = m : " +n);
	
		
	
	}

}

