public class OOP {
    public static void main(String[] args) {
        System.out.println("OOP Concept");
        Student student = new Student("Zeesh", 45);
        student.setScore(80);
        student.displayDetails();
        System.out.println("Score: " + student.getScore());
    }
}

class Student {
    // Fields declaration
    private String name;
    private int rollNumber;
    private int score;

    // Constructor with same name as class
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.score = 0;
    }
    
    // Constructor overloading
    public Student(String name, int rollNumber, int score) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.score = score;
    }

    // setter for score
    public void setScore(int score) {
        if (score < 0) {
            System.err.println("Score can not be negative");
        } else {
            this.score = score;
        }
    }

    /* getter for score, name and rollNumber */
    public int getScore() {
        return this.score;
    }

    public String getName() {
        return this.name;
    }

    public int getRollNumber() {
        return this.rollNumber;
    }

    // Method to print information
    public void displayDetails() {
        System.out.println(
            "Name        : " + name + "\n" +
            "Roll Number : " + rollNumber + "\n" + 
            "Score       : " + score
        );
    }
}