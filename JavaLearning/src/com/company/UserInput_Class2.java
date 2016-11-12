package com.company;

import java.util.Scanner;

/**
 * Created by haote on 2016/11/12.
 */
public class UserInput_Class2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int myInt;
        String myString;
        double myDouble;
        boolean myBoolean;

        System.out.println("Input Int");
        myInt = scanner.nextInt();

        System.out.println("Input String");
        myString = scanner.next();

        System.out.println("Input double");
        myDouble = scanner.nextDouble();

        System.out.println("Input boolean");
        myBoolean = scanner.nextBoolean();

        System.out.println(myInt);
        System.out.println(myString);
        System.out.println(myDouble);
        System.out.println(myBoolean);
    }
}
