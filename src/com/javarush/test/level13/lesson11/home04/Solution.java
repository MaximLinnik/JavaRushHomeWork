package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String  name = r.readLine();
        FileOutputStream output = new FileOutputStream(name);
        String escape ="";
        while (!escape.equals("exit")){
            escape=r.readLine();
            String save =escape+"\r\n";
            output.write(save.getBytes());
        }
        output.close();
        r.close();

    }
}
