package BasicsOfJava;

import java.util.Scanner;

public class Class11_Bitwise_Operator {

	public static void main(String[] args) {

		/*
		1. Bitwise Operators in Java
			Operator				Symbol		Description
			Bitwise AND				&			Sets a bit to 1 if both bits are 1.
			Bitwise OR				| 		  	|
			Bitwise XOR				^			Sets a bit to 1 if the bits are different.
			Bitwise NOT				~			Inverts all bits (one’s complement).
			Left Shift				<<			Shifts bits to the left (multiplies by 2).
			Right Shift				>>			Shifts bits to the right (divides by 2).
			Unsigned Right Shift	>>>			Shifts bits right, filling 0 on the left (for positive numbers).
		 */
		
		System.out.println("Bitwise_Operator");
		System.out.println("& (bitwise and)");
		System.out.println("| (bitwise or)");
		System.out.println("^ (bitwise XOR)");
		System.out.println("~ (bitwise NOT)/(bitwise compliment)");
		System.out.println("<< (left shift)");
		System.out.println(">> (right shift)");
		System.out.println(">>> (zero fill right shift)");
		System.out.println("");
		System.out.println("");

		Scanner input = new Scanner(System.in);
		int num1,num2,result;
		System.out.println("input int number 1:");
		num1 = input.nextInt();

		System.out.println("input int number 2:");
		num2 = input.nextInt();

		System.out.println("-----------------------------------------------------------------------------------");
		/*
			Bitwise AND (&)
			Rule: 1 & 1 = 1, otherwise 0.
		 */

		result = num1&num2;
		System.out.println("[bitwise and]	=>		a&b	:	"+result);

		//------------------------------------------------------------------------------
		int a = 5;  // 0101
		int b = 3;  // 0011
		int result2 = a & b; // 0001 (1 in decimal)

		System.out.println("5 & 3 = " + result2); // Output: 1

		/*
			   0101  (5)
			&  0011  (3)
			------------
			   0001  (1)
		 */








		System.out.println("-----------------------------------------------------------------------------------");
		/*
			Bitwise OR (|)
			Rule: 1 | 1 = 1, 1 | 0 = 1, 0 | 0 = 0.
		 */
		result = num1|num2;
		System.out.println("[bitwise or]	=>		a|b	:	"+result);
		//------------------------------------------------------------------------------
		a = 5;  // 0101
		b = 3;  // 0011
		result2  = a | b; // 0111 (7 in decimal)

		System.out.println("5 | 3 = " + result2); // Output: 7

		/*
		  		0101  (5)
			|  	0011  (3)
			------------
			   	0111  (7)
		 */










		System.out.println("-----------------------------------------------------------------------------------");
		result = num1^num2;
		System.out.println("[bitwise XOR]	=>		a^b	:	"+result);

		a = 5;  // 0101
		b = 3;  // 0011
		
		result2 = a ^ b; // 0110 (6 in decimal)

		System.out.println("5 ^ 3 = " + result2); // Output: 6

		/*
			0101  (5)
		^  	0011  (3)
		------------
			0110  (6)
		*/

		//------------------------------------------------------------------------------










		System.out.println("-----------------------------------------------------------------------------------");
		result = -num1;
		System.out.println("[bitwise ~ (NOT/compliment)]	=>		~a	:	"+result);
		System.out.println("or");
		result = -num2;
		System.out.println("[bitwise ~ (NOT/compliment)]	=>		~b	:	"+result);
		//------------------------------------------------------------------------------











		System.out.println("-----------------------------------------------------------------------------------");
		/*
		Rule: x << n → Shifts bits left by n positions (Multiplies by 2^n).

		x << n → x × 2^n = ans
		5 << 2 → 5 × 2^2 = 20

			   0000 0101  (5)
				<<      (shift left 2 times)
			   0001 0100  (20)
		 */
		result = num1<<2;
		System.out.println("[bitwise left shift]	=>		a<<2	:	"+result);
		System.out.println("or");
		result = num2<<2;
		System.out.println("[bitwise left shift]	=>		b<<2	:	"+result);

		System.out.println("x << n → x × 2^n = ans");

		System.out.println("[bitwise left shift]	=>		a<<2	:	"+ (num1*Math.pow(2,2)));
		System.out.println("[bitwise left shift]	=>		a<<3	:	"+ (num1*Math.pow(2,3)));
		System.out.println("or");
		System.out.println("[bitwise left shift]	=>		b<<2	:	"+ (num2*Math.pow(2,2)));
		System.out.println("[bitwise left shift]	=>		a<<3	:	"+ (num2*Math.pow(2,3)));
		//------------------------------------------------------------------------------










		System.out.println("-----------------------------------------------------------------------------------");
		/*
		Rule: x >> n → Shifts bits right by n positions (Divides by 2^n).

		x >> n → x ÷ 2^n = ans

		5 >> 2 → 5 ÷ 2^2 = 1
		20 >> 2 → 20 ÷ 2^2 = 5

			   0001 0100  (20)
				>>      (shift right 2 times)
			   0000 0101  (5)

		 */
		result = num1>>2;
		System.out.println("[bitwise right shift]	=>		a>>2	:	"+result);
		System.out.println("or");
		result = num2>>2;
		System.out.println("[bitwise right shift]	=>		b>>2	:	"+result);

		System.out.println("x >> n → x ÷ 2^n = ans");

		System.out.println("[bitwise right shift]	=>		a>>2	:	"+ (int) (num1/Math.pow(2,2)));
		System.out.println("[bitwise right shift]	=>		a>>3	:	"+ (int) (num1/Math.pow(2,3)));
		System.out.println("or");
		System.out.println("[bitwise right shift]	=>		b>>2	:	"+ (int) (num2/Math.pow(2,2)));
		System.out.println("[bitwise right shift]	=>		b>>3	:	"+ (int) (num2/Math.pow(2,3)));
		//------------------------------------------------------------------------------










		System.out.println("-----------------------------------------------------------------------------------");

		/*
		Unsigned Right Shift (>>>)
		Rule: x >>> n → Shifts bits right and fills 0 from the left.

		Works differently for negative numbers.

		Binary:     1111 1111 1111 1111 1111 1111 1110 1100
		>>> 2:      0011 1111 1111 1111 1111 1111 1111 1011  (Positive large number)
		 */


		result = num1>>>2;
		System.out.println("[bitwise zero fill right shift]	=>		a>>>2	:	"+result);
		System.out.println("or");
		result = num2>>>2;
		System.out.println("[bitwise zero fill right shift]	=>		b>>>2	:	"+result);
		//------------------------------------------------------------------------------

		input.close(); // Close scanner


	}

}
