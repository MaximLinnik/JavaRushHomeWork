package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader r  = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());
        if(a>b && a>c){
            if(b>c)
                System.out.println(b);
            else
                System.out.println(c);
        }
        else if(b>c && b>a){
            if(a>c)
                System.out.println(a);
            else
                System.out.println(c);
        }
        else if(c>b && c>a){
            if(a>b)
                System.out.println(a);
            else
                System.out.println(b);
        }
    }
}
