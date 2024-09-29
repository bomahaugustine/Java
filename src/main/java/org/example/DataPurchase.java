package org.example;

import java.util.Scanner;

public class DataPurchase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Select an Option");
            System.out.println("1 Exit");
            System.out.println("2 Buy 1GB Data");
            System.out.println("3 Buy 5GB Data");
            System.out.println("4 Buy 10Gb Data");
            System.out.println("5 Buy Unlimited");
            System.out.println("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            switch (choice){
                case 2:
                    System.out.println("You selected to buy 1GB Data. ");
                    break;
                case 3:
                    System.out.println("You selected to buy 5GB Data. ");
                    break;
                case 4:
                    System.out.println("You selected to buy 10GB Data. ");
                    break;
                case 5:
                    System.out.println("You selected to buy Unlimited Data. ");
                    break;
                case 1:
                    System.out.println("Exiting the program. ");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option (1-5).");
                    break;
            }
        }while (choice!=1);
        scanner.close();

    }
}
