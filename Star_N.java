import java.util.*;

public class Star_N {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++) {
            System.out.print("* ");
        }
        for(int i = 0 ; i < n; i++) {
            System.out.println("*");
        } 
        sc.close();
    }
}
