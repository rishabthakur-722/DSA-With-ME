
public class App {

    public static void main(String[] args) {

        // Object creation using parameterized constructor
        Student s1 = new Student(101, "Alice", 20, 9876543210L);

        // Data access using getter
        System.out.println("ID: " + s1.getId());
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Phone: " + s1.getPhoneNumber());

        // Data update using setter
        s1.setName("John");
        s1.setAge(22);

        System.out.println("\nAfter Update:");
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

        s1.study();
        s1.sleep();
    }
}
