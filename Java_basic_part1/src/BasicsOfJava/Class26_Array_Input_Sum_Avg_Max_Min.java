package BasicsOfJava;

import java.util.Scanner;

public class Class26_Array_Input_Sum_Avg_Max_Min {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		double[] num= new double[5];
		
		System.out.println("Input values in array: ");
		
		double sum = 0;
		
		
		for(int i=0; i< num.length; i++) {
			num[i] = input.nextDouble();
			sum = sum+ num[i];
		}
		
		System.out.println("Sum is: "+sum);
		
		
		
		double avg = sum/ num.length;
		System.out.println("Average is: "+avg);
		
		
		
		double max = num[0];
		double min = num[0];
		
		for(int i=0; i< num.length; i++)
		{
			
			if(max<num[i]){
				max = num[i];
			}
			
			if(min>num[i]) {
				min = num[i];
			}
			
		}
		
		System.out.println("max no. is: "+max);
		System.out.println("min no. is: "+min);

	}

}


