package BasicOOP;

public class Class51_2_TeacherObject1 {
    public static void main(String[] args) {

        //-------------------------------------------------------------------
        Class51_1_Teacher teacher_ob1;           // object declare
        teacher_ob1 = new Class51_1_Teacher();   //object create // must be under psvm

        teacher_ob1.name = "abc";
        teacher_ob1.gender="male";
        teacher_ob1.phone = 163155614;

        System.out.println(teacher_ob1.name);
        System.out.println(teacher_ob1.gender);
        System.out.println(teacher_ob1.phone);

        //-------------------------------------------------------------------
        Class51_1_Teacher teacher_ob2 = new Class51_1_Teacher();   //object declare & create // must be under psvm
        teacher_ob2.name = "defg";
        teacher_ob2.gender = "female";
        teacher_ob2.phone = 3152323;

        System.out.println(teacher_ob2.name);
        System.out.println(teacher_ob2.gender);
        System.out.println(teacher_ob2.phone);

        //-------------------------------------------------------------------
        Class51_1_Teacher teacher_ob3 = new Class51_1_Teacher();   //object declare & create // must be under psvm

        teacher_ob3.name = "ghijkl";
        teacher_ob3.gender="male";
        teacher_ob3.phone = 99999;

        teacher_ob3.displayInformation1();     // using non peramitarized method

        //-------------------------------------------------------------------
        Class51_1_Teacher teacher_ob4 = new Class51_1_Teacher();   //object declare & create // must be under psvm

        teacher_ob4.setInformation1("dfs", "F", 31531);     // using peramitarized method

        //-------------------------------------------------------------------
        Class51_1_Teacher teacher_ob5 = new Class51_1_Teacher();   //object declare & create // must be under psvm

        teacher_ob5.setInformation2("wer", "M", 682413);     // using peramitarized method
        teacher_ob5.displayInformation1();

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
