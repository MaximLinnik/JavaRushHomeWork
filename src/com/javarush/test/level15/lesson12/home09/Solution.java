package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args)   {
        BufferedReader r  = new BufferedReader(new InputStreamReader(System.in));
        String alert=null;
        int numBeg=0,numEnd=0;
        try
        {
            String address = r.readLine();


                int beg =  address.indexOf("?");
                int len=beg;
                String t=address.substring(beg+1,address.length());
                String[] res = t.split("&");
                for(int i=0;i<res.length;i++){
                    if(res[i].contains("obj=")&& res[i].substring(0,3).equals("obj")){
                         numBeg = res[i].indexOf("=");
                        alert = res[i].substring(numBeg+1,res[i].length());
                    }
                    if(res[i].contains("=")){
                        res[i]=res[i].substring(0,res[i].indexOf("="));
                        if(i!=res.length-1)
                            System.out.print(res[i]+" ");
                        else System.out.print(res[i]);
                    }
                    else System.out.print(res[i]+" ");
                }

                if(alert!=null){
                    System.out.println("");
                    alert(Double.parseDouble(alert));
                    }
        }
        catch (Exception e){
            alert(alert);}

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
