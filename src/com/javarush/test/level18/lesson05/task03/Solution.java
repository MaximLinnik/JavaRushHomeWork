package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream f1 = new FileInputStream(r.readLine());
        FileOutputStream f2 = new FileOutputStream(r.readLine());
        FileOutputStream f3 = new FileOutputStream(r.readLine());
        int count = f1.available();
        byte []buf = new byte[count];
        int half = count/2+count%2;
        f2.write(buf, 0, half);
        f3.write(buf, half, buf.length-half);
        r.close();
        f1.close();
        f2.close();
        f3.close();


    }
}
