package BasicsOfJava;
import java.util.Arrays;
import java.util.Scanner;
public class Class27_String_forloop_forEachloop_Assending_Dessending_length_equals_equalsIgnoreCase_contains_Empty_Addition_concat_trim_charAt_codePointAt_indexOf_lastIndexOf_lastIndexOf_replace_split_StringBuffer_StringBound_append_reverse_delete_setLength {
	private static Scanner input;
	public static void main(String[] args)
	{
		System.out.println("Class27_String_forloop_forEachloop_Assending_Dessending_length_equals_equalsIgnoreCase_contains_Empty_Addition_concat_trim_charAt_codePointAt_indexOf_lastIndexOf_lastIndexOf_replace_split_StringBuffer_StringBound_append_reverse_delete_setLength");
		System.out.println("String inputting,for loop, for each loop, Assending, Dessending, \n	s1.length();  s2.equals(s3)    s1.equalsIgnoreCase(s2)    s1.contains(\\\"hel\\\")    isEmpty(); \n	String Addition  =>  concat();	\n	str.trim();    str.charAt(3);	str.codePointAt(4); 	\n	str.indexOf('s'); 	str.lastIndexOf('s'); 	str.replace('i','z');	str2.split(\\\" \\\");	\n	String Buffer , String Bound, sb.append(),  sb.reverse();  sb.delete(0, 10);	setLength(10); ");
		
		System.out.println("using Switch Case");
		input = new Scanner(System.in);
		
		int n;
		System.out.println("input an int digit from (0 to 10):");
		
		n = input.nextInt();
		
		switch(n) {
		
		
				
				case 0:
					System.out.println("case no zero:");
					System.out.println("Input String index by index separetly");
					
					String[] names = new String[5];
					
					names[0]= "avsb_kfdjvnfkd vdfjknvkdf211323";
					names[1]= "bvsb";
					names[2]= "cvsb";
					names[3]= "dvsb";
					names[4]= "evsb";
					
					System.out.println("Value in index 3 is: "+names[3]);
					System.out.println("/n***********/n");
					
					System.out.println("String is: \n");
					for (int i=0; i<names.length; i++)
					{
						System.out.println(names[i]);
					
					}
					System.out.println("/n********************/n");

					break;

				case 1:
					System.out.println("case no one");
					char[] name = {'a','s','i','f'};
					System.out.println("string using char[] is : "+name);

					break;






				case 2:
						System.out.println("case no two: ");
						System.out.println("Input String in one line");

						String[] names2 = {"afdv","bdsd","csdcs","dafad","edscds"};
						System.out.println("length of this string is: "+names2.length);

						for (int i=0; i<names2.length; i++)
						{
							System.out.println(names2[i]);

						}
						System.out.println("/n********************/n");

						break;


					
					
				case 3:
					System.out.println("case no three");
					System.out.println("For Eich loop");
					System.out.println("Output String using for Each Loop; For each loop don't need conditions");
					

					String[] names3 = {"afdv13","bdsd","csdcs","dafad","edscds"};
					System.out.println("length of this string is: "+names3.length);
					
					for (String x: names3 )
					{
						System.out.println(x);
					
					}
					System.out.println("/n********************/n");
					break;
					
					
					
					
					
				case 4:
					System.out.println("case no four");
					System.out.println("Sorting-String- Assending or Desinding");
	               	 
                	String[] D = {"afdv13","bdsd","csdcs","dafad","edscds"};
               	 
       	 
                	Arrays.sort(D);
               	 
                	System.out.println("Assending result is :  ");
                	for(int i=0;i<5;i++)
                	{
                    	System.out.println(" "+D[i]);
                	}
                	System.out.println();
                	System.out.println("Dessending result is :  ");
                	for(int i=4;i>=0;i--)
                	{
                    	System.out.println(" "+D[i]);
                	}
               	 
               	 
                	System.out.println("\n*******************\n");
												
					break;
					
					
					
					
				case 5:
					System.out.println("case no five");
					System.out.println("s1.length();  s2.equals(s3)    s1.equalsIgnoreCase(s2)    s1.contains(\"hel\")    isEmpty()");
					
					String s1="hello";
					String s3="Hello";
					String s2 = new String("Hello");
					
					//**********************//
					int length = s1.length();
					System.out.println("Length of this array s1 is: "+length);
					
					//**********************//
					System.out.println("s1 == s2 :");
					if(s1.equals(s2)) {
						System.out.println("true");
					}
					else {
						System.out.println("False");
					}
					//**********************//
					System.out.println("s2 == s3 :");
					if(s2.equals(s3)) {
						System.out.println("true");
					}
					else {
						System.out.println("False");
					}
					
					//**********************//
					System.out.println("using equalsIgnoreCase   s1 == s2 :");  //s1.equalsIgnoreCase(s2)
					if(s1.equalsIgnoreCase(s2)) {
						System.out.println("true");
					}
					else {
						System.out.println("False");
					}
					
					//**********************//
					System.out.println("s1 contains all the values of s2 ??: ");
					if(s1.contains(s2)) {
						System.out.println("true");
					}
					else {
						System.out.println("False");
					}
					
					//**********************//
					System.out.println("s1 contains 'dc' : ");
					if(s1.contains("dc")) {
						System.out.println("true");
					}
					else {
						System.out.println("False");
					}
					
					//**********************//
					System.out.println("s1 contains 'hel' : ");
					if(s1.contains("hel")) {
						System.out.println("true");
					}
					else {
						System.out.println("False");
					}
					
					//**********************//
					System.out.println("contains this:  ");
					
					boolean con = s1.contains("llo");
					System.out.println(con);
					
					//**********************//
					System.out.println("this array is empty :  ");
					boolean em = s1.isEmpty();
					System.out.println(em);
		
					break;
					
					
					
					
				case 6:
					System.out.println("case no six");
					System.out.println("String Addition  =>  concat()");
					
					
					String firstName = "Imran";
					String LastName = " Hossain";
					
					System.out.println("\n**************\n");
					String FullName = firstName + LastName;
					
					System.out.println(FullName);
					
					System.out.println(" Full name is: "+FullName+"\n age is: "+20);
					
					System.out.println("\n**************\n");
					String FullName2 = firstName.concat(LastName); 
					System.out.println(FullName2);
			
					
					break;
					
					
					
					
				case 7:
					System.out.println("case no seven");
					System.out.println("str.trim();    str.charAt(3);	str.codePointAt(4); 	str.indexOf('s'); 	str.lastIndexOf('s'); 	str.replace('i','z');	str2.split(\" \");");
					
					String str = "   this is1       Bangladesh    ";
					System.out.println(str);
					
					System.out.println("\n**************\n");
					String trim_1 = str.trim();
					System.out.println("After 'trim' the value of string trim is  :"+trim_1);
					
					System.out.println("\n**************\n");
					char charAt_1 = str.charAt(3);
					System.out.println("str.charAt(3);"+charAt_1);
					
					System.out.println("\n**************\n");
					char charAt_2 = trim_1.charAt(3);
					System.out.println("trim_1.charAt(3);"+charAt_2);

					System.out.println("\n**************\n");
					char charAt_3 = str.charAt(4);
					System.out.println("trim_1.charAt(4);"+charAt_3);
					
					System.out.println("\n**************\n");
					int ascii_value_1 = str.codePointAt(4);		// showing ascii value of that character "h"
					System.out.println("str.codePointAt(4);"+ascii_value_1);
					
					System.out.println("\n**************\n");
					ascii_value_1 = trim_1.codePointAt(4);
					System.out.println("trim_1.codePointAt(4);"+ascii_value_1);
					
					System.out.println("\n**************\n");
					int pos1 = str.indexOf('s');
					System.out.println("str.indexOf('s');"+pos1);
					
					pos1 = str.indexOf("an");
					System.out.println("str.indexOf('s');"+pos1);
					
					System.out.println("\n**************\n");
					int pos_2 = str.lastIndexOf('s');
					System.out.println("str.lastIndexOf('s');"+pos_2);
					
					System.out.println("\n**************\n");
					String str2 = str.replace('i','z');
					System.out.println("str.replace('i','z');"+str2);
					
					System.out.println("\n**************\n");
					String[] str3 = str2.split(" ");	//per space " " e 1 ta kore line katbe;
					
					for(String x : str3) {
						System.out.println("str2.split(\" \");"+x);
					}
					
					
					
					
					break;
					
				case 8:
					System.out.println("case no eight");
					System.out.println("String Buffer , String Bound, sb.append(),  sb.reverse();  sb.delete(0, 10);	setLength(10); ");
					
					str = "this is1   Bangladesh.";
					System.out.println("normal String str = "+str);
					
					System.out.println("\n**************\n");
					StringBuffer sb = new StringBuffer("this is1   Bangladesh.");
					System.out.println("StringBuffer sb = "+sb);
					
					System.out.println("\n**************\n");
					System.out.println("string uning stringBuffer and sb.append(): ");
					sb.append(" it's ");			//append works like addition; it merzes the full string; and show all strings under 'sb', combindly;
					sb.append("countrycode is : ");
					sb.append(880);
					System.out.println("string value is: \n"+sb);
					
					System.out.println("\n**************\n");
					
					sb.reverse();
					System.out.println("reversed string value is: \n"+sb);
					
					System.out.println("\n**************\n");
					sb.delete(0, 10);
					System.out.println("Deleted string value is: \n"+sb);
					
					sb.delete(0, 100);
					System.out.println("Deleted all string values in sb : \n"+sb);
					
					System.out.println("\n**************\n"); //assigning values in string;
					StringBuffer sc = new StringBuffer(str);
					System.out.println(sc);
					sb.append(str);
					System.out.println("string value is: \n"+sb);
					
					System.out.println("\n**************\n");
					sb.setLength(10);				//1st 10 digits will stay;	
					System.out.println("After setting length, string value for length(10) is: \n"+sb);
					
					
					
				case 9:
					System.out.println("case no none");
					System.out.println("convert StringBuffer to string: sb1.reverse().toString();");
					System.out.println("palindrome, if reverse is same as inputted string");
					
					str = "madam";
					System.out.println("str:	"+str);
					StringBuffer sb1 = new StringBuffer(str);
					System.out.println("sb1:	"+sb1);
					
					String s = sb1.reverse().toString();
					
					System.out.println(s);
					
					if(str.equals(s)) {
						System.out.println("palindrome");
					}
					else {
						System.out.println("not palindrome");
					}
					
					break;
					
				case 10:
					System.out.println("case no ten");
					
					break;
					
					
				default: 		//works like else;
					System.out.println("not a digit");		
		
		
		
		}
		
		
		
	}

}


