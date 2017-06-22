package chapter1;

/**
 * Created by Mike on 2017-05-29.
 */
public class T3 {

    public static void main(String[] args) {

        System.out.println(findMax(4,23,8,11));
        System.out.println(findMaxMath(41,23,8));

    }

    public static int findMax(int... numbers){
        int number=0;

        for (int i : numbers) {
            if(number<i)
                number=i;
        }

        return number;
    }

    public static int findMaxMath(int a, int b,int c){
        return Math.max(Math.max(a,b),c);
    }
}
