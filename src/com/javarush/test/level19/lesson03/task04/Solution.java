package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner{
        public Person person;
        public Scanner scanner;

        public PersonScannerAdapter(Scanner scanner){
            this.scanner=scanner;
        }

        public Person read() throws IOException{
            Person person;
            String[]res = scanner.nextLine().split(" ");
            int month=Integer.parseInt(res[4])-1;
            int year=Integer.parseInt(res[5]);
            int day=Integer.parseInt(res[3]);
            Calendar calendar = new GregorianCalendar(year, month, day);
            person = new Person(res[1], res[2], res[0], calendar.getTime());
            return person;
        }

       public void close() throws IOException{
           scanner.close();

       }

    }
}
