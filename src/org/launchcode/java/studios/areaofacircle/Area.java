package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {


        double radius = 0;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        while (true) {
            if (!input.hasNextDouble()) {
                System.out.println("Sorry, your radius can't be a letter, negative number, or symbol.");
                break;
            }
            System.out.println("Enter a radius: ");
            //else if (input > 0) {
            //  System.out.println("Sorry, your radius can't be a letter, negative number, or symbol.");
            //  input.next();
            radius = input.nextDouble();
        }
        //radius = input.nextDouble();
        System.out.println("Thank you! Your radius is " + radius + " .");
        input.close();
        //}
        area = Circle.getArea(radius);

        System.out.println("The area of a circle of a radius of " + radius + " is " + area + " .");
        System.out.println("You know, you could do this yourself instead of being lazy. The formula is pi (3.14) times radius squared.");

    }
}