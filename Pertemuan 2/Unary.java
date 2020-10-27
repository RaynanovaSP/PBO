

public class Unary {
    public static void main(String[] args) {
        // Unary = Operasi yang dilakukan pada satu variabel

        // Unary + dan -
        int angka = 3;
        System.out.printf("Unary + , %d menjadi %d \n", angka, +angka);
        System.out.printf("Unary - , %d menjadi %d \n", angka, -angka);

        // Unary decrement dan increment
        int angka2 = 8;
        angka2++;
        System.out.println("Nilai dengan ++ menjadi = " +angka2);

        int angka3 = 8;
        angka3--;
        System.out.println("Nilai dengan -- menjadi = " +angka3);

        int a = 3;
        System.out.printf("Nilai dengan prefix ++ menjadi = %d \n ",++a);

        int b = 2;
        System.out.printf("Nilai dengan ++ postfix menjadi = %d \n ",b++);
        System.out.printf("Nilai dengan ++ postfix menjadi = %d \n ",b);

        //Unary boolean dengan ! untuk negasi
        boolean raynanova = true;
        System.out.printf("Nilai boolean = " + raynanova);
        System.out.printf("\n Nilai boolean = " + !raynanova);

    }
}

