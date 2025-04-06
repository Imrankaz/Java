package BasicsOfJava;

import java.util.Scanner;

public class Class13_1_for_Loop {
	private static Scanner input;
	
	public static void main(String[] args) {

		System.out.println("for loop syntax : ");
		System.out.println("-------------------------------------------------------");
		System.out.println("for(initialization, condition, increment / decrement){\n          statements(s); \n }");
		System.out.println("-------------------------------------------------------");
		
		
		System.out.println("using Switch Case");
		input = new Scanner(System.in);
		
		int n;
		System.out.println("input an int digit from (0 to 5):");
		
		n = input.nextInt();
		
		System.out.println("\n******\n");
		
		switch(n) {
				
				case 0:
					
					
					for(int i=0;i<=10;i++) {
						System.out.println(i);
					}
					
					 System.out.println("\n******\n");
					
					
					break;
				case 1:	
					
					
					for(int j=0;j<=10;j=j+1) {
						//j=j++ is same as j=j+1;     j++==j+1
						System.out.println(j);
					}
					
					
					System.out.println("\n******\n");
					
					break;
				case 2:
					
					
					for(int l=2;l<=10;l=l+2) {
						System.out.println(l);
					}
					
					 System.out.println("\n******\n");
					 
					break;
				case 3:
						
					
					for(int k=10;k>=1;k--) {
						System.out.println(k);
					}
					
					System.out.println("\n******\n");
					
					break;
				case 4:
					
					for(int k=10;k>=1;--k) {
						System.out.println(k);
					}
					
					System.out.println("\n******\n");	
					break;
				case 5:
					
					for(int k=0;k<=10;++k) {
						System.out.println(k);
						
					}
					
					System.out.println("\n******\n");	
					break;
				
					
				default: 		//works like else;
					System.out.println("not a digit");		
		
		
		
		}
		

		
		
		
	}

}

