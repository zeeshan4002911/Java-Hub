package java_essentials;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import java_essentials.service.OOP;

public class Basic {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Variable declaration
        long years = 4543000000l;
        String name = "Zeesh";
        String origin = "Human";
        float startSeconds = 10.99f;

        // String formatting
        String bio = String.format(
                "I am %s, I am a %s and it's been %,d years of earth. Lets start in %.2f seconds",
                name, origin, years, startSeconds);
        System.out.println(bio);

        // Scheduler for repeating task
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        final int[] count = { (int) Math.floor(startSeconds) };
        Runnable task = () -> {
            if (count[0] >= 0) {
                // \r for output on same line
                System.out.print("\rInitialising in " + count[0]-- + " seconds ");
            } else {
                System.out.println("\nStarted");
                scheduler.shutdown();
            }
        };

        scheduler.scheduleAtFixedRate(task, 1, 1, TimeUnit.SECONDS);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the score(%) to be graded: ");
        final int scorePercentage = scanner.nextInt();
        System.out.println("Grade: " + ControlFlow.getGrade(scorePercentage));
        scanner.close();

        System.out.println();
        // OOP Concept
        OOP.main(null);
    }

}

class ControlFlow {
    // Returns grade based on score percentage
    public static String getGrade(int scorePercentage) {
        String grade = null;
        if (scorePercentage >= 90) {
            grade = "O";
        } else if (scorePercentage >= 75) {
            grade = "A";
        } else if (scorePercentage >= 50) {
            grade = "B";
        } else if (scorePercentage >= 25) {
            grade = "C";
        } else {
            grade = "F";
        }
        return grade;
    }

    public void printEvenNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            }
        }
    }
}