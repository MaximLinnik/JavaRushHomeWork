package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception{
        String wtf = args[0];
        int spaceCount = 0, all = 0;
        FileInputStream inputStream = new FileInputStream(wtf);
        while (inputStream.available()>0)
        {
            int data = inputStream.read();
            all++;
            if ((char)data== ' '){
                spaceCount++;
            }
        }
        double result = ((double)spaceCount/(double)all)*100;
        System.out.println(String.format("%.2f",result ));
        inputStream.close();
    }
}
