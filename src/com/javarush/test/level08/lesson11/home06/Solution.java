package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human kid1=new Human();
        kid1.name="kid1";
        kid1.sex=true;
        kid1.age=5;

        Human kid2=new Human();
        kid2.name="kid2";
        kid2.sex=true;
        kid2.age=5;

        Human kid3=new Human();
        kid3.name="kid3";
        kid3.sex=true;
        kid3.age=5;

        Human father=new Human();
        father.name="father";
        father.sex=true;
        father.age=40;
        father.children.add(kid1);
        father.children.add(kid2);
        father.children.add(kid3);

        Human mother=new Human();
        mother.name="mother";
        mother.sex=false;
        mother.age=30;
        mother.children.add(kid1);
        mother.children.add(kid2);
        mother.children.add(kid3);

        Human gf1=new Human();
        gf1.name="gf1";
        gf1.sex=true;
        gf1.age=60;
        gf1.children.add(father);

        Human gm1=new Human();
        gm1.name="gm1";
        gm1.sex=false;
        gm1.age=58;
        gm1.children.add(father);

        Human gf2=new Human();
        gf2.name="gf2";
        gf2.sex=true;
        gf2.age=56;
        gf2.children.add(mother);

        Human gm2=new Human();
        gm2.name="gm2";
        gm2.sex=true;
        gm2.age=56;
        gm2.children.add(mother);

        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(gf1);
        System.out.println(gm1);
        System.out.println(gf2);
        System.out.println(gm2);

    }

    public static class Human
    {
       public String name;
        public boolean sex;
        public int age;
        public  ArrayList<Human> children=new ArrayList<Human>();

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
