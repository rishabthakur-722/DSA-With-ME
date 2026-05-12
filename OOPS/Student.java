public class Student {

    private int id;
    private String name;
    private int age;
    private long phoneNumber;

    // Constructor
    public Student(int id, String name, int age, long phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Methods
    public void study() {
        System.out.println(name + " is studying");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}