import com.sun.org.apache.xpath.internal.SourceTree;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;
import java.util.function.Predicate;

/**
 * Created by Mike on 2017-05-31.
 */
public class Test {

    protected int a;

    public static void main(String[] args) throws ParseException {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(4,5,6,7));

        numbers.removeIf(Objects::isNull);
        numbers.removeIf(e->e>4);


        System.out.println(numbers);


        Operation op= Operation.ADD;
        System.out.println(op.eval(4,5));

        String a = new String();

        double num = BigDecimal.valueOf(4.4545).setScale(2, RoundingMode.HALF_DOWN).doubleValue();

        System.out.printf(String.format("%.20f",num));
        System.out.println();


        String string= new StringBuilder("abc").reverse().toString();
        System.out.println(string);
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        numberFormat.setMaximumFractionDigits(1);
//        numberFormat.setMinimumFractionDigits(1);
        numberFormat.setRoundingMode(RoundingMode.FLOOR);
        String numFor = numberFormat.format(2.455);

        System.out.println(String.format("%.40f",Double.parseDouble(numFor)));
        System.out.println(numFor);
        System.out.println();
    }


}
