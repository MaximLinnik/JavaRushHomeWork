package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String reader = r.readLine();
        String writer = r.readLine();
        FileReader fileReader = new FileReader(reader);
        FileWriter fileWriter = new FileWriter(writer);
        String line = "";
        while (fileReader.ready()) {
            int data = fileReader.read();
            char symbol = (char) data;

            line += symbol;
        }
       line =  line.replaceAll("\\.", "\\!");
        fileWriter.write(line);

        r.close();
        fileReader.close();
        fileWriter.close();



    }
}
