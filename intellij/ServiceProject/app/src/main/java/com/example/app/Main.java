package com.example.app;

import com.example.util.SortUtil;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java 9 Module Services");

        List<String> fruits = Arrays.asList(
                "grape", "apple", "mango", "pineapple");

        Iterable<SortUtil> sortUtils = ServiceLoader.load(SortUtil.class);
        for (SortUtil sortUtil : sortUtils) {
            fruits = sortUtil.sortList(fruits);
        }

        System.out.println("sorted : " + fruits);
    }
}
