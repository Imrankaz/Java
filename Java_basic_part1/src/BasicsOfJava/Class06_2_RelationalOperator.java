package BasicsOfJava;

import java.util.Scanner;

public class Class06_2_RelationalOperator {
    public static void main(String[] args) {
        /*
        Examples of relational operators :
            == Equality operator, returns true if both operands are equal
            != Non-equality operator
            <: Less than operator
            >: Greater than operator
            <= Less than or equal to operator
            >= Greater than or equal to operator
         */

        Scanner input = new Scanner(System.in);
        //int s = input.nextInt();
        System.out.println("input \"op1\" value");
        double op1 = input.nextDouble();
        System.out.println("input \"op2\" value");
        double op2 = input.nextDouble();

        if (op1 > op2){
            System.out.println("op1 is greater than op2");
        }
        if (op1 >= op2){
            System.out.println("op1 is greater or equal to op2");
        }
        if (op1 < op2){
            System.out.println("op1 is less than op2");
        }
        if (op1 <= op2){
            System.out.println("op1 is less or equal to op2");
        }
        if (op1 == op2){
            System.out.println("op1 is equal to op2");
        }
        if (op1 != op2){
            System.out.println("op1 is not equal to op2");
        }
        else {
            System.out.println("error");
        }
    }
}
