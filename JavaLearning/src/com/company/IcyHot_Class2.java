package com.company;

/**
 * Created by haote on 2016/11/12.
 */
public class IcyHot_Class2 {

    public static boolean icyHot(int temp1, int temp2){
        return  ((temp1 < 0 && temp2 > 100) ||  (temp2 < 0 && temp1 > 100));
    }



    public  static  void main (String args[]){
        System.out.println(icyHot(120,-1));
        System.out.println(icyHot(-1,120));
        System.out.println(icyHot(2,120));
    }
}
