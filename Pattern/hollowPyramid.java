
public class hollowPyramid {

    public static void main(String[] args) {
        int n = 5;
        for (int rows = 1; rows <= n; rows++) {
            for (int space = 1; space <= n - rows; space++) {
                System.out.print(" ");
            }
            if (rows == 1 || rows == n) {
                for (int col = 1; col <= 2 * rows - 1; col++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
                for (int col = 1; col <= 2 * rows - 3; col++) {
                    System.out.print("  ");
                }
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
