package BasicsOfJava;
import java.util.Scanner;
public class Class31_2D_Array_AdditionOrSummation {

    public static void main(String[] args)
    {

        /*
        --------------------------------------------------
        [row][col] >> [2][3]

        ---------|   col 0  |   col 1   |   col 2   |
        row 0 >> |   0,0    |    0,1    |    0,2    |
        row 1 >> |   1,0    |    1,1    |    1,2    |

        --------------------------------------------------
        1   2   3
        4   5   6
        --------------------------------------------------


        */

        System.out.println("/n*********input into a 2D array array1***********/n");
        Scanner input =  new Scanner(System.in);
        int[][] array1 = new int[2][3];
        for (int row =0; row <2; row++ ){
            for (int col =0; col <3; col++ ){
                System.out.print("["+row+"]["+col+"] = ");
                array1 [row][col] = input.nextInt();
                // System.out.print("   ");
            }
            System.out.println();
        }

        System.out.println("/n*********Print the inputted 2D array array1***********/n");
        for (int row =0; row <2; row++ ){
            for (int col =0; col <3; col++ ){
                System.out.print("["+row+"]["+col+"] = "+array1[row][col]+"   |   ");
            }
            System.out.println();
        }

        System.out.println("/n*********input into a 2D array array2***********/n");
        int[][] array2 = new int[2][3];
        for (int row =0; row <2; row++ ){
            for (int col =0; col <3; col++ ){
                System.out.print("["+row+"]["+col+"] = ");
                array2 [row][col] = input.nextInt();
                // System.out.print("   ");
            }
            System.out.println();
        }

        System.out.println("/n*********Print the inputted 2D array array2***********/n");
        for (int row =0; row <2; row++ ){
            for (int col =0; col <3; col++ ){
                System.out.print("["+row+"]["+col+"] = "+array2[row][col]+"   |   ");
            }
            System.out.println();
        }


        System.out.println("\n\n");
        System.out.println("/n*********Addition or summation of two 2D array (array1+array2)***********/n");
        System.out.println("have to use bracket for adding 2 arrays");
        for (int row =0; row <2; row++ ){
            for (int col =0; col <3; col++ ){
                System.out.print("["+row+"]["+col+"] = "+(array1[row][col] + array2[row][col])+"   |   "); // have to use bracket for adding 2 arrays
            }
            System.out.println();
        }

        System.out.println("\n    or       \n");
        System.out.println("/n*********Addition or summation of two 2D array (array1+array2)***********/n");
        for (int row =0; row <2; row++ ){
            for (int col =0; col <3; col++ ){
                int[][] array3 = new int[2][3];
                array3 [row][col] = array1[row][col] + array2[row][col];
                System.out.print("["+row+"]["+col+"] = "+ array3[row][col] +"   |   ");
            }
            System.out.println();
        }


    }
}

