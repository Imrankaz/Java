package BasicOOP;

public class Class51_2_TeacherObject1 {
    public static void main(String[] args) {

        //-------------------------------------------------------------------
        Class51_1_Teacher teacher1;           // object declare
        teacher1 = new Class51_1_Teacher();   //object create // must be under psvm

        teacher1.name = "abc";
        teacher1.gender="male";
        teacher1.phone = 163155614;

        System.out.println(teacher1.name);
        System.out.println(teacher1.gender);
        System.out.println(teacher1.phone);

        //-------------------------------------------------------------------
        Class51_1_Teacher teacher2 = new Class51_1_Teacher();   //object declare & create // must be under psvm
        teacher2.name = "defg";
        teacher2.gender = "female";
        teacher2.phone = 3152323;

        System.out.println(teacher2.name);
        System.out.println(teacher2.gender);
        System.out.println(teacher2.phone);

        //-------------------------------------------------------------------
        Class51_1_Teacher teacher3 = new Class51_1_Teacher();   //object declare & create // must be under psvm

        teacher3.name = "ghijkl";
        teacher3.gender="male";
        teacher3.phone = 99999;

        teacher3.displayInformation1();     // using non peramitarized method

        //-------------------------------------------------------------------
        Class51_1_Teacher teacher4 = new Class51_1_Teacher();   //object declare & create // must be under psvm

        teacher4.setInformation1("dfs", "F", 31531);     // using peramitarized method

        //-------------------------------------------------------------------
        Class51_1_Teacher teacher5 = new Class51_1_Teacher();   //object declare & create // must be under psvm

        teacher5.setInformation2("wer", "M", 682413);     // using peramitarized method
        teacher5.displayInformation1();

        //-------------------------------------------------------------------
        Class51_1_Teacher teacher6 = new Class51_1_Teacher();   //object declare & create // must be under psvm

        teacher6.setInformation3("wer2", "O", 123145);     // using peramitarized method

        //-------------------------------------------------------------------
        Class51_1_Teacher teacher7 = new Class51_1_Teacher();   //object declare & create // must be under psvm
        // will show null value
        teacher7.setInformation4("wer3", "O2", 231456);     // using peramitarized method
        //-------------------------------------------------------------------
        //teacher8 = new Class51_1_Teacher();   //object declare & create // must be under psvm
        // will show null value
        teacher7.setInformation4("wer3", "O2", 231456);
        //-------------------------------------------------------------------
        //-------------------------------------------------------------------
        //-------------------------------------------------------------------
        //-------------------------------------------------------------------
        //-------------------------------------------------------------------
        //-------------------------------------------------------------------
        //-------------------------------------------------------------------
        //-------------------------------------------------------------------


    }



}
