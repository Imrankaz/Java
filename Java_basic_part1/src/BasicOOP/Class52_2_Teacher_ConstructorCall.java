package BasicOOP;

public class Class52_2_Teacher_ConstructorCall {
    public static void main(String[] args) {
        //using Default Constructor
        Class52_1_Teacher_Constructor teacher_ob1 = new Class52_1_Teacher_Constructor();
        teacher_ob1.displayInformation1(); //null, null, 0

        //using parametrized Constructor1
        Class52_1_Teacher_Constructor teacher_ob2 = new Class52_1_Teacher_Constructor("Anis","Male",01777777777);
        teacher_ob2.displayInformation1();

        //parametrized Constructor2 & Constructor Overloading
        Class52_1_Teacher_Constructor teacher_ob3 = new Class52_1_Teacher_Constructor("Ana","Female");
        teacher_ob3.displayInformation1();
    }
}
