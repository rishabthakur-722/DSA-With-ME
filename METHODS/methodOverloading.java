//Method with same name but different parameters => method overloading
//Method overloading => same method name but different parameter list (data type of parameters) 

public class methodOverloading {

    static int add(int a, int b) {// method with 2 parameters
        return a + b;
    }

    static int add(int a, int b, int c) {// method with 3 parameters
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(2, 3, 4));
    }
}
