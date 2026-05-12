public class App {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Alice", 20, 9876543210L);

        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getPhoneNumber());

        s1.study();
        s1.sleep();
    }
}