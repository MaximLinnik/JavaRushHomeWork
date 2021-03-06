package com.javarush.test.level19.lesson10.home06;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static com.javarush.test.level18.lesson08.task03.AmigoOutputStream.fileName;

/* Замена чисел
1. В статическом блоке инициализировать словарь map парами [число-слово] от 0 до 12 включительно
Например, 0 - "ноль", 1 - "один", 2 - "два"
2. Считать с консоли имя файла
3. Заменить все числа на слова используя словарь map
4. Результат вывести на экран
5. Закрыть потоки. Не использовать try-with-resources

Пример данных:
Это стоит 1 бакс, а вот это - 12 .
Переменная имеет имя file1.
110 - это число.

Пример вывода:
Это стоит один бакс, а вот это - двенадцать .
Переменная имеет имя file1.
110 - это число.
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(1,"один");map.put(2,"два");map.put(3,"три");
        map.put(4,"четыре");map.put(5,"пять");map.put(6,"шесть");
        map.put(7,"семь");map.put(8,"восемь");map.put(9,"девять");
        map.put(10,"десять");map.put(11,"одиннадцать");
        map.put(12,"двенадцать");map.put(0,"ноль");
    }
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        InputStream input = new FileInputStream(r.readLine());
        byte[] buff = new byte[input.available()];
        input.read(buff);
        String change = new String(buff);
        for (int i=0; i<=12;i++)
        {
            change = change.replaceAll(("(\\W)("+i+")(\\W)"), "$1"+map.get(i)+"$3");
        }



        input.close();
        r.close();


    }
}
