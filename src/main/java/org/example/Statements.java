package org.example;
//Controlling the direction of the variables using (If statements)
import java.util.Scanner;
public class Statements {

    public static void main(String [] args){
        Scanner Rid = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Rid.nextInt();

//if statement
        if (number >= 5){
            System.out.println("you will not get a penny from me ");
        } else {
            System.out.println("you have got a penny");
        }

        System.out.println("Number of people");
        int people = Rid.nextInt();
        if (people <= 15){
            System.out.println("Pick up a bus");
        } else {
            System.out.println("Board a Taxi");
        }



    }
}

