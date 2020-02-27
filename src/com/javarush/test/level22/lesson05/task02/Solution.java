package com.javarush.test.level22.lesson05.task02;

/* Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
*/
public class Solution {
    public static String getPartOfString(String string)throws TooShortStringException {
        String fin=null,t;
        try{
            if(string==null)new TooShortStringException();
            int index = string.indexOf("\t");
            if(index==-1)new TooShortStringException();
            int index2=0;
            index++;
               t=string.substring(index,string.length());
               index2=t.indexOf("\t");
               if(index2==-1)new TooShortStringException();
                index2+=index;
            fin=string.substring(index,index2);
        }
        catch (Exception e){
            throw  new TooShortStringException();
        }

        return fin;
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("tab0\ttab\ttab1\t"));       //tab
        System.out.println(getPartOfString("\t\t"));                    //
        System.out.println(getPartOfString("123\t123"));                //Exception
        System.out.println(getPartOfString(null));                      //Exception
    }
}
