package com.introductiontooops.bird;

public class Penguin extends Bird {

    public Penguin(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + color + " penguin.");
    }

    @Override
    public void fly() {
        System.out.println("Whoops, I can't fly. Waddle waddle.");
    }

    public static void main(String args[]) {
        Penguin penguin = new Penguin("Penguin", "Black & White");
        penguin.speak();
        penguin.fly();

        penguin.spin();
        penguin.doTheCaterpillar();
        penguin.jump();
    }
}
