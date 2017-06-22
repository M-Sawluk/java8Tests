package chapter10;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by Mike on 2017-06-12.
 */
public class Test10_2 {
    private static volatile boolean done = false;

    public static void main(String[] args) {
        Runnable powitania = () -> {
            for (int i = 1; i <= 1000; i++)
                System.out.println("Witaj " + i);
            done = true;
        };
        Runnable pożegnanie = () -> {
            int i = 1;
            while (!done) i++;
            System.out.println("Żegnaj " + i);
        };
        Executor executor = Executors.newCachedThreadPool();
        executor.execute(powitania);
        executor.execute(pożegnanie);
        }
}
