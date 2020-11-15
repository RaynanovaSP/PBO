package com.pbo;
// class abstract
abstract class Hewan{
    //abstract method (tidak memiliki body)
    public abstract void suaraHewan();

    //regular method
    public void tidur(){
        System.out.println("Zzz....");
    }
}
//subclass (turunan dari class hewan)
class Ayam extends Hewan {
    public void suaraHewan(){
        //bodu dari abstract method suaraHewan() ditulis disini
        System.out.println("Kuuuuuukuuuuuruuuyuuk......");
    }
}

class Kucing extends Hewan{
    public void suaraHewan(){
        //body dari abstract method suaraHewan()
        //ditulis disini
        System.out.println("Meong..meong...");
    }
}
public class Main {

    public static void main(String[] args) {
        // write your code here
        Ayam ayamku = new Ayam(); // membuat objek ayam
        ayamku.suaraHewan();
        ayamku.tidur();
        Kucing kucingku = new Kucing();
        kucingku.suaraHewan();
    }
}
