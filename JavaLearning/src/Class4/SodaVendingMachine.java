package Class4;

import kitku.UserInput;

import java.util.Scanner;

/**
 * Created by haote on 2016/11/26.
 */
public class SodaVendingMachine {

    public static double getMoneyFromCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert money:");
        return scanner.nextDouble();
    }

    public static void welcomeMessage(){
        System.out.println("Welcome to vending machine:");
        System.out.println("It's a hot day!");
    }

    public static void displayProduct(String[] name, double[] price){
        for (int i = 0; i < name.length; i++){
            System.out.println((i+1) + ". " + name[i] + " is $" + price[i]);
        }
    }

    public static int customerSelection(String[] name, double[] price){
        Scanner scanner = new Scanner(System.in);
        int result = -1;

        while (result < 1 || result > 2){
            displayProduct(name,price);
            System.out.println("Please make your selection:");
            result = scanner.nextInt();
        }
        return result-1;
    }


    public static boolean isEnoughMoney(double balance,int selection, double[] productPrice){
        return balance >= productPrice[selection];
    }

    public static void main(String args[]){

        double balance = 0;

        String[] productName = {"Coke","Orange Juice","Sprite"};
        double[] productPrice = {1.50,2,1.50};

        while (true){
            welcomeMessage();
            displayProduct(productName,productPrice);
            balance = getMoneyFromCustomer();

            int selection = customerSelection(productName,productPrice);

            //If there is enough money, give customer the product, and give money
            if (isEnoughMoney(balance,selection,productPrice)){
                Common.println("Here is your " + productName[selection]);
                Common.println("Your change is " + (balance - productPrice[selection]));
            }else{
                //else return the money
                Common.println("You don't have enough money,");
                Common.println("Your change is " + balance);
            }
        }


    }
}
