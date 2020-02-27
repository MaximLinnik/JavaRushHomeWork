package com.javarush.test.level17.lesson10.home01;

import java.util.*;

/* Общий список
1. Изменить класс Solution так, чтобы он стал списком. (Необходимо реализовать интерфейс java.util.List).
2. Список Solution должен работать только с целыми числами Long.
3. Воспользуйтесь полем original.
4. Список будет использоваться нитями, поэтому позаботьтесь, чтобы все методы были синхронизированы.
*/

public class Solution implements java.util.List<Long>{
    private  ArrayList<Long> original = new ArrayList<Long>();
    @Override//1
    public synchronized int size()
    {
        return original.size();
    }
    @Override//2
    public synchronized boolean isEmpty()
    {
        return original.isEmpty();
    }
    @Override//3
    public synchronized boolean contains(Object o)
    {
        return original.contains(o);
    }
    @Override//4
    public synchronized Iterator iterator()
    {
        return original.iterator();
    }
    @Override//5
    public synchronized Object[] toArray()
    {
        return original.toArray(new Object[original.size()]);
    }
    @Override//6
    public synchronized <T> T[] toArray(T[] a)
    {
        return original.toArray(a);
    }
    @Override//7
    public synchronized boolean add(Long aLong)
    {
        return original.add(aLong);
    }
    @Override//8
    public synchronized boolean remove(Object o)
    {
        return original.remove(o);
    }
    @Override//9
    public boolean containsAll(Collection c)
    {
        return original.containsAll(c);
    }
    @Override//10
    public synchronized boolean addAll(Collection c)
    {
        return original.addAll(c);
    }
    @Override//11
    public synchronized boolean addAll(int index, Collection c)
    {
        return original.addAll(index, c);
    }
    @Override//12
    public synchronized boolean removeAll(Collection c)
    {
        return original.removeAll(c);
    }
    @Override//13
    public synchronized boolean retainAll(Collection c)
    {
        return original.retainAll(c);
    }
    @Override//14
    public synchronized void clear()
    {
        original.clear();
    }
    @Override//15
    public synchronized Long get(int index)
    {
        return original.get(index);
    }
    @Override//16
    public synchronized Long set(int index, Long element)
    {
        return original.set(index,element);
    }
    @Override//17
    public synchronized void add(int index, Long element)
    {
        original.add(index,element);
    }
    @Override//18
    public synchronized Long remove(int index)
    {
        return original.remove(index);
    }
    @Override//19
    public synchronized int indexOf(Object o)
    {
        return original.indexOf(o);
    }
    @Override//20
    public synchronized int lastIndexOf(Object o)
    {
        return original.lastIndexOf(o);
    }
    @Override//21
    public synchronized ListIterator<Long> listIterator()
    {
        return original.listIterator();
    }
    @Override//22
    public synchronized ListIterator<Long> listIterator(int index)
    {
        return original.listIterator(index);
    }
    @Override//23
    public synchronized List<Long> subList(int fromIndex, int toIndex)
    {
        return original.subList(fromIndex , toIndex);
    }
}
