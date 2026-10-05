package BasicOOP;

public class Class52_2_Teacher_ConstructorCall {
    public static void main(String[] args) {
        //using Default Constructor
        Class52_1_Teacher_Constructor teacher_ob1 = new Class52_1_Teacher_Constructor(); // auto call (Constructor)
        teacher_ob1.displayInformation1(); //null, null, 0 // have to call methods

        //using parametrized Constructor1
        Class52_1_Teacher_Constructor teacher_ob2 = new Class52_1_Teacher_Constructor("Anis","Male",01777777777); // auto call (Constructor)
        teacher_ob2.displayInformation1();// have to call methods

        //parametrized Constructor2 & Constructor Overloading
        Class52_1_Teacher_Constructor teacher_ob3 = new Class52_1_Teacher_Constructor("Ana","Female"); //Constructor is auto called
        teacher_ob3.displayInformation1(); // have to call methods
    }
}
