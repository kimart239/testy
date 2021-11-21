package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        DynamicArray<String> array = new DynamicArray<>();
        int count = 0;
        while (count < 20) {

            array.add("Privet" + count);
            count++;
        }
        array.remove(5);
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
