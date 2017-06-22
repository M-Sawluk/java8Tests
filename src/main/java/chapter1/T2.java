package chapter1;

/**
 * Created by Mike on 2017-05-29.
 */
public class T2 {
    public static void main(String[] args) {

        System.out.println(normalizeAngle(-400));
        System.out.println(normalizeAngleWithMath(-400));

    }

    public static int normalizeAngle(int angle){
        return angle%359;
    }

    public static  int normalizeAngleWithMath(int angle){
        return Math.floorMod(angle,359);
    }

}

