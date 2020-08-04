package ru.geekbrains.samples.dao;

public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {

    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public String perform() {
        return ("JUGGLING " + beanBags + " BEANBAGS");
    }
}