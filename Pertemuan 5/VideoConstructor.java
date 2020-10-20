//class polos
class Polos{
    String dataString;
    int dataInteger;
}
//class dengan constructor
class mahasiswA{
    String nama;
    String NIM;
    String jurusan;

    // constructor dipanggil saat object pertama kali dibuat
    // constructor dengan parameter
    mahasiswA(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;
        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}
public class VideoConstructor {
    public static void main(String[] args) throws Exception {
        mahasiswA mahasiswa1 = new mahasiswA("ucup","13305041","teknik perteknikan");
        mahasiswA mahasiswa2 = new mahasiswA("otong","13305042","teknik pertambangan");
    }
}