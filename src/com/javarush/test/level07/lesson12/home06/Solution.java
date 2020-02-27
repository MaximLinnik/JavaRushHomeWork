package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human gf1 = new Human("gf1",true,50,null,null);
        Human gf2 = new Human("gf2",true,50,null,null);
        Human gm1 = new Human("gm1",false,53,null,null);
        Human gm2 = new Human("gm2",false,51,null,null);
        Human f = new Human("f",true,45,gf1,gm2);
        Human m = new Human("m",false,43,gf2,gm2);
        Human k1 = new Human("k1",true,16,f,m);
        Human k2 = new Human("k2",true,16,f,m);
        Human k3 = new Human("k3",true,16,f,m);
        System.out.println(gf1);
        System.out.println(gf2);
        System.out.println(gm1);
        System.out.println(gm2);
        System.out.println(f);
        System.out.println(m);
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);


    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name,boolean sex,int age,Human father,Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
