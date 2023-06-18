import java.util.*;

public class PrimeNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = x; i < y; i++) {
            Boolean flag = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) System.out.println(i);
        }
        sc.close();
    }
}