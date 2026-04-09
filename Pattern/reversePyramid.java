
public class reversePyramid {

    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            // for each rows -> variable calculation -> spaces=rows-i ,stars=2*i-1

            //spaces
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }

            //stars
            for (int k = 1; k <= 2 * (n - row) + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
