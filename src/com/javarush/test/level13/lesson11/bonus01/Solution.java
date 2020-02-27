package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String name = r.readLine();
        File file = new File(name);
        Scanner sc = new Scanner(file);
        while (sc.hasNextInt()){
            int data = sc.nextInt();
            if(data%2==0)
                list.add(data);
        }

        Collections.sort(list);
        for (int i : list) {
            System.out.println(i);
        }

    }
}
