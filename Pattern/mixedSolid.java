
public class mixedSolid {

    public static void main(String[] args) {
        int n = 5;
        for (int rows = 1; rows <= n; rows++) {
            if (rows == 1 || rows == 2 || rows == n) {
                for (int col = 1; col <= rows; col++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
                for (int col = 1; col <= rows - 2; col++) {
                    System.out.print("  ");
                }
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
