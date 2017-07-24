package sample;

/**
 * Created by SATYENDRA_GUPTA on 25-07-2017.
 */
public class AutoBoxing {
    public static void main(String[] args) {
        Integer i = new Integer(4);
        int a = 8;
        Integer aObj = a;
        aObj++;
        int c = aObj;
        System.out.println(c);
        System.out.println(aObj);
        System.out.println(i);
    }
}
