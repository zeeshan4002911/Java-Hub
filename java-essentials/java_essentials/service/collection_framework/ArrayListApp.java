package java_essentials.service.collection_framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Adding args to the names list
        for (String s : args) {
            names.add(s);
        }

        // Program static data and stop condition
        String operationType = "start";
        System.out.println(".....Type exit to stop the program.....");

        try {
            while (!operationType.equals("exit")) {
                System.out.println("Operation: search(s) / add(a) / remove(r) / display(d) / exit");
                operationType = sc.nextLine();
                if (operationType.isBlank())
                    continue;
                Character operationChar = operationType.toLowerCase().charAt(0);
                switch (operationChar) {
                    case 's':
                        System.out.print("Enter the name for searching: ");
                        String searchKey = sc.nextLine().strip();
                        String[] searchResult = searchNameHandler(names, searchKey);
                        System.out.println(searchResult[1]);
                        break;
                    case 'a':
                        System.out.print("Enter the name to add: ");
                        String newName = sc.nextLine().strip();
                        newNameHandler(names, newName);
                        break;
                    case 'r':
                        System.out.print("Enter the name to remove: ");
                        String removeName = sc.nextLine().strip();
                        removeNameHandler(names, removeName);
                        break;
                    case 'd':
                        System.out.println(names);
                        break;
                    case 'e':
                        // No operation - due to loop condition it will stop the program execution
                        break;
                    default:
                        System.out.println("Operation: " + operationType + " does not exists");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        } finally {
            names.clear();
            sc.close();
        }
    }

    public static String[] searchNameHandler(List<String> names, String searchKey) {
        int idx = names.indexOf(searchKey);
        if (idx != -1) {
            return new String[] { "SUCCESS", (searchKey + " is present at " + (idx + 1) + " postition") };
        }
        return new String[] { "FAILED", (searchKey + " is not present") };
    }

    public static void removeNameHandler(List<String> names, String removeKey) {
        String[] searchResult = searchNameHandler(names, removeKey);
        if (searchResult[0].equals("FAILED")) {
            System.out.println("Unable to remove, " + removeKey + " is not present");
            return;
        }

        if (names.size() > 0) {
            names.remove(removeKey);
            System.out.println(removeKey + " is removed successfully");
        }
    }

    public static void newNameHandler(List<String> names, String newName) {
        names.add(newName);
        System.out.println(newName + " is added successfully");
    }
}
