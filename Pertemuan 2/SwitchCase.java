

import java.util.*;

public class SwitchCase{
        public static void main(String[] args) {
    //SwitchCase

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Panggil nama : ");
        input = inputUser.next();

        // ekspressinya berupa satuan (int,long,byte,short). String, atau enum
        switch(input){
            case"reno":
                System.out.println("Saya Reno dan Hadirr");
                break;
            case "agus":
                System.out.println("Saya Agus dan Hadir");
                break;
            case "budi" :
                System.out.println("Saya Budi dan Hadir");
                break;
            default:
                System.out.println(input + " Tidak hadir ");
        }
        System.out.println(" Program Selesai");
    }
}
