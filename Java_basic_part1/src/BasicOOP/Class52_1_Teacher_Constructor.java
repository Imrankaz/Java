package BasicOOP;

public class Class52_1_Teacher_Constructor {
    String name, gender; //variable
    int phone;  //variable

    //Constructor is a special type of method
    //Constructor has no return type, not even void

    //Default Constructor
    Class52_1_Teacher_Constructor(){
        System.out.println("Default Constructor");
        System.out.println();
    }


    //Here we are using parametrized Constructor1
    Class52_1_Teacher_Constructor(String n, String g, int ph)
    {
        name = n;
        gender = g;
        phone = ph;
    }

    //parametrized Constructor2 & Constructor Overloading
    Class52_1_Teacher_Constructor(String n, String g)
    {
        name = n;
        gender = g;
    }

    //method
    void displayInformation1()
    {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(phone);
        System.out.println();
    }
}
