package com.gla.string.level1;

public class NullPointerDemo {

    public static void main(String[] args) {

        String text = null;

        // This line will throw NullPointerException
        System.out.println(text.length());
    }
}
