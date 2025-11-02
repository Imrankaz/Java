package BasicsOfJava;
import java.util.Scanner;
public class Class19_Prime_no {
    private static Scanner input;
    public static void main(String[] args) {

        System.out.println("prime number");
        System.out.println(	"A prime number is a number greater than 1 that has only two divisors: 1 and itself.\n" +
                "Examples: 2, 3, 5, 7, 11, 13, ...");
        System.out.println("All prime numbers from \"m\" to \"n\" are: ");

        input = new Scanner(System.in);
        int m,n, count = 0;

        System.out.println("input Starting digit: ");
        m = input.nextInt();

        System.out.println("input Ending digit: ");
        n = input.nextInt();

        if(m>n) {			//Swapping, if anyone input large no. first and small no. at last.
            int t=m;
            m=n;
            n=t;
        }

        else {}

        System.out.println("/n*********/n");
        System.out.println("All prime numbers from "+m+ " to "+n+ " are: ");
        //here m=small, n=large
        boolean isPrime = true;

        if (m <= 1 || n <= 1) {
            isPrime = false;
            System.out.println(m+ " or "+n+ " is not a prime number");
        } else {
            for (int j = m; j <= n; j++) {
                for (int i = 2; i <= j - 1; i++) {
                    if (j % i == 0) {
                        count++;
                        break;
                    }

                }

                if (count == 0) {
                    System.out.println(j);
                }
                count = 0;
                //System.out.println("/n*********/n");
            }
        }

        //System.out.println("Prog End");


    }

}

