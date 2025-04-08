package BasicsOfJava;

import java.util.Scanner;

public class Class17_1_Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial");

        System.out.println("-------------------------------------------------------");
        System.out.println("for loop syntax : ");
        System.out.println("for(initialization, condition, increment / decrement){\n          statements(s); \n }");
        System.out.println("-------------------------------------------------------");
        System.out.println("while loop syntax : ");
        System.out.println("-------------------------------------------------------");
        System.out.println(" initialization \n while(condition){  \n      statements(s); \n      increment/decrement; \n }");
        System.out.println("-------------------------------------------------------");
        System.out.println("do-while loop syntax : ");
        System.out.println("-------------------------------------------------------");
        System.out.println(" initialization \n do{  \n      statements(s); \n      increment/decrement; \n } while(condition)   \n");
        System.out.println("-------------------------------------------------------");

        int n, factorial;
        Scanner input = new Scanner(System.in);
        System.out.println("input an int factorial digit: ");
        n = input.nextInt();
        factorial=1;


        System.out.println("-------------------------------------------------------");
        System.out.println("Print 1 to 10 and show the sum of them");

        for (int i=n;i>=1;i--){
            System.out.println("i = "+i);
            factorial = factorial*i;
            System.out.println("factorial = "+ factorial);
        }

        System.out.println("Loop Ended");
        System.out.println("final factorial value of   \""+n+"\"   is = "+ factorial);

    }
}
