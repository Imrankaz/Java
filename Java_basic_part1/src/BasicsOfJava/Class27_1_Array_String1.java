package BasicsOfJava;

public class Class27_1_Array_String1 {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "asad";
        names[1] = "Arif";
        names[2] = "asif";
        for (String x : names){
            System.out.println(x);
        }

        System.out.println("/n********************/n");

        String[] names2 = {"Tausif","ashik","asraf"};
        for (String x : names2){
            System.out.println(x);
        }

    }
}
