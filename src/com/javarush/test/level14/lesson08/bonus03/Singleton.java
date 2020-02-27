package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Макс on 05.12.2016.
 */
public final class Singleton
{
    private final static Singleton fin = new Singleton();
    private Singleton(){

    }

    public static Singleton getInstance(){
       return fin;
    }

}
