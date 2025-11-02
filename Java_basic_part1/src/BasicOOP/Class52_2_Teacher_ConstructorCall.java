package BasicOOP;

public class Class52_2_Teacher_ConstructorCall {
    public static void main(String[] args) {
        //using parametrized Constructor
        Class52_1_Teacher_Constructor teacher1 = new Class52_1_Teacher_Constructor("fdsaf","g",1355);
        teacher1.displayInformation1();

        //using Default Constructor
        Class52_1_Teacher_Constructor teacher2 = new Class52_1_Teacher_Constructor();
        teacher2.displayInformation1();

    }
}
