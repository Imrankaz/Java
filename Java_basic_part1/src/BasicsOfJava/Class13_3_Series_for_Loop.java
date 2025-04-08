package BasicsOfJava;
import java.util.Scanner;
//public static Scanner input;

public class Class13_3_Series_for_Loop {
    ///private static Scanner input;
    public static void main(String[] args) {
        System.out.println("Series");

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

        int n, sum;
        Scanner input = new Scanner(System.in);
        System.out.println("input an int last digit: ");
        //n = input.nextInt();
        sum=0;


        System.out.println("-------------------------------------------------------");
        System.out.println("Print 1 to 10 and show the sum of them");

        for (int i=0;i<=10;i++){
            System.out.println("i = "+i);
            sum = sum+i;
            System.out.println("sum = "+ sum);
        }

        System.out.println("Loop Ended");
        System.out.println("final sum = "+ sum);




        System.out.println("-------------------------------------------------------");
        System.out.println("Print 0 to n and show the sum of them");
        sum=0;
        n = input.nextInt();

        for (int i=0;i<=n;i++){
            System.out.println("i = "+i);
            sum = sum+i;
            System.out.println("sum = "+ sum);
        }

        System.out.println("Loop Ended");
        System.out.println("final sum = "+ sum);





        System.out.println("-------------------------------------------------------");
        System.out.println("Print 1 to n as odd number and show the sum of them");
        sum=0;
        n = input.nextInt();

        for (int i=1;i<=n;i=i+2){
            System.out.println("i = "+i);
            sum = sum+i;
            System.out.println("sum = "+ sum);
        }

        System.out.println("Loop Ended");
        System.out.println("final sum = "+ sum);





        System.out.println("-------------------------------------------------------");
        System.out.println("Print 0 to n as even number and show the sum of them");
        sum=0;
        n = input.nextInt();

        for (int i=0;i<=n;i=i+2){
            System.out.println("i = "+i);
            sum = sum+i;
            System.out.println("sum = "+ sum);
        }

        System.out.println("Loop Ended");
        System.out.println("final sum = "+ sum);




        System.out.println("-------------------------------------------------------");
        System.out.println("Print 1.5 to n and show the sum of them");
        double n2, sum1;
        sum1 = 0.0;
        n2 = input.nextDouble();

        for (double i=1.5;i<=n2;i=i+1){
            System.out.println("i = "+i);
            sum1 = sum1+i;
            System.out.println("sum = "+ sum1);
        }

        System.out.println("Loop Ended");
        System.out.println("final sum = "+ sum1);



        System.out.println("-------------------------------------------------------");
        System.out.println("Print 1 to n and show the power of 2 or square value of them and show the sum of them");
        sum=0;
        n = input.nextInt();
        double sum2 =0;
        int power = input.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println("i = "+i);
            System.out.println("i*i = "+ i*i);
            sum = sum+(i*i);
            sum2 = sum2 + (Math.pow(i,power));

            if (sum == sum2)
            {
                System.out.println("sum = "+ sum);
            }

        }

        System.out.println("Loop Ended");




        System.out.println("-------------------------------------------------------");
        System.out.println("Print 1 to n and show the multiplication of them");
        double mul=1;
        n = input.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println("i = "+i);
            mul = mul*i;
            System.out.println("multiplication = "+ mul);
        }

        System.out.println("Loop Ended");
        System.out.println("final sum = "+ mul);




        System.out.println("-------------------------------------------------------");
        System.out.println("Print 1 to n as odd number and show the multiplication of them");
        mul=1;
        n = input.nextInt();

        for (int i=1;i<=n;i=i+2){
            System.out.println("i = "+i);
            mul = mul*i;
            System.out.println("multiplication = "+ mul);
        }

        System.out.println("Loop Ended");
        System.out.println("final multiplication = "+ mul);



        System.out.println("-------------------------------------------------------");
        System.out.println("Print 1.5 to n and show the multiplication of them");
        double mul2;
        mul2 = 1;
        n2 = input.nextDouble();

        for (double i=1.5;i<=n2;i=i+1){
            System.out.println("i = "+i);
            mul2 = mul2+i;
            System.out.println("multiplication = "+ mul2);
        }

        System.out.println("Loop Ended");
        System.out.println("final multiplication = "+ mul2);




        System.out.println("-------------------------------------------------------");
        System.out.println("Print 1 to n and show the power of 2 or square value of them and show the multiplication of them");
        n = input.nextInt();
        mul2= 1;mul = 1;
        power = input.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println("i = "+i);
            System.out.println("i*i = "+ i*i);
            mul = mul*(i*i);
            mul2 = mul2 * (Math.pow(i,power));

            if (mul == mul2)
            {
                System.out.println("multiplication = "+ mul2);
            }

        }

        System.out.println("Loop Ended");
        System.out.println("final multiplication = "+ mul2);


        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");


    }
}
