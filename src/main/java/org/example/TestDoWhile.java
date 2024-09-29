package org.example;

import java.util.Scanner;

public class TestDoWhile {
    public static void main( String[] args){
        int data;
         int sum = 0;
        Scanner input = new Scanner (System.in);
        do{
         System.out.println("Enter an integer (the input ends if it is 0)");
         data = input.nextInt();

        sum += data;
          } while (data !=0);
         System.out.println("The sum is " + sum);


        //Scanner input = new Scanner(System.in);
        int number, max;
        number = input.nextInt();
        max = number;
        do{
            number = input.nextInt();
            if (number > max)
                max = number;
        } while (number != 0);
        System.out.println("max is " + max);
        System.out.println("number " + number);
    }
}
