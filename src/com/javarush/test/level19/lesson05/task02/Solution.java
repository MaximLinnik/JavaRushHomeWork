package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fName = reader.readLine();
        FileReader fileReader = new FileReader(fName);
        BufferedReader reader1 = new BufferedReader(fileReader);
        int count = 0;
        while (reader1.ready()){
            String[] words = reader1.readLine().split("\\W+");
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals("world")){
                    count++;
                }
            }
        }
        System.out.println(count);
        fileReader.close();
        reader.close();
        reader1.close();
    }
}
