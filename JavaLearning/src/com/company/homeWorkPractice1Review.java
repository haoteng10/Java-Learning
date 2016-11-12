package com.company;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by haote on 2016/11/12.
 */
public class homeWorkPractice1Review {
    public static void printBigger(double left, double right){
        if (left > right){
            System.out.println("The bigger number is " + left);
        }else if (right > left){
            System.out.println("The bigger number is " + right);
        }else{
            System.out.println("The number is equal.");
        }
    }

    public static int returnBigger(int left, int right){
        if (left > right){
            return  left;
        }else{
            return right;
        }
    }

    public static void main(String[] args) {
        int year = returnBigger(2016,2055);
        System.out.println(year);


    }
}

