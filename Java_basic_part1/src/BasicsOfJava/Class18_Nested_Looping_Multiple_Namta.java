package BasicsOfJava;

import java.util.Scanner;
public class Class18_Nested_Looping_Multiple_Namta {
	private static Scanner input;
	public static void main(String[] args) {
		
		System.out.println("Time Table (Multiplyer)");
		System.out.println("m to n er namta; "+" Ex: 5 theke 10 er namta"); 
		
		input = new Scanner(System.in);
		int m,n;

		System.out.println("input Starting digit: ");
		m = input.nextInt();
		
		System.out.println("input Ending digit: ");
		n = input.nextInt();
		//here m=small, n=large

		if(m>n) {			//Swapping, if anyone input large no. first(m) and small no. at last(n).
			int t=m;
			m=n;
			n=t;
		}
		
		//else {}
		
		//here m=small, n=large
		for(int j=m; j<=n; j++)
		{
			for(int i=0; i<=10; i++)
			{
				System.out.println(j+" * "+i+ " = "+ j*i );
			}
			System.out.println("/n*********/n");
		}
		
		System.out.println("Prog End");

		
	}

}

