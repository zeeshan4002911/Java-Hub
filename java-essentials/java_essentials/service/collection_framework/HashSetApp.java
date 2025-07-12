package java_essentials.service.collection_framework;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

/* Different types of Set in Java Collection */
// Type           | Keeps order?                 | Allows null?   | Sorted?
// HashSet        | No order                     | Yes            | No
// LinkedHashSet  | Maintains insertion order    | Yes            | No
// TreeSet        | Natural order (sorted)       | No             | Yes (sorted)

public class HashSetApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option = "";
        Set<String> emailSet = new HashSet<>();

        while (true) {
            System.out.println("Choose: add(a) / remove(r) / search(s) / display(d) / exit(e)");
            option = sc.nextLine().strip().toLowerCase();
            if (option.isBlank())
                continue;
            if (option.equals("exit") || option.charAt(0) == 'e') {
                System.out.println("Exiting...");
                break;
            }

            switch (option.charAt(0)) {
                case 'a':
                    System.out.print("Enter new email to add: ");
                    String newEmail = sc.nextLine().strip().toLowerCase();
                    if (!newEmail.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$")) {
                        System.out.println(newEmail + " is not a valid email address.");
                        break;
                    }
                    Boolean addResult = emailSet.add(newEmail);
                    if (addResult) {
                        System.out.println("Email Added Successfully.");
                    } else {
                        System.out.println("Email Already Exists.");
                    }
                    break;
                case 'r':
                    System.out.print("Enter email to remove: ");
                    String removeEmail = sc.nextLine().strip().toLowerCase();
                    Boolean removeResult = emailSet.remove(removeEmail);
                    if (removeResult) {
                        System.out.println("Email Removed Successfully.");
                    } else {
                        System.out.println("Email Not Found.");
                    }
                    break;
                case 's':
                    System.out.print("Enter email to search: ");
                    String searchEmail = sc.nextLine().strip().toLowerCase();
                    Boolean searchResult = emailSet.contains(searchEmail);
                    if (searchResult) {
                        System.out.println("Email Found.");
                    } else {
                        System.out.println("Email Not Found.");
                    }
                    break;
                case 'd':
                    if (emailSet.isEmpty()) {
                        System.out.println("No emails yet.");
                    } else {
                        emailSet.stream().sorted().forEach(email -> System.out.println(email));
                    }
                    break;

                default:
                    System.out.println("Operation: " + option + " does not exists");
                    break;
            }
        }
        sc.close();
    }
}
