package com.gla.topic.level2;
import java.util.*;

public class FibonacciDemo {

    public static void printFibonacci(int terms) {
        int a = 0, b = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter terms: ");
        int terms = sc.nextInt();

        printFibonacci(terms);
    }
}