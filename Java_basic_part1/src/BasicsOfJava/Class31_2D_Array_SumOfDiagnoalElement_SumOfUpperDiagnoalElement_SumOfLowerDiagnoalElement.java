package BasicsOfJava;

import java.util.Scanner;

public class Class31_2D_Array_SumOfDiagnoalElement_SumOfUpperDiagnoalElement_SumOfLowerDiagnoalElement {
    public static void main(String[] args) {

        /* [row][col] >> [2][3]

        ---------|   col 0  |   col 1   |   col 2   |
        row 0 >> |   0,0    |    0,1    |    0,2    |
        row 1 >> |   1,0    |    1,1    |    1,2    |
        row 2 >> |   2,0    |    2,1    |    2,2    |


        1   2   3
        4   5   6
        7   8   9
        */

        System.out.println("/n*********input into a 2D array array1***********/n");
        Scanner input = new Scanner(System.in);
        int[][] array1 = new int[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("[" + row + "][" + col + "] = ");
                array1[row][col] = input.nextInt();
                // System.out.print("   ");
            }
            System.out.println();
        }

        System.out.println("/n*********Print the inputted 2D array array1***********/n");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("[" + row + "][" + col + "] = " + array1[row][col] + "   |   ");
            }
            System.out.println();
        }

        int SumOfDiagnoalElement = 0;
        int SumOfUpperDiagnoalElement = 0;
        int SumOfLowerDiagnoalElement = 0;

        System.out.println("/n*********2D_Array_SumOfDiagnoalElement_SumOfUpperDiagnoalElement_SumOfLowerDiagnoalElement***********/n");

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                if (row == col) {
                    SumOfDiagnoalElement = SumOfDiagnoalElement + array1[row][col];

                }
                if (row < col) {
                    SumOfUpperDiagnoalElement = SumOfUpperDiagnoalElement + array1[row][col];

                }
                if (row > col) {
                    SumOfLowerDiagnoalElement = SumOfLowerDiagnoalElement + array1[row][col];

                }

            }

        }
        System.out.println("SumOfDiagnoalElement is : " + SumOfDiagnoalElement);
        System.out.println("SumOfUpperDiagnoalElement is : " + SumOfUpperDiagnoalElement);
        System.out.println("SumOfLowerDiagnoalElement is : " + SumOfLowerDiagnoalElement);

    }
}
