
// import java.util.Scanner;
// public class countDigit {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         if (n == 0) {
//             System.out.println("Number of digits: 1");
//         } else {
//             int count = 0;
//             while (n > 0) {
//                 n = n / 10;
//                 count++;
//             }
//         }
//         System.out.println("Number of digits: " + count);
//         sc.close();
//     }
// }
import java.util.Scanner;

public class countDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0; // count variable ko initialize karne ke liye;

        if (n == 0) {// agar n 0 hai to count ko 1 set kar do;
            count = 1;// kyunki 0 me 1 digit hoti hai;
        } else {
            n = Math.abs(n); // negative number ko positive me convert karne ke liye;

            while (n > 0) {// jab tak n greater than 0 hai tab tak loop chalega;
                n = n / 10;// last digit ko remove karne ke liye;
                count++;// count ko increment karne ke liye;
            }
        }

        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
