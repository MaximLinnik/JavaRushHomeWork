package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Макс on 05.12.2016.
 */
public class USD extends Money
{
    public USD(double amount)
    {
        super(amount);
    }

    public String getCurrencyName(){
        return "USD";
    }

}
