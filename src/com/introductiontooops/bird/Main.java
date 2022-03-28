package com.introductiontooops.bird;

public class Main {
    public static void main(String[] args){
        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.sleep();
        pippa.spin();
        pippa.doTheCaterpillar();
        pippa.jump();

        Penguin penguin = new Penguin("Penguin", "Black & White");
        penguin.speak();
        penguin.fly();
        penguin.spin();
        penguin.doTheCaterpillar();
        penguin.jump();

        Parrot parrot = new Parrot("Parrot", "Green");
        parrot.speak();
        parrot.fly();
    }
}
