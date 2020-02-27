package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        int[]a1 = new int[5];
        for(int i=0;i<5;i++){
            a1[i]=1;
        }

        int[]a2 = new int[2];
        for(int i=0;i<2;i++){
            a2[i]=2;
        }

        int[]a3 = new int[4];
        for(int i=0;i<4;i++){
            a3[i]=3;
        }

        int[]a4 = new int[7];
        for(int i=0;i<7;i++){
            a4[i]=4;
        }

        int[]a5 = new int[0];

        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
