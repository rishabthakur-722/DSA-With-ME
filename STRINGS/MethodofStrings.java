
public class MethodofStrings {

    public static void main(String[] args) {

        // Original String
        String str = "  Hello Java World  ";

        // 1. length()
        System.out.println("1. length() = " + str.length());

        // 2. charAt(index)
        System.out.println("2. charAt(4) = " + str.charAt(4));

        // 3. substring(beginIndex, endIndex)
        System.out.println("3. substring(2,7) = " + str.substring(2, 7));

        // 4. contains()
        System.out.println("4. contains(\"Java\") = " + str.contains("Java"));

        // 5. equals()
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println("5. equals() = " + s1.equals(s2));

        // 6. equalsIgnoreCase()
        String s3 = "java";
        String s4 = "JAVA";
        System.out.println("6. equalsIgnoreCase() = " + s3.equalsIgnoreCase(s4));

        // 7. toUpperCase()
        System.out.println("7. toUpperCase() = " + str.toUpperCase());

        // 8. toLowerCase()
        System.out.println("8. toLowerCase() = " + str.toLowerCase());

        // 9. trim()
        System.out.println("9. trim() = " + str.trim());

        // 10. split()
        String fruits = "Apple,Mango,Banana";
        String[] arr = fruits.split(",");

        System.out.println("10. split()");
        for (String fruit : arr) {
            System.out.println(fruit);
        }

        // 11. startsWith()
        System.out.println("11. startsWith(\"Hello\") = "
                + str.trim().startsWith("Hello"));

        // 12. endsWith()
        System.out.println("12. endsWith(\"World\") = "
                + str.trim().endsWith("World"));

        // 13. valueOf()
        int num = 100;
        String numberString = String.valueOf(num);
        System.out.println("13. valueOf() = " + numberString);

        // 14. toCharArray()
        char[] chars = s1.toCharArray();

        System.out.println("14. toCharArray()");
        for (char ch : chars) {
            System.out.print(ch + " ");
        }

        System.out.println();

        // 15. isEmpty()
        String emptyStr = "";
        System.out.println("15. isEmpty() = " + emptyStr.isEmpty());

        // 16. isBlank()
        String blankStr = "   ";
        System.out.println("16. isBlank() = " + blankStr.isBlank());

        // 17. replace()
        String replaceStr = "Java";
        System.out.println("17. replace() = "
                + replaceStr.replace('a', 'o'));

    }
}
