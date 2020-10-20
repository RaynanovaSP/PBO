package com.pbo;

public class Construction2 {
    int modelYear;
    String modelName;
    public Construction2(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Construction2 myCar = new Construction2(1969, "Mustang");
        System.out.println(myCar.modelYear + " " +myCar.modelName);
    }
}
