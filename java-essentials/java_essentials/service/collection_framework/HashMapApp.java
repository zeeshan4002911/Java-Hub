package java_essentials.service.collection_framework;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/* Different types of Map in Java Collection */
// Type           | Keeps order?                 | Allows null?        | Sorted?
// HashMap        | No order                     | Yes (1 null key)    | No
// LinkedHashMap  | Maintains insertion order    | Yes                 | No
// TreeMap        | Natural order                | No                  | Yes (sorted)

public class HashMapApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option = "";
        Map<String, User> emailMap = new HashMap<String, User>();

        try {
            while (true) {
                System.out.println("Choose: add(a) / remove(r) / update(u) / search(s) / display(d) / exit(e)");
                option = sc.nextLine().strip().toLowerCase();
                if (option.isBlank())
                    continue;
                if (option.equals("exit") || option.charAt(0) == 'e') {
                    System.out.println("Exiting...");
                    break;
                }

                switch (option.charAt(0)) {
                    case 'a':
                        // Prompting user for email input
                        System.out.print("Enter new email to add: ");
                        String newEmail = sc.nextLine().strip().toLowerCase();
                        if (!newEmail.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$")) {
                            System.out.println(newEmail + " is not a valid email address.");
                            break;
                        }
                        
                        // Check for the existence of the email
                        User addResult = emailMap.get(newEmail);
                        Boolean overwriteFlag = false;
                        if (addResult != null) {
                            System.out.println("Email Exists in the System, overwrite? yes/no");
                            String res = sc.nextLine().strip();
                            if (res.equals("no") || res.equals("No"))
                                break;
                            else if (res.equals("yes") || res.equals("Yes"))
                                overwriteFlag = true;
                            else
                                System.out.println("No action taken by user");
                        }

                        if (addResult == null || overwriteFlag) {
                            // Prompt user for user details (name, age, country)
                            System.out.print("Enter name: ");
                            String newName = sc.nextLine().strip();
                            System.out.print("Enter Age: ");
                            int newAge = Integer.parseInt(sc.nextLine().strip());
                            System.out.print("Enter country: ");
                            String newCountry = sc.nextLine().strip();

                            User newUser = new User(newName, newAge, newCountry);
                            emailMap.put(newEmail, newUser);
                            System.out.println("User with email: " + newEmail + " added successfully.");
                        }

                        break;

                    case 'r':
                        System.out.print("Enter email to remove: ");
                        String removedEmail = sc.nextLine().strip();
                        String removedEmailLower = removedEmail.toLowerCase();
                        User removedResult = emailMap.remove(removedEmailLower);
                        if (removedResult != null) {
                            System.out.println("User with email: " + removedEmail + " removed successfully.");
                        } else {
                            System.out.println("User with email: " + removedEmail + " does not exists in system.");
                        }
                        break;

                    case 'u':
                        System.out.print("Enter email to update: ");
                        String updateEmail = sc.nextLine().strip().toLowerCase();
                        User updateUser = emailMap.get(updateEmail);
                        if (updateUser == null) {
                            System.out.println("User with email: " + updateEmail + " does not exists in system.");
                        } else {
                            // Update user details by taking field input
                            System.out.println("Enter field to update (name/age/country)");
                            String field = sc.nextLine().strip();
                            if (field.equals("name")) {
                                System.out.println("Enter new name: ");
                                String newName = sc.nextLine().strip();
                                updateUser.setName(newName);
                                System.out.println("User with email: " + updateEmail + " updated successfully.");
                            } else if (field.equals("age")) {
                                System.out.println("Enter new age: ");
                                int newAge = Integer.parseInt(sc.nextLine().strip());
                                updateUser.setAge(newAge);
                                System.out.println("User with email: " + updateEmail + " updated successfully.");
                            } else if (field.equals("country")) {
                                System.out.println("Enter new country: ");
                                String newCountry = sc.nextLine().strip();
                                updateUser.setCountry(newCountry);
                                System.out.println("User with email: " + updateEmail + " updated successfully.");
                            } else {
                                System.out.println(field + " does not match with User fields.");
                            }
                        }
                        break;

                    case 's':
                        System.out.print("Enter email to search: ");
                        String searchEmail = sc.nextLine().strip().toLowerCase();
                        User searchResult = emailMap.get(searchEmail);

                        if (searchResult == null) {
                            System.out.println("User with email: " + searchEmail + " does not exists in system.");
                        } else {
                            System.out.println("----- User details -----");
                            searchResult.printUser();
                        }
                        break;

                    case 'd':
                        System.out.println("User List (" + emailMap.size() + " total)");
                        for (Map.Entry<String, User> entry : emailMap.entrySet()) {
                            System.out.println("----- " + entry.getKey() + " -----");
                            entry.getValue().printUser();
                        }
                        break;
                    default:
                        System.out.println("Operation: " + option + " does not exists");
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        } finally {
            emailMap.clear();
            sc.close();
        }
    }
}

class User {
    private String name;
    private int age;
    private String country;

    User(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void printUser() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Country: " + this.country);
    }
};
