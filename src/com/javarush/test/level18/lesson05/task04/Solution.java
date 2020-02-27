package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream f1 = new FileInputStream(r.readLine());
        FileOutputStream f2 = new FileOutputStream(r.readLine());
        int count=f1.available()-1;
        byte[]mas = new byte[f1.available()];
        while (f1.available()>0){
            mas[count]=(byte)f1.read();
            count--;
        }
        f2.write(mas);
        r.close();
        f1.close();
        f2.close();

    }
}
