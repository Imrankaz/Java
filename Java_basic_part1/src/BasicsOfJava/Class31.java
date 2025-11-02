package BasicsOfJava;


public class Class31 {
    public static void main(String[] args) {
        System.out.println("array print");
        System.out.println("/n*********1**********/n");
        int firstValue =0;
        int[][] num1 = new int[4][5];
        for (int row =0; row <4; row++ ){
            for (int col =0; col <5; col++ ){

                //System.out.print("["+row+"]["+col+"] = ");
                num1 [row][col] = firstValue;
                System.out.print("  "+num1 [row][col]+ "   ");
                firstValue++;
            }
            System.out.println();
        }

        System.out.println("/n*********2**********/n");
        int firstValue2 =0;
        int[][] num2 = new int[4][4];
        for (int row =0; row <4; row++ ){
            for (int col =0; col <=row; col++ ){

                //System.out.print("["+row+"]["+col+"] = ");
                num2 [row][col] = firstValue2;
                /*if(firstValue2==6){
                    //num2 [row][col] = firstValue2++;
                    //continue;
                    //break;
                }*/
                if(firstValue2!=6){
                    System.out.print("  "+num2 [row][col]+ "   ");

                }
                firstValue2++;

            }
            System.out.println();
        }
    }
}
