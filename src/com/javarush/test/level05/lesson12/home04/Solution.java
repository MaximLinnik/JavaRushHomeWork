package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
        Date d = new Date();
        String day;
        String month;
        String year;
        year =Integer.toString(d.getYear()+1900);
        if((d.getMonth()+1)<10)
            month = "0"+Integer.toString(d.getMonth()+1);
        else
            month = Integer.toString(d.getMonth()+1);
        if((d.getDay()+18)<10)
            day = "0"+Integer.toString(d.getDay()+18);
        else
            day = Integer.toString(d.getDay()+18);
        System.out.println(day+" "+month+" "+year);
    }
}
