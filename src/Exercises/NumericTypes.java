package Exercises;

import java.util.Scanner;
public class NumericTypes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle?");
        int length = input.nextInt();
        //input.close();

        Scanner input2 = new Scanner(System.in);
        System.out.println("What is the width of your rectangle?");
        int width = input2.nextInt();
        input.close();

        int areaOfRectangle = length * width;
        System.out.println("The area of your rectangle is " + areaOfRectangle + " .");

    }
}
