
import java.util.Scanner;

public class rightTriangle {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = SC.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        SC.close();
    }
}
