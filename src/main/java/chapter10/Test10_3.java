package chapter10;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by Mike on 2017-06-12.
 */
public class Test10_3 {

    private static int licznik;

    public static void main(String[] args) {

        Executor executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 100; i++) {
            int idZadania = i;
            Runnable zadanie = () -> {
                for (int k = 1; k <= 1000; k++)
                    licznik++;

                System.out.println(idZadania + ": " + licznik);
            };
            executor.execute(zadanie);
        }
    }
}
