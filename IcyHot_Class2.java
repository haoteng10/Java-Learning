package com.company;

/**
 * Created by haote on 2016/11/12.
 */
public class IcyHot_Class2 {

    public static boolean icyHot(int left, int right){
        return  ((left < 0 && right > 100) ||  (right < 0 && left > 100));
    }



    public  static  void main (String args[]){
        System.out.println(icyHot(120,-1));
        System.out.println(icyHot(-1,120));
        System.out.println(icyHot(2,120));
    }
}
