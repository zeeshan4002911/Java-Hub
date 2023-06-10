import java.util.*;
import java.lang.*;
import java.io.*;

public class FactorialOfN {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * (i);
        }
        System.out.print(fact);
    }
}