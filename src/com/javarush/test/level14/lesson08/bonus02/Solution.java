package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r =new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int nod;
        if (a > b){
            nod = a;
        } else nod = b;
        for (int i = nod; i >= 1; i--){
            if (a % i == 0 && b % i == 0){
                nod = i;
                break;
            }
        }

        System.out.println(nod);
    }
}
