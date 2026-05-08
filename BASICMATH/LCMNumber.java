
public class LCMNumber {

    public static void main(String[] args) {
        int a = 12;
        int b = 15;
        int lcm = (a * b) / gcd(a, b);
        System.out.println(lcm);
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
