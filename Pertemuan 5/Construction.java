package com.pbo;

public class Construction {
    int x;

    public Construction(int y){
        x = y;
    }

    public static void main(String[] args) {
        Construction myObj = new Construction(5);
        System.out.println(myObj.x);
    }
}
