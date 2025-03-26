package BasicsOfJava;


public class Class02_P1_print_println_commenting_escapeSequence {

    public static void main(String[] args) {
   	 
		 System.out.println("hello it's class2");
		 System.out.print("\"using (print)\", print without new line,");
		 System.out.println("but (println) works as new line after print");
		 System.out.println("using (println), see");

		//--------------------------------------------------------------------------------------------------------
		 System.out.print("******\n");
		 System.out.print(" line1 \n line2 \n line3 \n");       // "\n" = new line
		 System.out.print("line1 \\n line2 \\n line3 \\n \n");  // “\n” print
		 System.out.println("line1 \t line2 \t line3 \t");         // "\t" = tab space; 1tab =4 spaces


		 System.out.print("******\n");
		 System.out.print(" \"hello\" ");    // printing ("...") = \" ..... \"



		 System.out.print("\n******\n");
		 System.out.print("int value print");
		 System.out.print(5);   	 //int value automatically print

		//--------------------------------------------------------------------------------------------------------
		 System.out.print("\n******\n");
		 System.out.println("commenting");

		System.out.println(	"commenting types: >>	\n" +
							"single line comment	\n" +
							"multiple line comment	\n" +
							"Documentational comment\n");


		//single line comment

		 //System.out.println("//single line comment");


		 /* multiple line comment
			vdfnjndkjbdfbldfbdl
			dfvndfvndflvndflvkdf
		  */

		 /**
		    Documentational comment
		 */


		 /*
		 The slash (/) or forward slash (/) and backslash (\)
		 */



		//--------------------------------------------------------------------------------------------------------
		 System.out.print("\n******\n");

		 System.out.println("using (printf)");

		 boolean b = true;
		 char    c = 'c';   // must be 1 character;
		 short   s = 32677;
		 int     i = 12345;
		 float   f = 10.2f; // must have to write "f" after digit;
		 double  d = 10.2;

		 System.out.printf("value of boolean b  = %b \n",b);
		 System.out.printf("value of char    c  = %c \n",c);
		 System.out.printf("value of short   s  = %d \n",s);
		 System.out.printf("value of int     i  = %d \n",i);
		 System.out.printf("value of float   f  = %f \n",f);
		 System.out.printf("value of double  d  = %f \n",d);

		 System.out.print("\n******\n");
		 System.out.printf("(count only 1 digit after(.fraction)) value of float   f  = %.1f \n",f);
		 System.out.printf("(count only 1 digit after(.fraction)) value of double  d  = %.3f \n",d);
		 System.out.print("******\n");
		 System.out.print("******\n");



		//--------------------------------------------------------------------------------------------------------
		 System.out.println("Escape Sequence");
		 System.out.println("\"\\b\"       \"\\t\"      \"\\n\"       \"\\'\"       \"\\\"\"     \"\\\"" );
		 System.out.println("abc\bdef");
		 System.out.println("abc\tdef");
		 System.out.println("abc\ndef");
		 System.out.println("abc\rdef");
		 System.out.println("abc\"def");
		 System.out.println("abc\'def");
		 System.out.println("abc\\def");

    }

}


