package someTests;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Mike on 2017-06-04.
 */
public class Main {

    public static void main(String[] args) {
        List<Employee> empls = new ArrayList<>();

        empls.add(new Janitor("Ala"));
        empls.add(new Manager("Cypiran"));
        empls.add(new Employee("Bartek"));

        System.out.println(empls.get(0) instanceof Employee);
        System.out.println(empls.get(0) instanceof Janitor);

        Collections.sort(empls);

        System.out.println(empls);

        Map<String,String> map = new HashMap<>();
        map.put("Michal", "MIstrz");
        String a = map.put("Michal","Looser");
        System.out.println(a);
        map.put("Karol","Karol");

        map.forEach((k,v)-> System.out.println(k +"|"+map.get(k)));

        BitSet bits = new BitSet();
        BitSet bits1 = new BitSet();

        for (int i = 0; i <100 ; i++) {
            if(i%3==1)
            bits.set(i);
        }
        bits1.set(2);
        bits1.set(3);
        bits1.set(5);
        bits1.set(7);
        System.out.println(bits);
//        System.out.println(bits1);
//        bits1.or(bits);
////        bits.xor(bits1);
//        System.out.println(bits1);
        System.out.println(bits.nextSetBit(5));
        System.out.println(bits.nextClearBit(13));

        List<Employee> janitors = new ArrayList<>();

        Collections.fill(janitors,new Janitor(""));




    }
}
