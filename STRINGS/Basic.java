
public class Basic {

    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Doe";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(fullName.length());
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.indexOf("o"));
        System.out.println(fullName.substring(0, 4));
        System.out.println(fullName.contains("John"));
        System.out.println(fullName.equals("John Doe"));
    }
}
