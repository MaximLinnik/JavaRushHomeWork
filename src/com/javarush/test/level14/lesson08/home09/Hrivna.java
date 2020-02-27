package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Макс on 05.12.2016.
 */
public class Hrivna extends Money
{
    public Hrivna(double amount)
    {
        super(amount);
    }

    public String getCurrencyName(){
        return "HRN";
    }
}
