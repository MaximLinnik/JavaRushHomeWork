package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки
2.2 выбросить исключение DownloadException
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException,IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            while (true)
            {
                String s = r.readLine();
                FileInputStream input = new FileInputStream(s);
                if (input.available() < 1000)
                {
                    r.close();
                    input.close();
                    throw new DownloadException();
                }

            }
    }

    public static class DownloadException extends Exception{

    }
}
