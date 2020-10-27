
import java.util.Scanner;

public class Input_Aritmatika {
    public static void main(String[] args) {

        Scanner userInput =  new  Scanner(System.in);

        int panjang,lebar,luas,tinggi,volume;
        System.out.println("Menghitung Luas");

        System.out.print("panjang = ");
        panjang = userInput.nextInt();

        System.out.print("lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = "+ luas);

        System.out.println("Menghitung Volume");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();

        volume = luas*tinggi;
        System.out.println("Volume = " + volume);

    }

}
