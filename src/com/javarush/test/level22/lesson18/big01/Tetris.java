package com.javarush.test.level22.lesson18.big01;

/**
 * Created by Макс on 18.12.2016.
 */
public class Tetris
{

    public Field field;
    public Figure figure;
    public static Tetris game;

    public void run(){}
    public void step(){}

    public Field getField()
    {
        return field;
    }

    public Figure getFigure()
    {
        return figure;
    }

    public static void main(String[]args){
        game = new Tetris();
        game.run();
    }
}
