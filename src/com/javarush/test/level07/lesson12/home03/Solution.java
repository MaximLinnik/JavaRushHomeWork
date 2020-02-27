package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum=Integer.parseInt(reader.readLine());
        int  minimum=maximum;
        int s;
        for(int i=1;i<20;i++){
          s=Integer.parseInt(reader.readLine());
            if(s>maximum) maximum=s;
            if(s<minimum) minimum=s;
        }




        System.out.print(maximum+" ");
        System.out.println(minimum);
    }
}
