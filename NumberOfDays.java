import java.util.*;

public class NumberOfDays {
    public static void calculateDays(int m) {
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            System.out.print(31);
        } else if (m == 2) {
            System.out.print(28);
        } else {
            System.out.print(30);
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number for month to get Days: ");
        int m = input.nextInt();
        calculateDays(m);
        input.close();
    }
}