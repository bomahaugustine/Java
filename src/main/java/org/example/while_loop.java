package org.example;

public class while_loop {
    public static void main(String[] args) {
        int count = 0;
        while (count < 100) {
            //System.out.println("Welcome to Java!");
            count++;
        }

        //loop count
        int sum = 0, i = 1;
        while (i < 10) {
            sum = sum + i;
            i++;
        }
        // System.out.println("sum is " + sum); // sum is 45

        //fact of a number
        int fact = 1, m = 1;
        while (m <= 5) {
            fact = fact * m;
            m++;
        }
        // System.out.println("factorial of"  + 5 +  "is"  + fact);

        int a = 1, b = 10, firstPosition = 3, secondPosition = 7, nextPosition = 0;
        System.out.println("The Tenth fibunacci Series of 3 is:");

        while (a <= b){
             nextPosition = firstPosition + secondPosition;
            firstPosition = secondPosition;
            secondPosition = nextPosition;
            a++;
        }
        System.out.println(firstPosition + "next");
    }
}