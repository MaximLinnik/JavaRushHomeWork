package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int i=1;
        FileReader reader = new FileReader(r.readLine());
        FileWriter writer = new FileWriter(r.readLine());
        while (reader.ready()){
            if(i%2==0){
                int data = reader.read();
                writer.write(data);
            }
            else {
                int data = reader.read();
            }
            i++;
        }

        reader.close();
        writer.close();
    }
}
