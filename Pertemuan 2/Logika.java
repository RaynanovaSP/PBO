
public class Logika {
    public static void main(String[] args) {
        // operator logika -> Operasi yang bisa dilakukan pada tipe data boolean
        // AND,OR,XOR, Negasi

        boolean a,b,c;
        // OR / atau (||)
        System.out.println("===== OR (||) =====");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        //AND / dan (&&)
        System.out.println("===== AND (&&) =====");
        a = false;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);

        //XOR / exclusive or (&&)
        System.out.println("===== XOR (^) =====");
        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);

        //NOT / negasi -> flipping (!)
        System.out.println("===== Negasi (!) =====");
        a = false;
        c = !a;
        System.out.println(a + "--> (!) = " + c);

        a = true;
        c = !a;
        System.out.println(a + "--> (!) = " + c);
    }
}
