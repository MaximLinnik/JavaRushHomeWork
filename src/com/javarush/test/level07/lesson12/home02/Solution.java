package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> temp = new ArrayList<String>();
        int N=Integer.parseInt(reader.readLine());
        int M=Integer.parseInt(reader.readLine());
        for(int i=0;i<N;i++){
            list.add(reader.readLine());
        }
        for(int i=0;i<M;i++){
            temp.add(list.get(i));
        }
        for(int i=0;i<M;i++){
            list.remove(0);
        }
        int s=list.size();
        for(int i=0;i<M;i++)
            list.add(s+i,temp.get(i));

       //for(int i=0;i<M;i++)
      //     list.add(s+i,temp.get(i));

        for(String l:list)
            System.out.println(l);



    }
}
