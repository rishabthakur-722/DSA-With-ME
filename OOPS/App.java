
public class App {

    public static void main(String[] args) {
        // Object Creation
        //Default Constructor
        // Student A = new Student();
        // A.id = 1;
        // A.name = "John";
        // A.age = 20;
        // A.nos = 1234567890;
        // System.out.println(A.id);
        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.nos);

        // A.study();
        // A.sleep();
        // A.bunk();
        //
        // Parameterized Constructor
        Student A = new Student(2, "Alice", 22, 98, "Riya");

        A.id = 1;
        A.name = "John";
        A.age = 20;
        A.nos = 1234567890;
        System.out.println(A.id);
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.nos);
        System.out.println(A.gf);

        A.study();
        A.sleep();
        A.bunk();

    }

}

// Encapsulation - Wrapping data and code together as a single unit. (Class)
// Inheritance - Acquiring properties and behaviours of a parent class by a child class.    
// Polymorphism - Ability of an object to take many forms. (Method Overloading and Method Overriding)
// Abstraction - Hiding internal details and showing only functionality. (Abstract Class and Interface)

