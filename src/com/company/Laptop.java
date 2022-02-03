package com.company;

public class Laptop {
    private String name;
    private  int memory;
    private String color;
    private String CPU;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

        void turnOn(){
            System.out.println("Laptop can turn on by itslef");
        }
        void shutDown(){
            System.out.println("Laptop can shut down by itself");

        }
    }
