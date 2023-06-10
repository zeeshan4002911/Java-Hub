import java.util.*;
import java.lang.*;
import java.io.*;

public class TemperatureConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            if (args.length > 0 && !args[0].isEmpty())
                System.out.print("Enter a Temperature: ");
            int val = sc.nextInt();

            if (args[0].equals("ctf"))
                celsiusToFahrenheit(val);
            else if (args[0].equals("ftc"))
                fahrenheitToCelsius(val);
            else
                System.out.print("Information: argument should be ctf or ftc");

        } catch (Exception e) {
            System.out.print("Error : argument ctf/ftc is missing");
        }
    }

    public static void celsiusToFahrenheit(int C) {
        int F = C * 9 / 5 + 32;
        System.out.printf("Temperature in Fahrenheit: %d", F);
    }

    public static void fahrenheitToCelsius(int F) {
        int C = (int) ((F - 32) * 5 / 9.0);
        System.out.printf("Temperature in celsius: %d", C);
    }
}
