package com.pbo;
public class Main {
    public static void main(String[] args) {
        Triangle a = new Triangle(10, 20);
        System.out.println(a.getArea());
        Rectangle b = new Rectangle(5, 15);
        System.out.println(b.getArea());
    }
}