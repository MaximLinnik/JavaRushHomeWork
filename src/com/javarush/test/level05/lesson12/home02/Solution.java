package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man m = new Man("sd",4,"sdf");
        Woman w = new Woman("sd",4,"sdf");

        System.out.println(m.name + " " + m.age + " " + m.address);
        System.out.println(w.name + " " + w.age + " " + w.address);
    }

    public static class Man{
        private String name;
        private int age;
        private String address;
        public Man(String name, int age,String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
    }

    public static class Woman{
        private String name;
        private int age;
        private String address;
        public Woman(String name, int age,String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
    }
}
