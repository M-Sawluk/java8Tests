package chapter1;

/**
 * Created by Mike on 2017-05-29.
 */
public class T8 {
    public static void main(String[] args) {

        String swiat = "swiat";
        String sub = "swiatjestzly";
        String world = sub.substring(0,5);

        System.out.println(swiat.equals(world));
        System.out.println(swiat==world);


    }
}
