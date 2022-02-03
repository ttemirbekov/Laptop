package com.company;

public class Main {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setName("DEll");
        laptop.setMemory(256);
        laptop.setColor("Black");
        laptop.setCPU("i5");

        System.out.println("The name of laptop and parameters: " + laptop.getName() + " " + laptop.getMemory() + " " + laptop.getColor() + " " + laptop.getCPU());
        System.out.println();
        laptop.turnOn();
        laptop.shutDown();
    }
}
