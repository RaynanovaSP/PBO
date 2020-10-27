
public class Komparasi {
    public static void main(String[] args) {

        // operator komparasi .. menghasilkan nilai  dalam bentuk boolean
        int a,b;
        boolean hasil;

        // operator  equal atau persamaan
        System.out.println("----------- Persamaan ");
        a = 12;
        b = 12;
        hasil = (a == b);
        System.out.printf("%d = %d ---> %s \n",a,b,hasil);

        a = 12;
        b = 8;
        hasil = (a == b);
        System.out.printf("%d = %d ---> %s \n",a,b,hasil);

        // operator not equal atau pertidaksamaan
        System.out.println("------- Pertidaksamaan");
        a = 9;
        b = 9;
        hasil = (a != b);
        System.out.printf("%d != %d ---> %s \n",a,b,hasil);

        a = 9;
        b = 6;
        hasil = (a != b);
        System.out.printf("%d != %d ---> %s \n",a,b,hasil);

        // operator grater than atau kurang dari
        System.out.println("-------- Kurang dari");
        a = 12;
        b =13;
        hasil = (a < b);
        System.out.printf("%d < %d ---> %s \n",a,b,hasil);

        a = 13;
        b = 9;
        hasil = (a < b);
        System.out.printf("%d < %d ---> %s \n",a,b,hasil);

        // operator grater than atau Lebih dari
        System.out.println("-------- Lebih dari");
        a = 18;
        b = 13;
        hasil = (a > b);
        System.out.printf("%d > %d ---> %s \n",a,b,hasil);

        a = 3;
        b = 9;
        hasil = (a > b);
        System.out.printf("%d > %d ---> %s \n",a,b,hasil);

        // operator grater than atau kurang dari sama dengan
        System.out.println("-------- Kurang dari sama dengan");
        a = 12;
        b =13;
        hasil = (a <= b);
        System.out.printf("%d <= %d ---> %s \n",a,b,hasil);

        a = 13;
        b =12;
        hasil = (a <= b);
        System.out.printf("%d <= %d ---> %s \n",a,b,hasil);

        a = 9;
        b = 9;
        hasil = (a <= b);
        System.out.printf("%d <= %d ---> %s \n",a,b,hasil);

        // operator grater than atau Lebih dari sama dengan
        System.out.println("-------- Lebih dari sama dengan");
        a = 13;
        b = 18;
        hasil = (a >= b);
        System.out.printf("%d >= %d ---> %s \n",a,b,hasil);

        a = 18;
        b = 13;
        hasil = (a >= b);
        System.out.printf("%d >= %d ---> %s \n",a,b,hasil);

        a = 9;
        b = 9;
        hasil = (a >= b);
        System.out.printf("%d >= %d ---> %s \n",a,b,hasil);


    }
}
