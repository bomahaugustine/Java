package org.example;

public class for_loop {
    public static void main(String [] args){
        for (int i = 0; i < 100; i++) {
            System.out.println("Welcome to Java!");
        }
        int sum = 0;
        for (int i = 1; i < 10; ++i){
            sum += i;
        }
        System.out.println("Sum is: " + sum);
    }
}
