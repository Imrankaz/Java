package BasicOOP;

import org.w3c.dom.ls.LSOutput;

public class Class54_2_StaticOb1 {
    public static void main(String[] args) {
        Class54_1_Static1 ob1 = new Class54_1_Static1();
        System.out.println(ob1.University1); // for  non-static values have to call by object

        System.out.println(Class54_1_Static1.University2); // for static values, can call by using only class name
        //System.out.println(Class54_1_Static1.University1); //error
    }


}
