package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by Макс on 17.12.2016.
 */
public class Hippodrome
{
    public ArrayList<Horse> horses = new ArrayList<>();;
    public static Hippodrome game;

    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public void move(){}
    public void print(){}
    public void run(){}


    public static void main(String[] args) {
        game = new Hippodrome();
        Horse horse1 = new Horse("Horse1",3,0);
        Horse horse2 = new Horse("Horse2",3,0);
        Horse horse3 = new Horse("Horse3",3,0);
        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);

    }
}
