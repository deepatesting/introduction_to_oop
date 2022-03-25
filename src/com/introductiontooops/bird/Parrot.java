package com.introductiontooops.bird;

public class Parrot extends Bird {

    //The Pigeon constructor calls the base class Bird constructor
    //The name and color parameters are passed to the Bird constructor
    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + color + " parrot.");
        System.out.println("I can speak funny!!");
    }

    public static void main(String args[]){
        Parrot parrot = new Parrot("Parrot", "Green");
        parrot.speak();
        parrot.fly();
    }
}

