import java.util.Scanner;

public class SumTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.printf("Sum till %d: %d", n, sum);
        sc.close();
    }
}
