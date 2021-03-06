package com.javarush.test.level22.lesson05.task01;

import java.util.ArrayList;
import java.util.List;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static String getPartOfString(String string)throws TooShortStringException
    {
        if(string==null) throw new TooShortStringException();
        String result = null;
        List<Integer> indexesOfProbel = new ArrayList<>();
        char[] temp = string.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == ' ') {
                indexesOfProbel.add(i);
            }
        }
        try {
            result = string.substring(indexesOfProbel.get(0) + 1, indexesOfProbel.get(4));
        } catch (Exception e) {
            throw new TooShortStringException();
        }
        return result;
    }


    public static class TooShortStringException extends Throwable{
    }

    public static void main(String[] args) throws TooShortStringException {
        String str="JavaRush - лучший сервис обучения Java.";
        System.out.println(getPartOfString(null));
    }
}
