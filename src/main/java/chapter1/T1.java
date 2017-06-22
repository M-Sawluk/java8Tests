package chapter1;

/**
 * Created by Mike on 2017-05-29.
 */
public class T1 {

    public static void main(String[] args) {
        printInt(20);
    }

    public static void printInt(int x){
        System.out.printf("Binary: %s, Octa: %o, Hexadeci: %x \n"
                ,Integer.toBinaryString(x),x,x);

        double a = 1.0/x;
        System.out.println(a);
        System.out.printf("Inverse: %a" , a);
    }
}
