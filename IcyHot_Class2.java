package com.company;

/**
 * Created by haote on 2016/11/12.
 */
public class IcyHot_Class2 {

    public static boolean icyHot(int left, int right){
        boolean result = false;

        if (left < 0) {
            if (right > 100){
                result = true;
            }
        } else if (right < 0)
        {
            if (left > 100){
                result = true;
            }
        }
        return  result;
    }



    public  static  void main (String args[]){
        System.out.println(icyHot(120,-1));
        System.out.println(icyHot(-1,120));
        System.out.println(icyHot(2,120));
    }
}
