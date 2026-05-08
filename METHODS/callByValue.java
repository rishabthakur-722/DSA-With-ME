//call by value => method call karte waqt arguments ki value copy hoti hai, original value change nahi hoti. Jab method ke parameters primitive data types hote hain (jaise int, float, char), toh unki values copy hoti hain. Iska matlab hai ki method ke andar parameters ki value change karne se original variable ki value par koi asar nahi padta. Method ke andar jo changes hote hain, wo sirf method ke scope tak limited hote hain, aur original variable unaffected rehta hai.

public class callByValue {

    static void changeValue(int a) {
        a = 10; // method ke andar parameter a ki value change ho rahi hai, lekin original variable par koi asar nahi padta
    }

    public static void main(String[] args) {
        int num = 5; // original variable
        System.out.println("Before method call: " + num); // 5
        changeValue(num); // method call, num ki value copy hoti hai
        System.out.println("After method call: " + num); // 5, original variable unchanged rehta hai
    }
}
