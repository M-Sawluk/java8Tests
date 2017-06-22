package chapter1;

import java.util.Scanner;

/**
 * Created by Mike on 2017-05-29.
 */
public class T7 {
    public static void main(String[] args) {
        makeCalculationsOnShorts();
    }


    public static void makeCalculationsOnShorts(){
        Scanner scanner = new Scanner(System.in);

        short a = scanner.nextShort();
        short b = scanner.nextShort();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);



    }

}
