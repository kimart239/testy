package com.company;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArray <T> {
    private T[] t;
    private T[] tCopy;
    private int Arr=20;
    private int sizeArr=0;

    public DynamicArray() {
        t = (T[]) new Object[Arr] ;
    }
    public void add(T el) {
        if (sizeArr == t.length) {
            tCopy = (T[]) new Object[t.length + 1];
            System.arraycopy(t, 0, tCopy, 0, sizeArr);//t копирует в tCopy
            t = tCopy;
        }
        t[sizeArr] = el;
        sizeArr++;
    }

    public void remove(int index) {
        for (int i = 0; i < t.length; i++) {
            if (i == index) {
                System.arraycopy(t, (i+1), t, i, (sizeArr - i - 1));//сам в себя копирует
                break;
            }
        }
        sizeArr--;
        t[sizeArr] = null;
    }

    public T get(int index) {
        return t[index];
    }

    public int size() {
        return sizeArr;
    }


      /*                                 вариант через ArrayList
    ArrayList<T> list;

    public DynamicArray() {
        list = new ArrayList <>();
    }
    public void add(T el) {
        list.add(el);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }
     */
}
