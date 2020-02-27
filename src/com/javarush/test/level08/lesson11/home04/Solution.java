package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        Iterator<Integer> it = array.iterator();
        int min = it.next();
        while(it.hasNext()){
            int temp=it.next();
            if(temp<min)
                min=temp;
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<Integer>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(r.readLine());
        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(r.readLine()));
        }
        return list;
    }
}
