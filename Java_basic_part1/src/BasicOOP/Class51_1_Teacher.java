package BasicOOP;

public class Class51_1_Teacher {
    String name, gender; //variable // Instance variable
    int phone;  //variable // Instance variable
    //static String University2 = "JU"; // static or class variable // for static values, can call by using only class name

    //non parameterized method or default method
    void displayInformation1()
    {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(phone);
        System.out.println();
    }
    //parameterized method
    void setInformation1(String name, String gender, int phone)
    {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(phone);
        System.out.println();
    }
    void setInformation2(String n, String g, int ph)
    {
        //Local variable >String n, String g, int ph > n, g, ph
        name = n; //Local variable initialization
        gender = g;
        phone = ph;
        System.out.println();
    }
    void setInformation3(String n, String g, int ph)
    {
        name = n;
        gender = g;
        phone = ph;
        System.out.println();
        displayInformation1();
    }
    void setInformation4(String name, String gender, int phone)
    {
        // it won't work though declader variable and variable name is same.
        name = name;
        gender = gender;
        phone = phone;
        System.out.println();
        displayInformation1();
    }

}
