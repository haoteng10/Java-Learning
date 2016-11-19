package com.company;

import com.company.UserInput;

/**
 * Created by haote on 2016/11/19.
 */
public class TaxationEstimator {
    //Ask visitor name
    //Ask visitor income
    //Calculate his tax
    //Tax formula = {
    //    0 >= income <= 20000    10%
    //    20000 > income          20%
    //    }
    //Print out the result in a human readable way.
    //Hint: LOOK UP YOUR NOTE
    //Hint: Use Scanner to ask for user's input

    //Bonus: separate them in different function.


    public static String calculate(double income,String name){
        double tax = 0;

        if (income >= 0 && income <= 20000){
            tax = income / 10;
            return  name + ", " + "your tax is " + tax;
        }else if (income > 20000){
            tax = income / 5;
            return  name + ", " + "your tax is " + tax;
        }else{
            return name + ", your input is invalid" ;
        }
    }

    public static void main (String args[]){
        String name = UserInput.getString();
        Double income = UserInput.getDouble();

        System.out.println(calculate(income,name));
    }
}
