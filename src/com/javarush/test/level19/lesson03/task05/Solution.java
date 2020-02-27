package com.javarush.test.level19.lesson03.task05;

import java.util.HashMap;
import java.util.Map;

/* Закрепляем адаптер
Адаптировать Customer и Contact к RowItem.
Классом-адаптером является DataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
*/

public class Solution {
    private static Map<String,String> countries = new HashMap<String,String>();
    static{
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }
    public static class DataAdapter implements RowItem{
        Customer customer;
        Contact contact;
        public DataAdapter(Customer customer, Contact contact) {
            this.contact=contact;
            this.customer = customer;
        }

        public String getCountryCode(){
            String countryCode = null;
            String countryName = customer.getCountryName();
            for(Map.Entry<String, String> pair: countries.entrySet()){
                if(pair.getValue().equals(countryName))
                    countryCode = pair.getKey();
            }
            return countryCode;
        }
        public String getCompany(){return customer.getCompanyName();}
        public String getContactFirstName(){
            String []name = contact.getName().split(", ");
            return name[1];
        }
        public String getContactLastName(){
            String []name = contact.getName().split(", ");
            return name[0];
        }
        public String getDialString(){
            return "callto://+" + contact.getPhoneNumber().replaceAll("[^0-9]", "");

        }

    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }

}