package com.company;

/**
 * Created by haote on 2016/11/12.
 */
public class FindAverage_Class2 {

    public static double findAverage(int left, int right){
        return  (left + right) / 2f;
    }

    public static void main(String args[]){
        int num1 = 100;
        int num2 = 151;

        double result = findAverage(num1,num2);
        System.out.println("The average is " + result);
    }

}

