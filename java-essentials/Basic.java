import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Basic {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Variable declaration
        long years = 4543000000l;
        String name = "Zeesh";
        String origin = "Human";
        float start_seconds = 10.99f;

        // String formatting
        String bio = String.format(
                "I am %s, I am a %s and it's been %,d years of earth. Lets start in %.2f seconds",
                name, origin, years, start_seconds);
        System.out.println(bio);

        // Scheduler for repeating task
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        final int[] count = {(int) Math.floor(start_seconds)};
        Runnable task = () -> {
            if (count[0] >= 0) {
                System.out.print("\rInitialising in " + count[0]-- + " seconds ");
            } else {
                System.out.println("\nStarted");
                scheduler.shutdown();
            }
        };

        scheduler.scheduleAtFixedRate(task, 1, 1, TimeUnit.SECONDS);
    }
}