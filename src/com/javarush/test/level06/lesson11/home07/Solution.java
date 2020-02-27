package com.javarush.test.level06.lesson11.home07;

import java.util.ArrayList;

/* Три статические переменных name
Создай 3 public статических переменных: String Solution.name, String Cat.name, String Dog.name
*/

public class Solution
{
    public static String name;
    public static class Cat {
        public static String name;
    }

    public static class Dog {
        public static String name;
    }
    public  static void main(String []args){
        Solution s = new Solution();
        Cat c = new Cat();
        Dog d  =new Dog();
        String a ="sdf";
        Cat.name =  a;
        Solution.name =  a;
        Dog.name =  a;
    }
}
