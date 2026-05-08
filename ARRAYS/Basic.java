
public class Basic {

    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 20};
        int ans = 1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int value = arr[i];
            ans = ans * value;
        }
        System.out.println(ans);
    }
}
