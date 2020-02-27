package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        int age;
        int tall;
        boolean sex;
        String name;
        String secondName;
        String address;

        public Human(int age,int tall,boolean sex,String name,String secondName,String address){
            this.age=age;
            this.tall=tall;
            this.sex=sex;
            this.name=name;
            this.secondName=secondName;
            this.address=address;
        }

        public Human(){
            this.age=4;
            this.tall=10;
            this.sex=true;
            this.name="dsf";
            this.secondName="dsf";
            this.address="dfgdg";
        }

        public Human(int tall,boolean sex,String name,String secondName,String address){

            this.tall=tall;
            this.sex=sex;
            this.name=name;
            this.secondName=secondName;
            this.address=address;
        }

        public Human(boolean sex,String name,String secondName,String address){
            this.sex=sex;
            this.name=name;
            this.secondName=secondName;
            this.address=address;
        }

        public Human( int age,int tall,String name,String secondName,String address){
            this.age=age;
            this.tall=tall;
            this.name=name;
            this.secondName=secondName;
            this.address=address;
        }

        public Human( int age,int tall,boolean sex,String secondName,String address){
            this.age=age;
            this.tall=tall;
            this.sex=sex;
            this.secondName=secondName;
            this.address=address;
        }

        public Human( int age,int tall,boolean sex,String address){
            this.age=age;
            this.tall=tall;
            this.sex=sex;
            this.address=address;
        }

        public Human( int age){
            this.age=age;
        }

        public Human(boolean sex){
            this.sex=sex;
        }

        public Human(String address){
            this.address=address;
        }
    }
}
