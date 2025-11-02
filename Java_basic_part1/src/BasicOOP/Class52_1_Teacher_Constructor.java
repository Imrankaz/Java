package BasicOOP;

public class Class52_1_Teacher_Constructor {
    String name, gender; //variable
    int phone;  //variable

    //Constructor is a special type of method
    //Constructor has no return type, not even void
    //Here we are using parametrized Constructor
    Class52_1_Teacher_Constructor(String n, String g, int ph)
    {
        name = n;
        gender = g;
        phone = ph;
    }

    //Default Constructor
    Class52_1_Teacher_Constructor(){
        System.out.println("djfloaifjdiopsfjadios");
        System.out.println();
    }

    //default method
    void displayInformation1()
    {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(phone);
        System.out.println();
    }



}
