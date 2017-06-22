package chapter1;

import java.math.BigInteger;

/**
 * Created by Mike on 2017-05-29.
 */
public class T6 {
    public static void main(String[] args) {
        System.out.println(strong(4).toString());
    }

    public static BigInteger strong(int x){
        return x<2 ? BigInteger.valueOf(1) : BigInteger.valueOf(x)
                .multiply(strong(x-1));
    }
}
