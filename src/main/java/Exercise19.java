/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */
import java.util.Scanner;
public class Exercise19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your weight in lbs: ");
        double weight = valid_number(scan);
        System.out.print("Please enter your height in inches: ");
        double height = valid_number(scan);
        double bmi = (weight / (height*height)) * 703;
        System.out.printf("Your bmi is %.2f\n",bmi);
        if(bmi < 18.5){
            System.out.print("You are underweight. You should see a doctor");
        }
        else if(bmi >25){
           System.out.print("You are overweight. You should see a doctor.");
        }
        else{
            System.out.print("You are in the ideal weight range.");
        }



    }
    public static double valid_number(Scanner scan){
        int x = 0;
        while (x == 0) {
            if (scan.hasNextDouble()) {
                double num = scan.nextDouble();
                x = 1;
                return num;
            }
            else{
                System.out.print("Please enter a valid number, try again \nEnter: ");
            }
            scan.nextLine();
        }
        return 1;
    }
}

