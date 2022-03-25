package com.introductiontooops.bird;

public class Pigeon extends Bird {

    //The Pigeon constructor calls the base class Bird constructor
    //The name and color parameters are passed to the Bird constructor
    public Pigeon(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + color + " pigeon.");
    }

    public void eatPizza() {
        System.out.println("Delicious pizza!");
    }

    public void sleep() {
        System.out.println("I'm a sleeping pigeon!");
    }

    public static void main(String args[]){
        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.sleep();

        pippa.spin();
        pippa.doTheCaterpillar();
        pippa.jump();
    }
}