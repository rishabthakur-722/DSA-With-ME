// public class GCDNumber {

//     public static void main(String[] args) {
//         int a = 12;
//         int b = 15;
//         int gcd = 1;
//         for (int i = 1; i <= a && i <= b; i++) {
//             if (a % i == 0 && b % i == 0) {
//                 gcd = i;
//             }
//         }
//         System.out.println(gcd);
//     }
// }
public class GCDNumber {

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(12, 15)); // 3
        System.out.println(gcd(48, 18)); // 6
    }
}
