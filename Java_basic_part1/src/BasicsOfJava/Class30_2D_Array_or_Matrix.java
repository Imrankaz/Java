package BasicsOfJava;

import java.util.Scanner;

public class Class30_2D_Array_or_Matrix {
    public static void main(String[] args)
    {
        System.out.println("\n********************\n");
        System.out.println("\n********1D array*******\n");
        System.out.println("\n   int[]num = new int[5];   \n");
        int[]num = new int[5];
        num[0]=1;
        System.out.println("num[0]=1;"+"   or  "+"Value in index/subscript 0 is: "+num[0]);
        // int l = num.length;
        // System.out.println("length of this array is: "+l);
        System.out.println("\n********************\n");
        System.out.println("\n********1D array*******\n");
        System.out.println("\n   int [] num2 = {10,20,30,40};   \n");
        int [] num2 = {10,20,30,40};
        for (int i =0; i <num2.length; i++ ) {
            System.out.println("num2["+i+"] value is :   "+num2[i]);
        }

        System.out.println("\n********************\n");
        System.out.println("\n********2D array*******\n");
        System.out.println("int[][] num3 = new int[row][col];");
        System.out.println("int[][] num3 = new int[2][3];\n\n");
        int[][] num3 = new int[2][3];

        /* [row][col] >> [2][3]

        ---------|   col 0  |   col 1   |   col 2   |
        ---------------------------------------------
        row 0 >> |   0,0    |    0,1    |    0,2    |
        row 1 >> |   1,0    |    1,1    |    1,2    |


        1   2   3
        4   5   6

         */
        num3 [0][0]= 10;
        num3 [0][1]= 20;
        num3 [0][2]= 30;
        num3 [1][0]= 40;
        num3 [1][1]= 50;
        num3 [1][2]= 60;
        //System.out.println(num3[0][1]);

        for (int row =0; row <2; row++ ){
            for (int col =0; col <3; col++ ){
                System.out.println("num3["+row+"]["+col+"] value is :   "+num3[row][col]);
            }
        }
        System.out.println("\n********************\n");
        for (int row =0; row <2; row++ ){
            for (int col =0; col <3; col++ ){
                System.out.print("num3["+row+"]["+col+"] value is :   "+num3[row][col] + "      ");
            }
            System.out.println();
        }
        System.out.println("\n********************\n");
        for (int row =0; row <2; row++ ){
            for (int col =0; col <3; col++ ){
                System.out.print("["+row+"]["+col+"] = "+num3[row][col]+"   |   ");
            }
            System.out.println();
        }

        System.out.println("\n********************\n");
        for (int row =0; row <2; row++ ){
            for (int col =0; col <3; col++ ){
                System.out.print(num3[row][col]+"   |   ");
            }
            System.out.println();
        }

        System.out.println("\n********************\n");
        for (int row =0; row <2; row++ ){
            for (int col =0; col <3; col++ ){
                System.out.print(num3[row][col]);
            }
            System.out.println();
        }

        //System.out.println("\n********************\n");
        /*
        for (int row =0; row <num3.length; row++ ){
            for (int col =0; col < 3; col++ ){
                System.out.println("num3["+row+"]["+col+"] value is :   "+num3[row][col]);
            }
        }
        */
        /*
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("input your age");
        age = input.nextInt();
        System.out.println(age);
        */

        System.out.println("\n*********input into a 2D array***********\n");
        Scanner input =  new Scanner(System.in);
        int[][] num4 = new int[2][3];
        for (int row =0; row <2; row++ ){
            for (int col =0; col <3; col++ ){
                System.out.print("["+row+"]["+col+"] = ");
                num4 [row][col] = input.nextInt();
               // System.out.print("   ");
            }
            System.out.println();
        }

        System.out.println("\n*********Print the inputted 2D array***********\n");
        for (int row =0; row <2; row++ ){
            for (int col =0; col <3; col++ ){
                System.out.print("["+row+"]["+col+"] = "+num4[row][col]+"   |   ");
            }
            System.out.println(); 
        }

    }
}
