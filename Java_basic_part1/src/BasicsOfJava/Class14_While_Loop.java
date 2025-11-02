package BasicsOfJava;

import java.util.Scanner;

public class Class14_While_Loop {

	private static Scanner input;
	public static void main(String[] args) {

		System.out.println("while loop syntax : ");
		System.out.println("-------------------------------------------------------");
		System.out.println(" initialization \n while(condition){  \n      statements(s); \n      increment/decrement; \n }");
		System.out.println("-------------------------------------------------------");
		System.out.println("do-while loop syntax : ");
		System.out.println("-------------------------------------------------------");
		System.out.println(" initialization \n do{  \n      statements(s); \n      increment/decrement; \n } while(condition)   \n");
		System.out.println("-------------------------------------------------------");

		System.out.println("using Switch Case");
		input = new Scanner(System.in);
		
		int n;
		System.out.println("input an int digit from (0 to 5):");
		
		n = input.nextInt();
		
		System.out.println("\n******\n");
		
		switch(n) {
				
				case 0:
					
					System.out.println("While loop :   ajibon colbe ei loop");
					int i=0;
					while(i<=10)
					{
						System.out.println(i); // ajibon colbe
					}
					
					 System.out.println("\n******\n");
					
					
					break;
				case 1:	
					System.out.println("While");
					int j=0;
					while(j<=10) {
						System.out.println(j);
						j=j+1;	// j++ == j+1
					}
					
					
					System.out.println("\n******\n");
					
					break;
				case 2:
					
					System.out.println("For Loop");
					for(int l=0;l<=10;l=l+2) {
						System.out.println(l);
					}
					
					 System.out.println("\n******\n");
					 
					break;
				case 3:
						
					System.out.println("Do_While");
					int k=0;
					do {
						
						System.out.println(k);
						k++;
						
					}while(k<=10);
					
					
					System.out.println("\n******\n");
					
					break;
				case 4:
					System.out.println("Do_While");
					int m=10;
					do {
						
						System.out.println(m);
						m--;
						
					}while(m>=1);	
					break;

				case 5:
					System.out.println("Do_While");
					int o=1;
					do {

						System.out.println(o);
						o--;

					}while(o>1);
					break;
					
				default: 		//works like else;
					System.out.println("not a digit");		
		
		
		
		}
		

		
		
		
	}

}

