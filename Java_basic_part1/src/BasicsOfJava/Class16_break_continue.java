package BasicsOfJava;


public class Class16_break_continue
{
	public static void main(String[] args) {

		
		
		System.out.println("Break");
		
		for(int i=0; i<=10; i++)
		{
			if(i==5)
			{
				break;       //print from 0 to 4;
			}
			System.out.println(i);
		}
		
		System.out.println("\n******\n");
		//**************************************************
		System.out.println("\n******\n");

		
		System.out.println("Continue");
		
		for(int j=0; j<=10; j++)
		{
			if(j==5)
			{
				continue;		// print from 0 to 10, without 5;
			}
			System.out.println(j);
		}
		
		
		System.out.println("\n******\n");

		for(int i=0; i<=20; i=i+2)
		{
			if(i==10)
			{
				continue;     //print without 10;
			}
			if(i>16)
			{
				break;		// print from 0 to 16;
			}

			System.out.println(i);
		}
		
		
	}

}

