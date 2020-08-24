package com.qa.day11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class LaptopRunner {

    public static void main(String[] args) throws IOException {
        Laptop l1 = new Laptop("Samsung");
        Laptop l2 = new Laptop("Samsung");
        Laptop l3 = new Laptop("Samsung");
        Laptop l4 = new Laptop("Samsung");

        System.out.println(l1.getLaptopsSerialNumber());
        System.out.println(l2.getLaptopsSerialNumber());
        System.out.println(l3.getLaptopsSerialNumber());
        System.out.println(l4.getLaptopsSerialNumber());

        System.out.println(Laptop.getSerialNumber());

        FileOutputStream fileStream = new FileOutputStream("MyLaptops.ser");
        ObjectOutputStream os = new ObjectOutputStream(fileStream);

        os.writeObject("hello");
        os.close();

    }
}
