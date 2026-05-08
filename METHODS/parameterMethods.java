
public class parameterMethods {

    static void printTable(int n) { // method with parameter
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        System.out.println("This is the main method");
        printTable(5); // calling the method with argument 5
    }
}
