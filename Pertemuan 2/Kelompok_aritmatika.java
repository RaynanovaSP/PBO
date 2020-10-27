
import java.util.Scanner;

public class Kelompok_aritmatika {
    public static void main(String[] args) {
        //perkalian atau pembagian akan di utamakan terlebih dahulu
        //jika ada ke2nya maka dialkukan dari yang kiri terlebih dahulu
        int hasil = 5 * 10 / 2;
        System.out.println(hasil);
        hasil = 5 + 2 -10;
        System.out.println(hasil);

        //Menggunakan pengelompokan operasi dengan ()
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

        Scanner userInput = new  Scanner (System.in);
        // perhitungan persamaan kuadrat
        System.out.println("Menghitung Persamaan Kudrat");
        int m,x,c;

        System.out.print("nilai x = ");
        x = userInput.nextInt();
        System.out.print("gradient m = ");
        m = userInput.nextInt();
        System.out.print("bias c = ");
        c= userInput.nextInt();
        int y = m*x*x+c;
        System.out.print("nilai y = " + y);



    }
}
