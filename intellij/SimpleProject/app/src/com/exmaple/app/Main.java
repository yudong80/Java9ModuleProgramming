package com.exmaple.app;

import com.example.library.GreetingsLibrary;
import com.example.xmllib.SimpleParser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java 9 Module Programming");
        String hello = GreetingsLibrary.getString();
        System.out.println("My Greeting : " + hello);
        System.out.println("Root Node:" + SimpleParser.getRootNode());
    }
}
