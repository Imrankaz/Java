package BasicsOfJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Class25_Array {

	public static void main(String[] args)
	{
		int[]num = new int[5];
		num[0]=1;
		System.out.println("Value in index/subscript 0 is: "+num[0]);
		num[1]=2;
		num[2]=3;
		num[3]=4;
		num[4]=5;
		
		int sum;
		sum = num[0]+num[1]+num[2]+num[3]+num[4];
		System.out.println("summation is: "+sum);
		
		int l = num.length;
		System.out.println("length of this array is: "+l);
		
		
		System.out.println("/n********************/n");
		
		
		int [] num2 = {10,20,30,40,50,60,70,80,90,100};
		int sum2 =0;
		for(int x : num2)   //foreach loop
		{
			System.out.println(x);
			sum2 = sum2+x;
			
		}
		System.out.println("Summation of num2 is: "+sum2);




		System.out.println("/n********************/n");

		int [] num3 = {10,20,40,50,30,80,70,90,60,100,-60};
		Arrays.sort(num3);
		System.out.println(num3 + "showiwng wwrong value, because array will show values indexwise");

		System.out.println("After Ascending num3 values are: " );
		for(int x : num3)   //foreach loop
		{
			System.out.println(x);
		}
	}
}

