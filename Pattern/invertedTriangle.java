
public class invertedTriangle {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//import java.util;
// public class invertedTriangle {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             // for each rows -> spaces=rows-i ,stars=i
//             //spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print("  ");
//             }
//             //stars
//             for (int k = 1; k <= i; k++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
