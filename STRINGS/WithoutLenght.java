//for each loop string length without using length() method
//syntax: for (char c : str.toCharArray()) {  

public class WithoutLenght {

    public static void main(String[] args) {

        String str = "Hello World";

        // This will cause a compile-time error because length() is missing
        // System.out.println(str.length());
        // Instead, we can use a loop to count the characters
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        System.out.println("Length of the string: " + count);
    }
}
