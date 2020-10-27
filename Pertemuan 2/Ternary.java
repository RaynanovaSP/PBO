

import java.util.*;

public class Ternary {
    public static void main(String[] args) {
        // Ternary operator
        int input, x;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan Nilai : ");
        input = inputUser.nextInt();

        //varebl x = ekspresi? statement_true : statement_false
        x = (input == 10) ? (input*input) : (input/2);

        // jika memakai if
        // if (input==10){
        //  x= input*input;
        // } else {
        //  x= input/2;
        // }
        System.out.println("Hasilnya " + x);
    }
}
