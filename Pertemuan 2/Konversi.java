

public class Konversi {

    public static void main(String[] args) {
        // Program Mengonversi tipe data

        int nilaiInt = 35; // 32-bit
        System.out.println("nilaiInt = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar
        long nilailong = nilaiInt;
        System.out.println("long = " + nilailong);

        // Mempertkecil rentang ke tipe data yang lebih kecil
        byte nilaibyte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaibyte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);

        // Casting pembagian
        int a = 9;
        float b = 5;
        float c = a/b;
        System.out.printf("%d / %f = %f \n",a,b,c);

        int x = 9;
        int y = 5;
        float z = (float)x/y;
        System.out.printf("%d / %d = %f",x,y,z);
    }
}
