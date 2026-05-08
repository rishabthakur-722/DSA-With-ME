// void exapmle => method which does not return any value

// public class nonvoidsANDvoid {
//     static void greet() { // void => return type of method, it means this method will not return any value
//         System.out.println("Hello Bhai!");
//     }
//     public static void main(String[] args) {
//         greet(); // method call
//     }
// }
// ====================================================================================================================================================================//
// non -void example => method which returns a value
public class nonvoidsANDvoid {

    static int add(int a, int b) {
        return a + b; // value return ho rahi hai
    }

    public static void main(String[] args) {
        int result = add(5, 3);// method call and storing the returned value in result variable
        System.out.println(result);
    }
}

// Method signature => method name + parameter list (data type of parameters) 
//Method call stack => Jab koi method call hota hai, toh wo call stack mein add ho jata hai. Jab method ka execution complete ho jata hai, toh wo stack se remove ho jata hai. Yeh process tab tak chalta rehta hai jab tak main method execute hoke program end nahi ho jata.
//Method Call Stack Entry kya store karti hai => Method call stack entry mein method ka naam, uske parameters, aur local variables store hote hain. Jab method call hota hai, toh ek new entry stack mein add ho jata hai, aur jab method ka execution complete ho jata hai, toh wo entry stack se remove ho jata hai.
