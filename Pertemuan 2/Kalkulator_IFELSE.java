
import java.util.*;



public class Kalkulator_IFELSE {
    public static void main(String[] args) {
        // a operator b
        Scanner inputUser;
        float a,b,hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("Input user : " +a+" "+operator+" "+b);

        //operator tersedia * / + -
        if (operator == '+'){
            //penjumlahan
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-'){
            //pengurangan
            hasil = a- b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*'){
            //penrkalian
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/'){
            //pembagian
            if(b==0){
                System.out.println("Pembagi nol menghasilkan tak hingga");
            }
        } else {
          System.out.println("operator tidak ditemukan");
        }
    }
}

