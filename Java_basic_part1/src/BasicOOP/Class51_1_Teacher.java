package BasicOOP;

public class Class51_1_Teacher {
    String name, gender; //variable
    int phone;  //variable

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
        name = n;
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
