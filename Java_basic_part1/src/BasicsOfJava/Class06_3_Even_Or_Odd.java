package BasicsOfJava;

import java.util.Scanner;

public class Class06_3_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input \"op\" value");
        double op = input.nextDouble();

        if (op % 2 == 0) {
            //System.out.println("op is \"Even\"/\"Jor\"/\"0\"");
            if (op == 0) {
                System.out.println("op is \"0\"/\"Zero\"");
            }
            else {
                System.out.println("op is \"Even\"/\"Jor\"");
            }
        }
        else if (op % 2 != 0) {
            System.out.println("op is \"Odd\"/\"Bijor\"");
        }
    }
}
