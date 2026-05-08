//Methods and Variable scoping => variable scope in methods
//Variable scope => variable ki accessibility ya visibility, yani ki variable program ke kis part mein accessible hai. Variable scope determine karta hai ki variable ko program ke kis part mein access kiya ja sakta hai, aur kis part mein nahi. Variable scope ke types => Local scope, Instance scope, Static scope
//Local scope => Local variables wo variables hote hain jo kisi method ke andar declare kiye jate hain. In variables ko sirf usi method ke andar access kiya ja sakta hai, jahan wo declare kiye gaye hain. Jab method ka execution complete ho jata hai, toh local variables destroy ho jate hain, aur unki memory free ho jati hai. Local variables ko method ke bahar access nahi kiya ja sakta, aur na hi unki value method ke bahar use ki ja sakti hai. Local variables ka scope sirf usi method tak limited hota hai, jahan wo declare kiye gaye hain.
//Instance scope => Instance variables wo variables hote hain jo class ke andar declare kiye jate hain, lekin kisi specific method ke andar nahi. In variables ko class ke kisi bhi method ke andar access kiya ja sakta hai, aur unki value class ke kisi bhi method ke andar use ki ja sakti hai. Instance variables ka scope class ke andar hota hai, aur wo class ke kisi bhi method ke andar accessible hote hain. Instance variables ko object ke through access kiya jata hai, aur unki value object-specific hoti hai.
//Static scope => Static variables wo variables hote hain jo class ke andar declare kiye jate hain, aur unke aage static keyword hota hai. In variables ko class ke kisi bhi method ke andar access kiya ja sakta hai, aur unki value class ke kisi bhi method ke andar use ki ja sakti hai. Static variables ka scope class ke andar hota hai, aur wo class ke kisi bhi method ke andar accessible hote hain. Static variables ko class name ke through access kiya jata hai, aur unki value class-specific hoti hai, yani ki wo class ke sabhi objects ke liye same hoti hai.
//Global scope => Java mein global variables nahi hote, lekin static variables ko global variable ke tarah use kiya ja sakta hai, kyunki unka scope class ke andar hota hai, aur wo class ke kisi bhi method ke andar accessible hote hain. Static variables ko class name ke through access kiya jata hai, aur unki value class-specific hoti hai, yani ki wo class ke sabhi objects ke liye same hoti hai. Static variables ko global variable ke tarah use karne ke liye, unhe public static declare kiya jata hai, taki wo program ke kisi bhi part mein accessible ho sake.



public class methodsAndVariableScoping {

    static int a = 10; // static
    int b = 20;        // instance

    static void method1() {// static method
        int x = 5; // local
        System.out.println("Local x: " + x);
        System.out.println("Static a: " + a);
    }

    void method2() {// instance method
        int y = 15; // local
        System.out.println("Instance b: " + b);
        System.out.println("Local y: " + y);
    }

    public static void main(String[] args) {
        method1();// calling static method directly

        methodsAndVariableScoping obj = new methodsAndVariableScoping();// creating object to call instance method
        obj.method2();// calling instance method using object
    }
}
