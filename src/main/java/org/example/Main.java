package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the buying price per share");
        double buyingPrice= scan.nextDouble();
        int Day= 1;
        DecimalFormat df= new DecimalFormat("0.00");

        while (true){
            System.out.println("Enter the closing price for the day"+Day+"(any negative value to leave)");

            double closingPrice =scan.nextDouble();

            if (closingPrice<0.0)break;
            double earning = closingPrice-buyingPrice;

            if (earning>0){

                System.out.println("After day"+Day +",you earned "+df.format(earning)+"Per share.");
            }
            else if (earning<0.00) {

                System.out.println("After day " + Day + ",you lost " + (-earning) + "Per share.");
            }
            else {

                System.out.println("After day"+Day+", you have"+"no earning");
            }

        }
            Day+=1;

        scan.close();

        }


    }
