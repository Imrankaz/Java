package BasicsOfJava;

import java.util.Arrays;

public class Class02_P2_VariableAndDataType {
    public static void main(String[] args) {
        System.out.println("hello it's class02 part2");
        System.out.print("gdfgdf 1");
        System.out.printf("hgfdhf 2");
        System.out.println();
        System.out.println("Class02_P2_VariableAndDataType.main");
        System.out.println("args = " + Arrays.toString(args));
        System.out.println("args = " + args);

        //--------------------------------------------------------------------------------------------------------
        boolean v1 = true;
        boolean v2 = false;

        System.out.println(v1);
        System.out.println("v2 = " + v2);

        char v3 = 'a';
        System.out.println("v3 = " + v3);

        byte v4 = 127;
        System.out.println("v4 = " + v4);

        short v5 = 32767;
        System.out.println("v5 = " + v5);

        int v6 = 2147483647;
        System.out.println("v6 = " + v6);

        long v7 = 999999999;
        System.out.println("v7 = " + v7);

        float v8 = 99999999999999999999999999999999999999.55555555555555555555555555555554563454534536737836786543564563645356436543563456364534563564353684968473963f;
        System.out.println("v8 = " + v8);

        double v9 = 123456789101112131415161718192021222324252627282930313233334353637383940414243444546474849503212313213213213212312312312312311231231231321564564646546545645646546546545646546546545646854684354968476841564689476846546894798646854654689476894684167987198741966856556274562786127612787861256782567821675547856872.12345678910111213141516171819202122;
        System.out.println("v9 = " + v9);

        double num1 = 20.55555;
        System.out.println("[bitwise right shift]	=>		a>>2	:	"+ (int) (num1/Math.pow(2,2)));
    }
}
