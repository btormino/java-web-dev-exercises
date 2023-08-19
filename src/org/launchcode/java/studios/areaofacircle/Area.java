package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args){

        double radius;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        input.close();

        area = Circle.getArea(radius);

        System.out.println("The area of a circle of a radius of " + radius + " is " + area + " .");
        System.out.println("You know, you could do this yourself instead of being lazy. The formula is pi (3.14) times radius squared.");

    }
}
