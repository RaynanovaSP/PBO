package com.pbo;
import java.util.Scanner;

abstract class bentuk{
    //abstract method
    abstract void luas();
}

class Segitiga extends bentuk {
    int alas;
    int tinggi;
    double luas;

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public void luas() {
        luas = alas * tinggi * 0.5;
        System.out.println("Luas Segitigas adalah 0.5 x " + alas + " x " + tinggi + " = " + luas);
    }
}

    class Lingkaran extends bentuk {
        int diameter;
        double luas;
        double pi;

        public int getDiameter() {
            return diameter;
        }

        public void setDiameter(int diameter) {
            this.diameter = diameter;
        }

        public void luas() {
            if (diameter % 7 == 0) {
                pi = 22 / 7;
            } else {
                pi = 3.14;
            }
            luas = pi * (((double) diameter / 2) * ((double) diameter / 2));
            System.out.println("Luas Lingkaran adalah pi x " + diameter + "^2 = " + luas);
        }
    }

    public class InputLuasSegitiga {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            Segitiga segitiga = new Segitiga();
            Lingkaran lingkaran = new Lingkaran();

            int alas;
            int tinggi;
            int diameter;

            System.out.println("==== Program Hitung Luas Segitiga ==== ");
            System.out.print("Masukan Alas : ");
            alas = input.nextInt();
            segitiga.setAlas(alas);
            System.out.print("Masukan Tinggi : ");
            tinggi = input.nextInt();
            segitiga.setTinggi(tinggi);
            segitiga.luas();


            System.out.println("\n\n==== Program Hitung Luas Lingkaran ==== ");
            System.out.print("Masukkan Diameter = ");
            diameter = input.nextInt();
            lingkaran.setDiameter(diameter);
            lingkaran.luas();
        }
    }
