
public class CountVowels {

    public static void main(String[] args) {

        String str = "Hello World";
        int count = 0;

        // for (char c : str.toCharArray()) {
        //     if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
        //         c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
        //         count++;
        //     }
        // }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
        System.out.println("Number of vowels in the string: " + count);
    }
}
