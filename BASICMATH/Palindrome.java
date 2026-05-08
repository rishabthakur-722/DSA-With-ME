// public class Pandrome {

//     public static void main(String[] args) {
//         String str = "madam";
//         String rev = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev = rev + str.charAt(i);
//         }
//         if (str.equals(rev)) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not a palindrome");
//         }
//     }
// }
public class Palindrome {

    static int isPalindrome(int n) {
        int rev = 0;
        int original = n;
        while (original != 0) {
            int lastDigit = original % 10;
            rev = rev * 10 + lastDigit;
            original = original / 10;
        }
        if (rev == n) {
            return 1; // true
        } else {
            return 0; // false
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321)); // true
        System.out.println(isPalindrome(-123)); // false

    }
}
