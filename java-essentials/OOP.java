public class OOP {
    public static void main(String[] args) {
        System.out.println("OOP Concept");
        Student student = new Student("Zeesh", 25, 45);
        student.setScore(80);
        student.displayDetails();
        System.out.println("Score from getter: " + student.getScore());
        System.out.println("Name from parent class: " + student.getName());
    }
}

class Person {
    // Accesss modifier is protected to access from sub classes
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name, age
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void introduce() {
        System.out.println("Hi I am " + name + ", and I am " + age + " years old.");
    }
}

interface Printable {
    // Default modifier is abstract implicitly
    abstract void print();
}

interface Loggable {
    void log();
}

class Student extends Person implements Printable, Loggable {
    // Fields declaration
    private int rollNumber;
    private int score;

    // Constructor with same name as class
    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.score = 0;
    }

    // Constructor, method overloading
    public Student(String name, int age, int rollNumber, int score) {
        super(name, age);
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

    /* getter for score and rollNumber */
    public int getScore() {
        return this.score;
    }

    public int getRollNumber() {
        return this.rollNumber;
    }

    // Method overriding, polymorphism
    @Override
    public void introduce() {
        System.out.println("Hi I am " + name + " a Student.");
    }

    // Method to print information
    public void displayDetails() {
        super.introduce();
        System.out.println(
            "Name        : " + name + "\n" +
            "Roll Number : " + rollNumber + "\n" + 
            "Score       : " + score
        );
        this.introduce();
    }

    /* Interfaced method */
    @Override
    public void print() {
        this.displayDetails();
    }

    @Override
    public void log() {
        System.out.println("Logging student: " + getName());
    }
}