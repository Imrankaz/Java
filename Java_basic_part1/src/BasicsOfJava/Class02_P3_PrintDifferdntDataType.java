package BasicsOfJava;

import java.util.Scanner;

public class Class02_P3_PrintDifferdntDataType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("input your name");
//        name = input.next();          // input >> dfsaf gff ee e 1
//        System.out.println(name);     // only prints 1st part before space v "dfsaf"
        name = input.nextLine();        // input >> dfsaf gff ee e 1
        System.out.println(name);       // prints full line "dfsaf gff ee e 1"
    }
}
