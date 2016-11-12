package com.company;

import sun.font.TrueTypeFont;

/**
 * Created by haote on 2016/11/12.
 */
public class CheckRange_Class2 {

    public static boolean within(int x, int y, int input){
        return  ((input > x && input < y) || (input > y && input < x));
    }

    public static void main(String args[]){
        System.out.println(within(10,1,5));
    }
}
