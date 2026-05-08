//Basic syntax of method => //returnType methodName(parameters){
//    //body of method
//}

// static method =>Static method wo method hota hai jise bina object banaye call kiya ja sakta hai. Yeh method class ka hota hai, kisi specific object ka nahi hota. Isliye ise directly class name ke through call kar sakte hain, object create karne ki zarurat nahi hoti. Static methods generally utility ya helper kaam ke liye use hote hain, jahan hume instance variables ya object-specific data ki need nahi hoti. Static methods ko call karne ke liye class name ka use karna hota hai, jaise ClassName.methodName().
public class basicMethod {// class name should be same as file name
// declaring a method / defining a method

    static void print2kaTable() { // void => return type of method, it means this method will not return any value
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 x " + i + " = " + 2 * i);
        }
    }

    public static void main(String[] args) {// main method is the entry point of the program
        System.out.println("This is the main method");
        print2kaTable();
    }
}
