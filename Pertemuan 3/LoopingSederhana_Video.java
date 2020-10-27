

import java.util.*;

public class LoopingSederhana_Video {
    public static void main(String[] args) {
        // Program untuk menjumlahkan angka dengan rentang
        int nilaiAwal, nilaiAkhir, total;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan Nilai Awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Masukan Nilai Akhir = ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;
        while (nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }
    }
}
