package com.introductiontooops.bird;

public abstract class Bird implements Dance{

    protected String name;
    protected String color;

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }
    //This method is marked with Abstract keyword
    //This means that any classes extending on Bird must implement this
    //Abstract methods don't have a method body
    public abstract void speak();

    /*public void speak() {
        System.out.println("My name is " + name + " and I am a " + color + " bird.");
    }*/

    public void fly() {
        System.out.println("I'm " + name + " and I can fly high in the blue sky!");
    }

    public void spin() {
        System.out.println(name + " spin!");
    }

    public void doTheCaterpillar() {
        System.out.println(name + " do the wriggly woo!");
    }

    public void jump() {
        System.out.println(name + " jump in the air!");
    }

    public static void main(String[] args){
        // Abstract classes cannot be instantiated, so let's remove the following code from main method in the Main class.
       /* Bird myBird = new Bird("Tweety", "Yellow");
        myBird.speak();
        myBird.fly(); */
    }
}
