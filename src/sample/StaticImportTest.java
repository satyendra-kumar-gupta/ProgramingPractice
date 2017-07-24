package sample;
import static java.lang.System.out;
import static java.lang.String.valueOf;

/**
 * Created by SATYENDRA_GUPTA on 25-07-2017.
 */


public class StaticImportTest {
    enum Days {
            One , Two, Three;
            int getTotalDays(){
                return 3;
            }
    }

    static  String  str= "String Data Type Test";

    public static void main(String[] args) {
        int a = 10;
        out.println(a);
        // Without static import String.valueOf("88")
        // But with static import valueOf("88")
        out.println(valueOf("3434"));

        // Accessing static variable
        System.out.println(str);


        Days d = Days.One;
        System.out.println(d);

        System.out.println(d.getTotalDays());
    }
}
