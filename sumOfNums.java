import java.util.*;

public class sumOfNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();

        Solution Obj = new Solution();
        System.out.println(Obj.NumberSum(N));
        scanner.close();
    }
}

class Solution {
    public long NumberSum(long N) {
        return (N * (N + 1) / 2);
    }
}