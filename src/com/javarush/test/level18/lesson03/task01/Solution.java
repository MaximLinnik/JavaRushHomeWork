package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String name = r.readLine();
        FileInputStream file = new FileInputStream(name);
        int max = file.read();
        while (file.available()>0){
            int x = file.read();
            if(x>max)
                max = x;
        }
        file.close();
        System.out.println(max);
    }
}
