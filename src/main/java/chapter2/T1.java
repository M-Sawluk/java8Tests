package chapter2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Created by Mike on 2017-05-30.
 */
public class T1 {


    public static void main(String[] args) {
        printCalendar(LocalDate.of(2017,9,20));
    }

    public static void printCalendar(LocalDate localDate){

        int firstDay = localDate.withDayOfMonth(1).getDayOfWeek().getValue();
        int monthLen = localDate.lengthOfMonth();

        System.out.println("N  P  W  Ś  C  P  S");

        if(firstDay<7)
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        for (int i = 1; i <= monthLen ; i++) {
            if(i<10)
                System.out.print(i+"  ");
            else
                System.out.print(i+" ");

            if(localDate.withDayOfMonth(i).getDayOfWeek().getValue()==6)
                System.out.println();

        }

        System.out.println();
    }
}
