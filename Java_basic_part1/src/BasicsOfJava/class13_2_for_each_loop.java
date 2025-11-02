package BasicsOfJava;

public class class13_2_for_each_loop {
    public static void main(String[] args) {
        int [] num2 = {10,20,30,40,50,60,70,80,90,100};
        int sum2 =0;
        for(int x : num2)
        {
            System.out.println("x = "+ x);
            sum2 = sum2+x;

        }
        System.out.println("Summation of num2 is: "+sum2);

    }
}

