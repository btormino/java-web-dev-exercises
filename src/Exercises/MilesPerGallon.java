package Exercises;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        int milesDriven = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("How many gallons of gas have you consumed?");
        int gallonsConsumed = input2.nextInt();
        input.close();

        int milesPerGallon = milesDriven / gallonsConsumed;
        System.out.println("Your vehicle gets " + milesPerGallon + " miles per gallon.");
    }
}
